package com.sunone.springboot.service.impl;


import com.sunone.springboot.entity.College;
import com.sunone.springboot.mapper.CollegeMapper;
import com.sunone.springboot.service.CollegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CollegeServiceImpl implements CollegeService {

    @Autowired
    CollegeMapper collegeMapper;
    @Override
    public void doSave(College college) {
        collegeMapper.doSave(college);
    }
}
