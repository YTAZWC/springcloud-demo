package top.ytazwc.cloud.controller;

import org.springframework.web.bind.annotation.*;
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
        user.setUsername("provider 02 Hello " + id);
        return user;
    }

    @GetMapping
    public User findById2(Long id) {
        User user = new User();
        user.setId(id);
        user.setUsername("provider 02 user Hello " + id);
        return user;
    }

    @PostMapping("/add")
    public User insert(@RequestBody User user) {
        user.setId(123L);
        user.setUsername("provider 02 user post");
        return user;
    }

}
