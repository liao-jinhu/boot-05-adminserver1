package com.liao.dao;

import com.liao.pojo.City;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: liaojinhu
 * @Date: 2021/06/25/19:08
 * @Description:
 */
@Mapper
public interface CityDao {
    @Select("select * from city where id=#{id}")
    public City getCity(int id);

   public void insert(City city);
}
