package com.school.management.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.school.management.entity.Course;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public interface CourseDAO extends JpaRepository<Course,Long> {

    public Course findById(@Param("id") Integer id);

    @Query(value = "select * from school_mng.course ", nativeQuery = true)
    public List<Course> allcourses();

    @Query(value = "select * from school_mng.course r where lower(r.course_name)"
    		+ " like lower(concat('%', :course_name,'%'))", nativeQuery = true)
    public List<Course> findByName(@Param("course_name")String course);


    public void removeCoursesById(int id);


}
