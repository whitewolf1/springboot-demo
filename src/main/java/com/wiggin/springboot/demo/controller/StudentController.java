package com.wiggin.springboot.demo.controller;

import com.wiggin.springboot.demo.model.Student;
import com.wiggin.springboot.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * copyright 2015-2020
 *
 * @author wiggin
 * @date 2017/9/26 22:48
 * @Description: 控制器
 */
@RestController
public class StudentController {

    @Autowired
    private StudentService service;

    @RequestMapping(value = "/qryById")
    public Student qry(int id){
        System.out.println("这个是V1版");
        return service.queryById(id);
    }

    @RequestMapping(value = "/getStudent")
    public Student getStudent(int id2){
        System.out.println("这个是V1版");
        return service.queryById(id2);
    }

    @RequestMapping(value = "/getStudent3")
    public Student getStudent3(int id3){
        System.out.println("这个是dev版");
        System.out.println("这是master");
        System.out.println("这个是dev2版");
        return service.queryById(id3);
    }
}
