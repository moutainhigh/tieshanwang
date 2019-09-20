package com.tieshan.api.config;

import com.tieshan.api.interceptor.chebaofeiInterceptor.v1.UserLoginHandlerInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author ningrz
 * @version 1.0
 * @date 2019/9/19 10:43
 */
@Configuration
public class WebConfigurer implements WebMvcConfigurer {

    @Autowired
    UserLoginHandlerInterceptor userLoginHandlerInterceptor;

    // 这个方法是用来配置静态资源的，比如html，js，css，等等
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
    }

    // 这个方法用来注册拦截器，我们自己写好的拦截器需要通过这里添加注册才能生效
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(userLoginHandlerInterceptor).addPathPatterns("/**").excludePathPatterns("/carscraporder-applet/account/doLogin", "/carscraporder-applet/account/doRegister");
    }

}