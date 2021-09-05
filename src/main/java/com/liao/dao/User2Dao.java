package com.liao.dao;

import com.liao.pojo.User2;
import lombok.Data;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: liaojinhu
 * @Date: 2021/06/25/16:02
 * @Description:
 */
@Mapper
public interface User2Dao  {
     User2 getUser2(int id);
}
