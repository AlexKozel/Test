package com.mastery.java.task.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class AppConfiguration implements WebMvcConfigurer
{
    public void addViewControllers( ViewControllerRegistry registry ) {
        registry.addViewController( "/" ).setViewName( "main" );
        registry.addViewController( "/main" ).setViewName( "main" );
        registry.addViewController(  "/greeting").setViewName( "greeting" );
        registry.addViewController(  "/login").setViewName( "login" );
    }
}
