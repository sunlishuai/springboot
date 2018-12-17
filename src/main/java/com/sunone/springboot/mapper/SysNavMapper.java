package com.sunone.springboot.mapper;

import com.sunone.springboot.entity.College;
import com.sunone.springboot.entity.SysNav;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

@Mapper
public interface SysNavMapper {

    @Insert("insert into admin_nav(parentId,text,href,state) values({#parentId},{#text},{#href},{#state})")
    int  add(SysNav sysNav);

    @Select("SELECT * FROM admin_nav where parentId= #{id}")
    List<Map<String, Object>> getAllNav(Long id);

    @Select("SELECT * FROM admin_nav ")
    List<Map<String,Object>> getNavs(Integer page, Integer rows);
}
