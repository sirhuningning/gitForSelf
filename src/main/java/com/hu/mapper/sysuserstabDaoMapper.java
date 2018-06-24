package com.hu.mapper;

import com.hu.model.sysRoleDao;
import com.hu.model.sysuserstabDao;
import java.util.List;

public interface sysuserstabDaoMapper {



     sysuserstabDao selectByFilter(sysuserstabDao sysDao);


     List<sysRoleDao> getRoleManager(String userid);
}