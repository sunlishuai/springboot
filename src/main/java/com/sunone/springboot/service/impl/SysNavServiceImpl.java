package com.sunone.springboot.service.impl;

import com.sunone.springboot.mapper.SysNavMapper;
import com.sunone.springboot.service.SysNavService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class SysNavServiceImpl implements SysNavService {
    @Autowired
    SysNavMapper sysNavMapper;
    @Override
    public List<Map<String, Object>> getAllNav(Long id) {
        System.out.println("-----sysNavMapper------ is null"+ sysNavMapper );
        return sysNavMapper.getAllNav(id);
    }

    @Override
    public List<Map<String, Object>> getNavs(Integer page, Integer rows) {
        return sysNavMapper.getNavs(page,rows);
    }
}
