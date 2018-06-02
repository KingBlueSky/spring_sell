package com.jbwang.user.repository;

import com.jbwang.user.dataobject.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author: jbwang0106
 * @description: user repository
 * @create: 2018-06-02 16:59
 **/
public interface UserInfoRepository extends JpaRepository<UserInfo, String> {

    UserInfo findByOpenid(String openid);
}
