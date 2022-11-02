package com.ssafy.config;

import java.util.concurrent.TimeUnit;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.CacheControl;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@MapperScan(basePackages = { "com.ssafy.**.mapper" })
public class WebMvcConfiguration implements WebMvcConfigurer {

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/**").addResourceLocations("classpath:/templates/")
				.setCacheControl(CacheControl.maxAge(10, TimeUnit.MINUTES));
	}

}
