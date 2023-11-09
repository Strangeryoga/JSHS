package org.spring_aop_demo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "org.spring_aop_demo")
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class BeanConfig {

}
