package top.ytazwc.cloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.ytazwc.cloud.pojo.User;

/**
 * @author 花木凋零成兰
 * @title UserController
 * @date 2024-08-31 17:06
 * @package top.ytazwc.user.entity.top.ytazwc.cloud.controller
 * @description 用户控制
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/{id}")
    public User findById(@PathVariable Long id) {
        User user = new User();
        user.setId(id);
        user.setUsername("2 Hello " + id);
        return user;
    }

}
