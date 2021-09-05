package com.liao.config;

import com.liao.interceptor.LoginInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: liaojinhu
 * @Date: 2021/06/24/15:35
 * @Description:
 */
public class AdminWebConfig  implements WebMvcConfigurer {
    /**
     * 1、编写一个拦截器实现HandlerInterceptor接口
     * 2、拦截器注册到容器中（实现WebMvcConfigurer的addInterceptors）
     * 3、指定拦截规则【如果是拦截所有，静态资源也会被拦截】
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginInterceptor())
                .addPathPatterns("/**"). //拦截所有
                excludePathPatterns("/css/**,/fonts/**,/images/**,/js/**");  //放行

    }
}
