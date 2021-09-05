package com.liao;

import lombok.extern.slf4j.Slf4j;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootTest
@Slf4j
class Boot05Adminserver1ApplicationTests {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Test
    void contextLoads() {
//        jdbcTemplate.queryForObject("select * from account_tbl")
//        jdbcTemplate.queryForList("select * from account_tbl",)
        Long aLong = this.jdbcTemplate.queryForObject("select count(*) from user", Long.class);
        String username = this.jdbcTemplate.queryForObject("select username from user  ", String.class);
        log.info("记录总数：{}", aLong);
        log.info("username:{}", username);

    }


}
