package com.galaxy.gmall.usermanage.service;

import com.galaxy.gmall.usermanage.bean.UserInfo;

import java.util.List;

/**
 * @author 裴一飞
 * @date 2020/11/18 - 11:30
 */
public interface IUserInfoService {

    List<UserInfo> getUserInfoListAll();

    void addUser(UserInfo userInfo);

    void updateUser(UserInfo userInfo);

    void updateUserByName(String name, UserInfo userInfo);

    void delUser(UserInfo userInfo);

}
