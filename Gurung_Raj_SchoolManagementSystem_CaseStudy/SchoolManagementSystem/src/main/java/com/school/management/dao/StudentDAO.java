package com.school.management.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.school.management.entity.Student;

import java.util.List;

@Repository
public interface StudentDAO extends JpaRepository<Student,Long> {
    public Student findById(@Param("id") Integer id);

//	public List<Student> allstudents();

}
