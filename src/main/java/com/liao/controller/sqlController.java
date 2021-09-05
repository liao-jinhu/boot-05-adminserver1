package com.liao.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: liaojinhu
 * @Date: 2021/06/25/13:11
 * @Description:
 */

@Controller
@ResponseBody
@SpringBootTest
@Slf4j
public class sqlController {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @GetMapping("/sql")
    public String tosql() {
        Long aLong = jdbcTemplate.queryForObject("select count(*) from user", Long.class);
        log.info("记录总数：{}", aLong);
        return "sLong";
    }
}
