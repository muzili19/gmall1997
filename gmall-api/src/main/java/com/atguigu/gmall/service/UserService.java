package com.atguigu.gmall.service;

import com.atguigu.gmall.bean.UserInfo;

import java.util.List;
public interface UserService {
    public List<UserInfo> getUserInfoListAll();

    void addUser(UserInfo userInfo);
}
