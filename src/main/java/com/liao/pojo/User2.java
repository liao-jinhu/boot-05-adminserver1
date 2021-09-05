package com.liao.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: liaojinhu
 * @Date: 2021/06/25/15:52
 * @Description:
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User2 {
    private int id;
    private String username;
    private String password;
    private String job;
    private String phone;


}
