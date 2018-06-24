package com.hu.service;

import com.hu.model.sysRoleDao;
import com.hu.model.sysuserstabDao;

import java.util.List;

/**
 * Created by sirhu on 2018/6/11.
 */
public interface sysUsersTabService {

    /**
     * 用户登录查询
     *
     */
    public sysuserstabDao selectByFilter(sysuserstabDao sysDao);

    /**
     *  根据用户id查询用户的权限
     */
    public List<sysRoleDao> getRoleManager(String userid);


}
