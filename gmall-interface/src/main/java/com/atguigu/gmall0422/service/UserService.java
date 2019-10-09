package com.atguigu.gmall0422.service;



import com.atguigu.gmall0422.bean.UserAddress;
import com.atguigu.gmall0422.bean.UserInfo;

import java.util.List;


public interface UserService {

    //查询所有数据
   List<UserInfo> findAll();

   //根据用户输入条件查询数据
    List<UserInfo> findByUserInfo(UserInfo userInfo);

    //loginName做模糊查询
    List<UserInfo> findByLoginName(String loginName);

    //添加用户信息
    void addUserInfo(UserInfo userInfo);

    //修改用户信息
    void updateUser(UserInfo userInfo);

    //根据用户输入条件删除
    void deleteUser(UserInfo userInfo);

    //根据userId查询用户地址列表
    List<UserAddress> findUserAddressByUserId(String userId);
}
