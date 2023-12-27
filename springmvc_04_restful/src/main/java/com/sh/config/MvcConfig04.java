package com.sh.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @Author: SH
 * @Date: 2023/12/24 21:18
 */

@Configuration
@ComponentScan("com.sh.controller")
@EnableWebMvc
public class MvcConfig04 {


}
