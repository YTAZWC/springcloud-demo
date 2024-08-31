package top.ytazwc.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author 花木凋零成兰
 * @title Provider02Application
 * @date 2024-08-31 17:07
 * @package top.ytazwc.cloud
 * @description 服务提供者
 */
@SpringBootApplication
@EnableEurekaClient
public class Provider02Application {

    public static void main(String[] args) {
        SpringApplication.run(Provider02Application.class);
    }

}
