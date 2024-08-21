package com.example.demo.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.dao.DeptDao;
import com.example.demo.model.Dept;

public class DeptServiceImpl implements DeptService {

    @Autowired
    DeptDao deptDao;

    @Override
    public List<Dept> selectList() {
    	System.out.println("selectList in!!!!");
        return deptDao.selectList();
    }
    
    @Override
    public List<Dept> selectPro(Map<String,Object> map) {
    	System.out.println("selectPro in!!!!");
        return deptDao.selectPro(map);
    }

}