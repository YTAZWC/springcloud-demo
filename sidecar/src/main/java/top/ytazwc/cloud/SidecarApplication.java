package top.ytazwc.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.sidecar.EnableSidecar;
import org.springframework.web.bind.annotation.CrossOrigin;

/**
 * @author 花木凋零成兰
 * @title SidecarApplication
 * @date 2024-09-01 19:37
 * @package top.ytazwc.cloud
 * @description TODO
 */
@SpringBootApplication
@EnableSidecar
@CrossOrigin
public class SidecarApplication {
    public static void main(String[] args) {
        SpringApplication.run(SidecarApplication.class);
    }
}
