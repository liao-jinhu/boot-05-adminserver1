package com.liao.controller;

import com.liao.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: liaojinhu
 * @Date: 2021/06/23/12:14
 * @Description:
 */
@Controller
public class TableController {
    @GetMapping("/basic_table")
    public String basic_table(){
        return "tables/basic_table";
    }

    @GetMapping("/dynamic_table")
    public String dynamic_table(Model model){
        //表格内容的遍历(Arrays数组)
        List<User> users = Arrays.asList(new User("zhangsan", "123456"),
                new User("lisi", "123444"),
                new User("haha", "aaaaa"),
                new User("hehe ", "aaddd"));
        model.addAttribute("users",users);
        return "tables/dynamic_table";
    }

    @GetMapping("/responsive_table")
    public String responsive_table(){
        return "tables/responsive_table";
    }
    @GetMapping("/editable_table")
    public String editable_table(){
        return "tables/editable_table";
    }

}
