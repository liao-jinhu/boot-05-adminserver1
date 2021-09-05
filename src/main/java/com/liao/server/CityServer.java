package com.liao.server;

import com.liao.pojo.City;
import com.liao.pojo.User2;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: liaojinhu
 * @Date: 2021/06/25/19:10
 * @Description:
 */
public interface CityServer {
    City getCity(int id);
    public void insert(City city);
}
