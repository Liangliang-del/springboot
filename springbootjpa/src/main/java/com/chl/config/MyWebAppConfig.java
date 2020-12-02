package com.chl.config;

import com.chl.interceptors.MyInterceptorOne;
import com.chl.interceptors.MyInterceptorTwo;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

public class MyWebAppConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 重写addInterceptors方法并为拦截器配置拦截规则
        registry.addInterceptor(new MyInterceptorOne()).addPathPatterns("/**");
        registry.addInterceptor(new MyInterceptorTwo()).addPathPatterns("/**");
        //排除路径
        //registry.addInterceptor(new MyInterceptor2()).addPathPatterns("/**").excludePathPatterns("/Hello");
        super.addInterceptors(registry);
    }
}
