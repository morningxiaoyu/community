package com.rain.community.mapper;

import com.rain.community.domain.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author: rain
 * @description: todo
 * @date: 2021-11-05 22:26
 */
@Mapper
public interface UserMapper {

    /**
     * @author: rain
     * @date: 2021/11/6 20:34
     * @description: 根据用户编号查询用户信息
     * @param: [id]
     * @return: com.rain.community.domain.User
     */
    User selectUserById(Integer id);
}
