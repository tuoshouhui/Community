package com.tsh.springboot.interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Created by ttuos on 2019/9/17.
 */
@Configuration
//@EnableWebMvc
public class WebConfig implements WebMvcConfigurer{

    @Autowired
    private SessionInterceptor sessionInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry){
        //registry.addInterceptor(new ThemeChangeInterceptor()).addPathPatterns("/**").excludePathPatterns("/admin/**");
        //("/**")需要要被处理，("/admin/**")不需要被处理
        registry.addInterceptor(sessionInterceptor).addPathPatterns("/**");
    }
}
