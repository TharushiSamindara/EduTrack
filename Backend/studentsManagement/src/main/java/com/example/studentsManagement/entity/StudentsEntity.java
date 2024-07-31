package com.example.studentsManagement.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import javax.xml.crypto.Data;

@Entity
@Table(name = "studentDetails")
public class StudentsEntity {

    @EmbeddedId
    private String studentId;

    @Column(name = "studentName", length = 100)
    private String studentName;

    @Column(name = "birthdate", length = 100)
    private Data birthdate;

    @Column(name = "gender", length = 6)
    private String gender;

    @Column(name = "email", length = 100)
    private String email;

    @Column(name = "phoneNo", length = 10)
    private String phoneNo;

    @Column(name = "address", length = 200)
    private String address;

    public StudentsEntity() {
    }

    public StudentsEntity(String studentId, String studentName, Data birthdate, String gender, String email, String phoneNo, String address) {
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
        return "StudentsEntity{" +
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
