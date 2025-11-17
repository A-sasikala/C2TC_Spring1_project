package com.tnsif.employeeservice.Config;
//package com.tnsif.EmployeeService.config;

import org.springframework.context.annotation.Bean;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
public class AppConfig {

    // ✅ CORS configuration — allows your API to be accessed from other apps (like React or Angular)
    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
            	 registry.addMapping("/**")
                 .allowedOrigins("http://localhost:3000")
                 .allowedMethods("GET", "POST", "PUT", "DELETE");
            }
        };
    }
}
