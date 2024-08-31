package top.ytazwc.cloud.controller;

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
public class UserController {

    @Value("${user.userServicePath}")
    private String userServicePath;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/{id}")
    public User findById(@PathVariable Long id) {
        // 远程调用制定地址 并传递参数 将返回结果解析为 User 实体类
        return restTemplate.getForObject(userServicePath + id, User.class);
    }

}
