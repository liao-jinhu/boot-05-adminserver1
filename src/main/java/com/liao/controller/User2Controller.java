package com.liao.controller;

import com.liao.dao.CityDao;
import com.liao.pojo.City;
import com.liao.pojo.User2;
import com.liao.server.CityServer;
import com.liao.server.User2Server;
import org.junit.runners.Parameterized;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: liaojinhu
 * @Date: 2021/06/25/16:17
 * @Description:
 */


@Controller

public class User2Controller {
    @Autowired
    User2Server user2Server;

    @ResponseBody
    @GetMapping("/user2")
    //RequestParam 请求参数
    public  User2  getUser2(@RequestParam("id") int id){

        return this.user2Server.getUser2(id);
    }


    @Autowired
    CityServer cityServer;
    @ResponseBody
    @RequestMapping("/city")
    public City getCity(@RequestParam("id") int id){
        return this.cityServer.getCity(id);
    }

    @PostMapping("/city")
    public void  saveCity(City city){
        this.cityServer.insert(city);
    }

}
