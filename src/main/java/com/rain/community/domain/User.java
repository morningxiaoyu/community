package com.rain.community.domain;

import lombok.Data;

import java.util.Date;

/**
 * @author: rain
 * @description: 用户类
 * @date: 2021-11-05 22:23
 */
//已修改
@Data
public class User {

    private Integer id;
    private String username;
    private String password;
    private String salt;
    private String email;
    private Integer type;
    private Integer status;
    private String activationCode;
    private String headerUrl;
    private Date createTime;
}
