package com.sunone.springboot.controller;

import com.sunone.springboot.service.SysNavService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    SysNavService sysNavService;
    // 获取所有的后台导航栏信息
    @RequestMapping(value = "/getNavs")
    @ResponseBody
    public List<Map<String, Object>> getNavs(@RequestParam(required = false) Integer page,@RequestParam(required = false) Integer rows) {
        return sysNavService.getNavs(page, rows);
    }

    @RequestMapping(path = "/adminNav")
    public String adminNav(){
        return "adminNav";
    }
}
