package com.hu.impl;

import com.hu.mapper.sysuserstabDaoMapper;
import com.hu.model.sysRoleDao;
import com.hu.model.sysuserstabDao;
import com.hu.service.sysUsersTabService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by sirhu on 2018/6/11.
 */
@Service
public class sysUsersTabServiceImpl  implements sysUsersTabService {
    @Resource
    private sysuserstabDaoMapper sysUserMapper;


    @Override
    public sysuserstabDao selectByFilter(sysuserstabDao sysDao) {

        sysuserstabDao sysuserstabDao = sysUserMapper.selectByFilter(sysDao);

        return sysuserstabDao;
    }

    @Override
    public List<sysRoleDao> getRoleManager(String userid) {
        return  sysUserMapper.getRoleManager(userid);
    }

}
