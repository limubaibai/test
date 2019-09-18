package com.leyou.config;

import com.leyou.interceptor.MyInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
public class InterceptorConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new MyInterceptor()).//配置拦截器
                addPathPatterns("/user/**").  //拦截路径
                excludePathPatterns("/user/hello1");//放行路径
    }
}
