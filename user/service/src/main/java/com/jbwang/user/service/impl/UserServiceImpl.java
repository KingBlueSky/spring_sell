package com.jbwang.user.service.impl;

import com.jbwang.user.dataobject.UserInfo;
import com.jbwang.user.repository.UserInfoRepository;
import com.jbwang.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: jbwang0106
 * @description: impl
 * @create: 2018-06-02 17:03
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserInfoRepository userInfoRepository;

    @Override
    public UserInfo findByOpenid(String openid) {
        return userInfoRepository.findByOpenid(openid);
    }
}
