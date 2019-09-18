package com.leyou.mapper;

import com.leyou.pojo.User;
import tk.mybatis.mapper.common.Mapper;


public interface UserMapper extends Mapper<User> {
    //public User findById(Long id);  通用mapper  不用自己定义
}
