package com.vinay.crud.service;

import com.vinay.crud.bean.Dept;
import com.vinay.crud.dao.DeptMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptService {

    @Autowired
    private DeptMapper deptMapper;

    public List<Dept> getAllDept(){
        return deptMapper.selectByExample(null);
    }
}
