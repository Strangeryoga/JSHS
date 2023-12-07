package com.stranger;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan (basePackages = "com.stranger")
@EnableAspectJAutoProxy
public class BeanConfig {
}
