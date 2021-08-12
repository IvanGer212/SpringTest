package com.geekbrains;

import com.geekbrains.configuration.AppConfiguration;
import com.geekbrains.context.service.ProductService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
    ProductService productService = context.getBean("productServiceImpl", ProductService.class);
    System.out.println(productService.getAll());
    context.close();
    }

}
