package com.example.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.model.Dept;

@Mapper
public interface DeptDao {
    public List<Dept> selectList();
}