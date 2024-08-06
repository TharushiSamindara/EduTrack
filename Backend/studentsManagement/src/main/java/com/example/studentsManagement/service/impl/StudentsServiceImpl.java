package com.example.studentsManagement.service.impl;

import com.example.studentsManagement.entity.StudentsEntity;
import com.example.studentsManagement.repo.StudentsRepo;
import com.example.studentsManagement.service.StudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentsServiceImpl implements StudentsService {

    @Autowired
    private StudentsRepo studentsRepo;

    @Override
    public String saveStudent(StudentsEntity studentsEntity) {
        /*StudentsEntity studentsEntity1 = new StudentsEntity(
                studentsEntity.getStudentId(),
                studentsEntity.getStudentName(),
                studentsEntity.getBirthdate(),
                studentsEntity.getGender(),
                studentsEntity.getEmail(),
                studentsEntity.getPhoneNo(),
                studentsEntity.getAddress()
        );

        //String newStudentId = studentsEntity.getStudentId();
        if(!studentsRepo.existsById(studentsEntity1.getStudentId())){
            return "vv";
        }
        else{
            return "fv";
        }*/
        return "";
    }
}
