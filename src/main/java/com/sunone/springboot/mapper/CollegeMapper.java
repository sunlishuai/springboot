package com.sunone.springboot.mapper;


import com.sunone.springboot.entity.College;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CollegeMapper {
    @Insert("insert into college(cname,caddress,cpic,createtime) values({#cname},{#caddress},{#cpic},now())")
    void doSave(College college);
}
