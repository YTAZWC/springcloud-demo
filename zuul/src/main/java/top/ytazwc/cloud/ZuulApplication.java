package top.ytazwc.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author 花木凋零成兰
 * @title ZuulApplication
 * @date 2024-09-01 14:48
 * @package top.ytazwc.cloud
 * @description Zuul 路由 启动类
 */
@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy    // 开启Zuul路由代理
public class ZuulApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication.class);
    }
}
