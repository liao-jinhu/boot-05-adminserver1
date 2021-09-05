package com.liao.server.impl;

import com.liao.dao.CityDao;
import com.liao.pojo.City;
import com.liao.pojo.User2;
import com.liao.server.CityServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: liaojinhu
 * @Date: 2021/06/25/19:11
 * @Description:
 */
@Service
public class CityServerImpl implements CityServer {

    @Resource
    CityDao cityDao;

    @Override
    public City getCity(int id) {
        return cityDao.getCity(id);
    }

    @Override
    public void insert(City city) {
        cityDao.insert(city);
    }
}
