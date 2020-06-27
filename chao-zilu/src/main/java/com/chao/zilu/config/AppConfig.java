package com.chao.zilu.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.chao.zilu")
@EnableAspectJAutoProxy(proxyTargetClass = false)
public class AppConfig {



}
