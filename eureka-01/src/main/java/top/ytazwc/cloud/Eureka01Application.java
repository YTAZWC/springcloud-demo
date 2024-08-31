package top.ytazwc.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author 花木凋零成兰
 * @title Eureka01Application
 * @date 2024-08-31 19:14
 * @package top.ytazwc.cloud
 * @description Eureka 注册中心启动类
 */
@EnableEurekaServer
@SpringBootApplication
public class Eureka01Application {
    public static void main(String[] args) {
        SpringApplication.run(Eureka01Application.class);
    }
}
