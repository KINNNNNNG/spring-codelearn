package com.learn.spring.context.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Classname ContextConfig
 * @Description TODO
 * @Date 2020/5/19 23:35
 * @Author Wk
 * @Version 1.0
 */
@Configurable
@ComponentScan("com.learn.spring.context.**")
public class ContextConfig {
}
