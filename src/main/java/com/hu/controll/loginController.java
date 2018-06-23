package com.hu.controll;

import com.hu.impl.sysUsersTabServiceImpl;
import com.hu.model.testUser;
import com.hu.service.testUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by sirhu on 2018/6/11.
 */
@Controller
public class loginController {
    private static Logger logger = LoggerFactory.getLogger(loginController.class);
    @Resource /** 根据名字注入*/
    private sysUsersTabServiceImpl sysUserTab;
    @Autowired
    private testUserService UserController;
    @RequestMapping("login")
    public void   selectLogin(testUser testUser , HttpServletResponse response,ModelAndView model){
//        sysuserstabDao sysuserstabDao = sysUserTab.selectByFilter(sysUser);
//        List<sysRoleDao> roleManager = new ArrayList<sysRoleDao>();
//        if(sysuserstabDao != null){
//            if(sysuserstabDao.getId() >0 ){
//                //获取角色的权限
//                roleManager = sysUserTab.getRoleManager(String.valueOf(sysuserstabDao.getId()));
//            }
//        }
//        try {
//            response.getWriter().print(JSON.toJSONString(roleManager));
//        }catch (Exception  e){
//            logger.error("获取权限角色输出异常入参：{}",e);
//        }
            List<testUser> testUserList = new ArrayList<testUser>();
            if(testUser != null){
                testUser testUser1 = UserController.selectByFilter(testUser.getUsername(), testUser.getUserpass());
                if(testUser != null){
                    int i = UserController.insertEntry(testUser);
                    if(i > 0){

                        model.addObject("user",)
                    }
                }

            }
            model.addObject("list",testUserList);

    }
}
