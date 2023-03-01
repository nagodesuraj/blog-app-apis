package com.surajproject.blog;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Component;


@SpringBootApplication
public class BlogAppApisApplication {

	public static void main(String[] args) {
		SpringApplication.run(BlogAppApisApplication.class, args);
	}

	@Bean
	public ModelMapper modelMapper() {
		
		return new ModelMapper();
		
		
	}
	
	@Autowired
	private UserDetailsService userDetailsService;

	@Bean
	public UserDetailsService userDetailsService() {
	    return userDetailsService();
	}
	
}
