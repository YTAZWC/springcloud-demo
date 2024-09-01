package top.ytazwc.cloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import top.ytazwc.cloud.pojo.User;
import top.ytazwc.cloud.service.UserService;

/**
 * @author 花木凋零成兰
 * @title UserController
 * @date 2024-08-31 21:52
 * @package top.ytazwc.cloud.controller
 * @description
 */
@RestController
@Slf4j
public class UserController {

    @Qualifier("top.ytazwc.cloud.service.UserService")
    @Autowired
    private UserService userService;

    @GetMapping("/test")
    public User sayHi(@RequestParam Long id) {
        log.warn("Feign Test");
        return userService.getUserById(id);
    }

    @GetMapping("/test2")
    public User sayHi2(@RequestParam Long id) {
        return userService.getUserById2(id);
    }

    @GetMapping("/test3")
    public User sayHi3(@RequestParam Long id) {
        User user = new User();
        user.setId(id);
        user.setUsername("test");
        return userService.addUser(user);
    }

}
