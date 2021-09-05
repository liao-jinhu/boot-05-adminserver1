package com.liao.servlet;

import lombok.extern.slf4j.Slf4j;
import javax.servlet.*;
import java.io.IOException;


/**
 * Created with IntelliJ IDEA.
 *
 * @Author: liaojinhu
 * @Date: 2021/06/25/9:37
 * @Description:
 */
@Slf4j
//@WebFilter(urlPatterns={"/css/*","/images/*"}) //my
public class MyFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        log.info("MyFilter初始化完成");
    }
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        log.info("MyFilter工作");
        chain.doFilter(request,response);
    }
    @Override
    public void destroy() {
        log.info("MyFilter销毁");
    }
}
