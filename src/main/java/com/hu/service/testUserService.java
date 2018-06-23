package com.hu.service;

import com.hu.model.testUser;

import java.util.List;

/**
 * Created by sirhu on 2018/6/20.
 */
public interface testUserService {

    public int insertEntry(testUser user);

    public testUser selectByFilter(String username,String userpass);

    List<testUser> selectAll();
}
