package com.cos.security1.config;

import org.springframework.boot.web.servlet.view.MustacheViewResolver;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer{
	
	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
	MustacheViewResolver resolve = new MustacheViewResolver();
	resolve.setCharset("UTF-8");
	resolve.setContentType("text/html; charset=UTF-8");
	resolve.setPrefix("classpath:/templates/");
	resolve.setSuffix(".html");
	
	registry.viewResolver(resolve);
	}
}
