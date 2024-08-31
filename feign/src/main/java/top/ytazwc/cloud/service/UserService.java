package top.ytazwc.cloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;
import top.ytazwc.cloud.pojo.User;

/**
 * @author 花木凋零成兰
 * @title UserService
 * @date 2024-08-31 21:46
 * @package top.ytazwc.cloud.service
 * @description 用户接口
 */
@FeignClient(value = "SERVICE-PROVIDER")    // 配置调用的服务
public interface UserService {
    // 当前Service将请求发送出去 value对应服务的controller地址
    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    User getUserById(@PathVariable(value = "id") Long id);

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    User getUserById2(@RequestParam(value = "id") Long id);

    @RequestMapping(value = "user/add", method = RequestMethod.POST)
    User addUser(@RequestBody User user);
}
