package com.Portfolio;

import com.Portfolio.Model.Role;
import com.Portfolio.Model.User;
import com.Portfolio.Service.UserService;
import java.util.ArrayList;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class PortfolioApplication {

	public static void main(String[] args) {
		SpringApplication.run(PortfolioApplication.class, args);
	}
                
                @Bean
        	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**").allowedHeaders("*").allowedMethods("*").allowedOrigins("http://localhost:4200");
			}
		};
	}
                
                @Bean
                PasswordEncoder passwordEncoder() {
                    return new BCryptPasswordEncoder();
                }
                
                @Bean
                CommandLineRunner run (UserService userService) {
                    return args -> {
                    userService.saveRole(new Role(null, "ROLE_USER"));
                    userService.saveRole(new Role(null, "ROLE_ADMIN"));
                    
                    userService.saveUser(new User(null, "admin", "nosoyadmin123", new ArrayList<>() ));
                    
                    userService.addRoleToUser("admin", "ROLE_ADMIN");
                    
                    };
                }
                
                
                
                
                
                
}
