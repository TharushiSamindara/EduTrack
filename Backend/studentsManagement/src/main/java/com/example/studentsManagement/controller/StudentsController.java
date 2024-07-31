package com.example.studentsManagement.controller;

import com.example.studentsManagement.entity.StudentsEntity;
import com.example.studentsManagement.service.StudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("api/v1/students")
public class StudentsController {

    @Autowired
    private StudentsService studentsService;

    @PostMapping(path = "/save")
    public String saveStudent(@RequestBody StudentsEntity studentsEntity){
        studentsService.saveStudent(studentsEntity);
        return "Successfully saved";
    }
}
