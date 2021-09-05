package com.liao.server.impl;

import com.liao.dao.CityDao;
import com.liao.dao.User2Dao;
import com.liao.pojo.City;
import com.liao.pojo.User2;
import com.liao.server.User2Server;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: liaojinhu
 * @Date: 2021/06/25/15:58
 * @Description:
 */

@Service
public class User2SerperImpl implements User2Server {
    @Resource
    User2Dao user2Dao;

    @Override
    public User2 getUser2(int id) {
        return user2Dao.getUser2(id);
    }

}
