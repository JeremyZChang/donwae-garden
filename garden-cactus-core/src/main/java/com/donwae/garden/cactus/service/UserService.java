package com.donwae.garden.cactus.service;

import com.donwae.garden.cactus.common.basic.BasicService;
import com.donwae.garden.cactus.entity.User;

/**
 * User Service
 * @auther Jeremy
 * 2018/10/29 下午1:28
 */
public interface UserService extends BasicService<User> {

    /**
     * 根据Name查询User
     * 下午3:33 2018/10/30
     * @author Jeremy
     */
    User getUserByName(String name);

}
