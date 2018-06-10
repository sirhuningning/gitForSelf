package com.hu.impl;

import com.hu.mapper.PeActallotMapper;
import com.hu.model.PeActallot;
import com.hu.service.studentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by sirhu on 2018/6/10.
 */
@Service
public class studentServiceImpl implements studentService {
    @Resource
    private PeActallotMapper peActallotMapper;

    public PeActallot selectList(Integer id) {
        id=355;
        PeActallot peActallot = peActallotMapper.selectByPrimaryKey(id);
        return peActallot;

    }
}
