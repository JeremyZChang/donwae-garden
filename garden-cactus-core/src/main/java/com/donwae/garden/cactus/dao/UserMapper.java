package com.donwae.garden.cactus.dao;

import com.donwae.garden.cactus.common.basic.BasicMapper;
import com.donwae.garden.cactus.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BasicMapper<User> {

    User queryOneByName(String username);

}
