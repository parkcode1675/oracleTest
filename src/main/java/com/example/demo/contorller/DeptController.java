package com.example.demo.contorller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.DeptDao;
import com.example.demo.model.Dept;

@RestController
public class DeptController {

    @Autowired
    DeptDao deptDao;

    @GetMapping("/main")
    public List<Dept> main() {
        List<Dept> list = deptDao.selectList();
        System.out.println("mainController in!!!!");
        return list;
    }
    
    @GetMapping("/pro")
    public List<Dept> pro() {
    	HashMap<String,Object> map = new HashMap<String,Object>();
    	System.out.println("proController in!!!!");
        List<Dept> list = deptDao.selectPro(map);
        System.out.println("test : " +(List<Dept>)map.get("key"));
        
        return (List<Dept>)map.get("key");
    }
}