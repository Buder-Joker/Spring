package com.ming.service;

import com.ming.po.User;

import java.util.List;

public interface UserService {

    public List<User> queryUserListService() throws Exception;

    public List<User> queryUserByIdService(int id) throws Exception;
}
