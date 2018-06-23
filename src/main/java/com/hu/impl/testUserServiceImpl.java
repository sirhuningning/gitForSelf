package com.hu.impl;

import com.hu.mapper.testUserMapper;
import com.hu.model.testUser;
import com.hu.service.testUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by sirhu on 2018/6/20.
 */
@Service
public class testUserServiceImpl implements testUserService {

    @Resource
    private testUserMapper testuser;
    @Override
    public int insertEntry(testUser user) {
        return testuser.insert(user);
    }

    @Override
    public testUser selectByFilter(String username, String userpass) {
        return testuser.selectByFilter(username,userpass);
    }

    @Override
    public List<testUser> selectAll() {
        return testuser.selectAll();
    }
}
