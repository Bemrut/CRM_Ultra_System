package org.itstep.j2_16.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc /*  <mvc:annotation-driven />*/
@ComponentScan(basePackages = "org.itstep.j2_16")  /* <context:component-scan base-package="org.itstep.j2_16" />*/
public class ApplicationConfig {

}
