package top.ytazwc.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author 花木凋零成兰
 * @title FeignApplication
 * @date 2024-08-31 21:45
 * @package top.ytazwc.cloud
 * @description Feign 启动类
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients // 启用 Feign
public class FeignApplication {
    public static void main(String[] args) {
        SpringApplication.run(FeignApplication.class);
    }
}
