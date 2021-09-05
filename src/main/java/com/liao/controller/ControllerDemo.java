package com.liao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: liaojinhu
 * @Date: 2021/08/31/0:24
 * @Description:
 */
@Controller
public class ControllerDemo {
    @RequestMapping("/hello")
    public String toHello(){
        return "hello";
    }
}
