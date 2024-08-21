package com.example.demo.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.model.Dept;

@Mapper
public interface DeptDao {
    public List<Dept> selectList();
    public List<Dept> selectPro(Map<String,Object> map);
}