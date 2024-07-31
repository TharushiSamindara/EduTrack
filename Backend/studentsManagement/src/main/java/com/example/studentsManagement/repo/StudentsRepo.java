package com.example.studentsManagement.repo;

import com.example.studentsManagement.entity.StudentsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface StudentsRepo extends JpaRepository<StudentsEntity,StudentsEntity> {
}
