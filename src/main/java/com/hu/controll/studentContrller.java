package com.hu.controll;

import com.hu.model.PeActallot;
import com.hu.service.studentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by sirhu on 2018/6/10.
 */
@Controller
public class studentContrller {

    @Resource
    private studentService student;

    @RequestMapping("list")
    public @ResponseBody
    PeActallot selectList(Integer id){
        return student.selectList(id);

    }
}
