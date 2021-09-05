package com.liao.controller;

import com.liao.pojo.User;
import com.liao.server.User2Server;
import com.liao.server.impl.User2SerperImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: liaojinhu
 * @Date: 2021/06/22/22:47
 * @Description:
 */

@Controller
public class UserController {
    //@GetMapping是一个组合注解，是@RequestMapping(method = RequestMethod.GET)的缩写
    @GetMapping({"/", "/login"})
    public String login() {
        return "login";
    }

    //@PostMapping是一个组合注解，是@RequestMapping(method = RequestMethod.POST)的缩写
    @PostMapping("/main")
    public String toindex(User user, HttpSession session, Model model) {

        if (StringUtils.hasLength(user.getUserName()) && "123456".equals(user.getPassword())) {
            //把登陆成功的用户保存起来
            session.setAttribute("loginUser", user);
            //登录成功重定向到main.html;  重定向防止表单重复提交
            return "redirect:/index.html";
        } else {
            model.addAttribute("msg", "账号密码错误");
            //回到登录页面
            return "login";
        }

    }

    @GetMapping("/index.html")
    public String index(HttpSession session, Model model) {
        // 是否登录。  拦截器，过滤器
/*
        Object loginUser = session.getAttribute("loginUser");
        if(loginUser != null){
            return "index";
        }else {
            //回到登录页面
            model.addAttribute("msg","请重新登录");
            return "login";
        }
*/
        return "index";
    }





}
