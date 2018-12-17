package com.sunone.springboot.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class SysNavDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Map<String, Object>>  getAllNav(Long id){
        return jdbcTemplate.queryForList("SELECT * FROM admin_nav where parentId= ?",id);
    }

    public List<Map<String, Object>> getNavs(Integer page, Integer rows) {

        return null;
    }
}
