package top.ytazwc.cloud.service.fallback;

import org.springframework.stereotype.Component;
import top.ytazwc.cloud.pojo.User;
import top.ytazwc.cloud.service.UserService;

/**
 * @author 花木凋零成兰
 * @title UserServiceFallback
 * @date 2024-08-31 22:58
 * @package top.ytazwc.cloud.service.fallback
 * @description 当服务提供者宕机时 请求失败提示错误信息的方法
 */
@Component
public class UserServiceFallback implements UserService {
    @Override
    public User getUserById(Long id) {
        User user = new User();
        user.setId(id);
        user.setUsername("error info");
        return user;
    }

    @Override
    public User getUserById2(Long id) {
        User user = new User();
        user.setId(id);
        user.setUsername("error info");
        return user;
    }

    @Override
    public User addUser(User user) {
        user.setUsername("error info");
        return user;
    }
}
