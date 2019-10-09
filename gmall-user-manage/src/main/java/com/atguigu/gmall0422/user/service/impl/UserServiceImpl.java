package com.atguigu.gmall0422.user.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.atguigu.gmall0422.bean.UserAddress;
import com.atguigu.gmall0422.bean.UserInfo;
import com.atguigu.gmall0422.service.UserService;
import com.atguigu.gmall0422.user.mapper.UserAddressMapper;
import com.atguigu.gmall0422.user.mapper.UserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserInfoMapper userInfoMapper;
    @Autowired
    private UserAddressMapper userAddressMapper;
    @Override
    public List<UserInfo> findAll() {
        return userInfoMapper.selectAll();
    }

    @Override
    public List<UserInfo> findByUserInfo(UserInfo userInfo) {
        return null;
    }

    @Override
    public List<UserInfo> findByLoginName(String loginName) {
        return null;
    }

    @Override
    public void addUserInfo(UserInfo userInfo) {

    }

    @Override
    public void updateUser(UserInfo userInfo) {

    }

    @Override
    public void deleteUser(UserInfo userInfo) {

    }

    @Override
    public List<UserAddress> findUserAddressByUserId(String userId) {
        UserAddress userAddress=new UserAddress();
        userAddress.setUserId(userId);
        return userAddressMapper.select(userAddress);

    }
}
