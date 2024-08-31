package top.ytazwc.cloud.config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author 花木凋零成兰
 * @title SecurityConfig
 * @date 2024-08-31 20:30
 * @package top.ytazwc.cloud.config
 * @description 安全配置
 */
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // 禁用CSRF保护。在Spring Security中，默认情况下，CSRF保护是启用的，以防止网站遭受跨站请求伪造攻击
        http.csrf().disable();
        super.configure(http);
    }
}
