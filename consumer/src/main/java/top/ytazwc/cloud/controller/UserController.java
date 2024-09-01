package top.ytazwc.cloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import top.ytazwc.cloud.pojo.User;

/**
 * @author 花木凋零成兰
 * @title UserController
 * @date 2024-08-31 17:12
 * @package top.ytazwc.cloud.controller
 * @description 用户控制器
 */
@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {

    @Value("${user.userServicePath}")
    private String userServicePath;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/{id}")
    @HystrixCommand(fallbackMethod = "error")
    public User findById(@PathVariable Long id) {
        log.warn("consumer findById");
        // 远程调用制定地址 并传递参数 将返回结果解析为 User 实体类
        return restTemplate.getForObject(userServicePath + id, User.class);
    }

    @GetMapping("/test")
    public String findUser() {
        return restTemplate.getForObject("http://server-sidecar/userinfo.json", String.class);
    }

    // 响应失败时 执行的方法
    // 提供错误信息的方法 与controller方法有同样地参数
    public User error(Long id) {
        User user = new User();
        user.setId(id);
        user.setUsername("null error");
        return user;
    }

}
