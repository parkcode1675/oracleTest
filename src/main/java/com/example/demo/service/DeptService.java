package com.example.demo.service;

import java.util.List;
import java.util.Map;

import com.example.demo.model.Dept;

public interface DeptService {
    public List<Dept> selectList();
    public List<Dept> selectPro(Map<String,Object> map);
}