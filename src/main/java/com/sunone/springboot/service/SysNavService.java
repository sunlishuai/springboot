package com.sunone.springboot.service;

import java.util.List;
import java.util.Map;

public interface SysNavService {
    List<Map<String, Object>> getAllNav(Long id);

    List<Map<String, Object>> getNavs(Integer page, Integer rows);
}
