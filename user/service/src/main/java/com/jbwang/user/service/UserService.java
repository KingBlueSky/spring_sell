package com.jbwang.user.service;

import com.jbwang.user.dataobject.UserInfo;

/**
 * @author: jbwang0106
 * @description: user service
 * @create: 2018-06-02 17:02
 **/
public interface UserService {

    UserInfo findByOpenid(String openid);
}
