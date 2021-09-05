package com.liao.interceptor;

import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: liaojinhu
 * @Date: 2021/06/24/15:18
 * @Description:
 */
@Slf4j
public class LoginInterceptor implements HandlerInterceptor {
    /**
     * @Description: 目标方法执行之前
     * @Param: [request, response, handler]
     * @return: boolean
     * @Author: liaojinhu
     * @Date: 2021/6/24
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String requestURI = request.getRequestURI();
        log.info("preHandle拦截的请求路径是{}",requestURI);

        HttpSession session = request.getSession();
        Object loginUser = session.getAttribute("loginUser");
        if (loginUser != null) {
            return true;
        }
        //拦截住。未登录。跳转到登录页
        request.setAttribute("msg", "请先登录");
        //  re.sendRedirect("/");
        request.getRequestDispatcher("/").forward(request, response);
        return false;
    }


    /**
     * @Description: 目标执行写成后
     * @Param: [request, response, handler, modelAndView]
     * @return: void
     * @Author: liaojinhu
     * @Date: 2021/6/24
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        log.info("postHandle执行{}",modelAndView);
    }


    /**
     * @Description: 页面渲染以后
     * @Param: [request, response, handler, ex]
     * @return: void
     * @Author: liaojinhu
     * @Date: 2021/6/24
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        log.info("afterCompletion执行异常{}",ex);
    }
}
