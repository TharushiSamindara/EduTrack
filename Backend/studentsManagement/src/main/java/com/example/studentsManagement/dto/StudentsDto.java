package com.example.studentsManagement.dto;

import jakarta.persistence.Column;

import javax.xml.crypto.Data;

public class StudentsDto {
    private String studentId;
    private String studentName;
    private Data birthdate;
    private String gender;
    private String email;
    private String phoneNo;
    private String address;

    public StudentsDto() {
    }

    public StudentsDto(String studentId, String studentName, Data birthdate, String gender, String email, String phoneNo, String address) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.birthdate = birthdate;
        this.gender = gender;
        this.email = email;
        this.phoneNo = phoneNo;
        this.address = address;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Data getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Data birthdate) {
        this.birthdate = birthdate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "StudentsDto{" +
                "studentId='" + studentId + '\'' +
                ", studentName='" + studentName + '\'' +
                ", birthdate=" + birthdate +
                ", gender='" + gender + '\'' +
                ", email='" + email + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
