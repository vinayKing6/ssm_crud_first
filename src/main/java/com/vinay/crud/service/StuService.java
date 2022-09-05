package com.vinay.crud.service;

import com.vinay.crud.bean.Stu;
import com.vinay.crud.bean.StuExample;
import com.vinay.crud.dao.StuMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StuService {

    @Autowired
    private StuMapper stuMapper;

    public List<Stu> getAllStu(){
        return stuMapper.selectByExampleWithDept(null);
    }

    public void insertStu(Stu stu){
        stuMapper.insertSelective(stu);
    }

    public void updateStu(Stu stu){
        stuMapper.updateByPrimaryKeySelective(stu);
    }

    public void deleteStu(Integer id){
        stuMapper.deleteByPrimaryKey(id);
    }

    public void deleteBatch(List<Integer> ids){
        StuExample stuExample=new StuExample();
        StuExample.Criteria criteria = stuExample.createCriteria();
        criteria.andStuIdIn(ids);
        stuMapper.deleteByExample(stuExample);
    }
}
