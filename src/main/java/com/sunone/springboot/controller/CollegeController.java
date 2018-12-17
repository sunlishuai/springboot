package com.sunone.springboot.controller;

import com.sunone.springboot.entity.College;
import com.sunone.springboot.service.CollegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Controller
public class CollegeController {
    @Autowired
    private CollegeService collegeService;

    /**
     * 保存学院信息
     *
     * @param model
     * @param adminNav
     * @return
     */
    @RequestMapping(value = "doSave")
    public String doSave(Model model, College college) {

        collegeService.doSave(college);

        return "/admin/main";
    }

    /**
     * 文件保存
     *
     * @param model
     * @param adminNav
     * @return
     */
    @RequestMapping(value = "upload")
    @ResponseBody
    public Map<String, Object> upload(@RequestParam(value = "uploadFile", required = false) MultipartFile uploadFile,
                                      HttpServletRequest request, HttpServletResponse response) {
        Map<String, Object> resultMap = new HashMap<String, Object>();

        resultMap.put("msg", "上传文件成功");
        String newFileName = "";
        try {

            String fileName = uploadFile.getOriginalFilename();// 获取文件上传的名称 String
            if (null != fileName) {
                newFileName = UUID.randomUUID() + fileName.substring(fileName.lastIndexOf("."));
            }
            //上传到工程uploadFile下
            String uploadPath = request.getServletContext().getRealPath("/");
            System.out.println("--------uploadPath---------"+uploadPath);
            File files = new File(uploadPath+"/resources/uploadFile/", newFileName);
            if (!files.exists()) {
                files.mkdirs();
            }
            uploadFile.transferTo(files);
            resultMap.put("fileAdress",  newFileName);
        } catch (Exception e) {
            resultMap.put("msg", "上传文件成功");
            e.printStackTrace();
        }

        return resultMap;
    }
}
