package com.example.demo.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import org.springframework.context.annotation.Bean;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;


@Configuration
public class WebConfig implements WebMvcConfigurer{
//    @Bean
//    public WebMvcConfigurer corsConfig() {
//        return new WebMvcConfigurer() {
//            @Override
//            public void addCorsMappings(CorsRegistry registry) {
//                registry.addMapping("/api/v1/**")
//                        .allowedOrigins("http://localhost:4200") // Adjust the origin to match your Angular app's URL
//                        .allowedMethods("*")
//                        .allowedHeaders("*") // Add allowed headers if needed
//                        .allowCredentials(true);
//            }
//        };
//    }
//    @Bean
//    public CorsFilter corsFilter() {
//        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
//        CorsConfiguration config = new CorsConfiguration();
//
//        // Allow requests from the specified origin (replace with your Angular app's URL)
//        config.addAllowedOrigin("http://localhost:4200");
//        config.addAllowedHeader("*");
//        config.addAllowedMethod("*");
//        config.setAllowCredentials(true);
//
//        source.registerCorsConfiguration("/**", config);
//        return new CorsFilter(source);
//    }
        @Override
        public void addCorsMappings(CorsRegistry registry) {
            registry.addMapping("/api/v1/**")
                    .allowedOrigins("http://localhost:4200")
                    .allowedMethods("*")
                    .allowedHeaders("*")
                    .allowCredentials(true);
        }
}