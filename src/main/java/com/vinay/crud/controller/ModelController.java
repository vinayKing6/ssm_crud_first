package com.vinay.crud.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.vinay.crud.bean.Dept;
import com.vinay.crud.bean.Stu;
import com.vinay.crud.service.DeptService;
import com.vinay.crud.service.StuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Controller
public class ModelController {

    @Autowired
    private StuService stuService;

    @Autowired
    private DeptService deptService;

    @RequestMapping("/getListJson")
    @ResponseBody
    @CrossOrigin
    public PageInfo getList(HttpServletRequest request, @RequestParam(value = "pn",defaultValue = "1") Integer pn){
        System.out.println(request.getParameter("pn"));
        PageHelper.startPage(pn,5);
        List<Stu> allStu = stuService.getAllStu();
        PageInfo pageInfo=new PageInfo(allStu,5);
        return pageInfo;
    }

    @RequestMapping("/getDept")
    @ResponseBody
    @CrossOrigin
    public List<Dept> getDept(){
        List<Dept> allDept = deptService.getAllDept();
        return allDept;
    }

    @RequestMapping(value = "/stu")
    @ResponseBody
    @CrossOrigin
    public Map<String,Object> addStu(@Valid Stu stu, BindingResult result){
        Map<String,Object> map=new HashMap<>();

        if (result.hasErrors()){
            result.getFieldErrors().forEach(fieldError -> {
                System.out.println(fieldError.getField()+" "+fieldError.getDefaultMessage());
                map.put(fieldError.getField(),fieldError.getDefaultMessage());
            });
            map.put("status",500);
            return map;
        }
        System.out.println(stu);
        stuService.insertStu(stu);
        map.put("status",200);
        return map;
    }

    @RequestMapping(value = "/stu/{stuId}", method = RequestMethod.PUT)
    @ResponseBody
    @CrossOrigin
    public Map<String,Object> updateStu(@Valid Stu stu,BindingResult result){
        Map<String,Object> map=new HashMap<>();

        if (result.hasErrors()){
            result.getFieldErrors().forEach(fieldError -> {
                System.out.println(fieldError.getField()+" "+fieldError.getDefaultMessage());
                map.put(fieldError.getField(),fieldError.getDefaultMessage());
            });
            map.put("status",500);
            return map;
        }
        System.out.println("update "+stu);
        stuService.updateStu(stu);
        map.put("status",200);
        return map;
    }

    @RequestMapping(value = "/stu", method = RequestMethod.DELETE)
    @ResponseBody
    @CrossOrigin
    public Map<String,Object> deleteStu(@RequestParam("ids") String ids){
        Map<String,Object> map=new HashMap<>();
        if (ids.contains("-")){
            String[] split = ids.split("-");
            List<String> strings = Arrays.asList(split);
            List<Integer> idList = strings.stream().map(Integer::parseInt).collect(Collectors.toList());
            System.out.println(idList);
            stuService.deleteBatch(idList);
            map.put("status",200);
            return map;
        }else{
            stuService.deleteStu(Integer.parseInt(ids));
            map.put("status",200);
            return map;
        }
    }

    @RequestMapping("/list")
    @CrossOrigin
    public String getPage(){
        return "list";
    }
}
