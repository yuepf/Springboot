package com.yuepf.sportplay.util;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
//全局配置类--配置跨域请求
@Configuration//作用于全局
public class WebConfig extends WebMvcConfigurerAdapter {

    @Override//跨域配置类
    public void addCorsMappings(CorsRegistry registry){
        registry.addMapping("/**")/*这里指访问什么跨域 （/**任何东西）*/
                .allowedOrigins("Http://localhost:8080","null")/*请求来源*/
                .allowedMethods("GET","POST","PUT","OPTIONS","DELETE")/*跨域方法*/
                .allowCredentials(true)/*是否允许携带信息：true*/
                .maxAge(3600);//最大响应时间
    }
}
