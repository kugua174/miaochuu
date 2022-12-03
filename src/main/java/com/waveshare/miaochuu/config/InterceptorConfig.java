package com.waveshare.miaochuu.config;

import com.waveshare.miaochuu.interceptor.AccessTimesInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author WENXUAN WANG
 */
@Configuration
public class InterceptorConfig implements WebMvcConfigurer {

    @Autowired
    AccessTimesInterceptor accessTimesInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(new UserMsgInterceptor()).
//                addPathPatterns("/**").
//                excludePathPatterns("/main0/login", "/");
        registry.addInterceptor(accessTimesInterceptor).
                addPathPatterns("/**");
    }

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("http://localhost:8080")
                .allowCredentials(true);
    }
}
