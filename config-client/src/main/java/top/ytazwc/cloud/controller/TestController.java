package top.ytazwc.cloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 花木凋零成兰
 * @title TestController
 * @date 2024-09-01 16:32
 * @package top.ytazwc.cloud.controller
 * @description 测试配置文件读取
 */
@RestController
@RequestMapping("/test")
public class TestController {

    // 获取配置文件参数
    @Value("${profile}")
    private String profile;

    @GetMapping
    public String test() {
        return profile;
    }

}
