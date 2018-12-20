package com.donwae.garden.cactus.service.impl;

import com.donwae.garden.cactus.common.exception.DonwaeException;
import com.donwae.garden.cactus.dao.UserMapper;
import com.donwae.garden.cactus.entity.User;
import com.donwae.garden.cactus.entity.enums.ErrorEnums;
import com.donwae.garden.cactus.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * TODO User Service
 * @auther Jeremy
 * 2018/10/29 下午1:29
 */
@Service
public class UserServiceImpl implements UserService {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private UserMapper userMapper;

    /**
     * 根据用户Name查询User
     * 下午3:41 2018/10/30
     * @author Jeremy
     * @param name
     * @return com.donwae.garden.cactus.entity.User
     **/
    @Override
    public User getUserByName(String name) {
        User user = userMapper.queryOneByName(name);

        if(user == null)
            throw new DonwaeException(ErrorEnums.NONE_USER_NAME_OR_PASSWORD, name);

        return user;
    }

    @Override
    public void updateOne(User entity) {

    }

    @Override
    public User getOneById(String id) {
        User user = userMapper.queryOne(id);

        if(user == null)
            throw new DonwaeException(ErrorEnums.NONE_USER_ID, id);

        return user;
    }

    @Override
    public User addOne(User entity) {
        return null;
    }
}
