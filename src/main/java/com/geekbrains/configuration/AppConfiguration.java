package com.geekbrains.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ComponentScan;

@Configuration
@ComponentScan({"com.geekbrains.context.repository", "com.geekbrains.context.service"})
public class AppConfiguration {
}
