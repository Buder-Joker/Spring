package com.ming.mapper;

import com.ming.po.User;

import java.util.List;

public interface UserMapper {


    public List<User> queryUserList() throws Exception;

    public List<User> queryUserById(int id) throws Exception;

}
