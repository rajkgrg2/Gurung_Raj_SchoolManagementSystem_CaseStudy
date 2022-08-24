package com.school.management.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.school.management.entity.Volunteer;

@Repository
public interface VolunteerDAO extends JpaRepository<Volunteer,Long> {
    public Volunteer findById(@Param("id") Integer id);
}
