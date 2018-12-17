package com.sunone.springboot.controller;

import com.sunone.springboot.service.SysNavService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(path="/sys")
public class IndexController {
    @Autowired
    SysNavService sysNavService;
    @ResponseBody
    @RequestMapping(path = {"/getAllNavs"},method = RequestMethod.GET )
    public List<Map<String, Object>> getParamter (@RequestParam(value="id",defaultValue = "0") Long id){
        List<Map<String, Object>>  list=sysNavService.getAllNav(id);
        return list;
    }
    @RequestMapping(path = "/main")
    public String main (){
        return "main";
    }


}
