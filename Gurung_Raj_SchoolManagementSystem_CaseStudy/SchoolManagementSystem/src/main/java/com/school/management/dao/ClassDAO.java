package com.school.management.dao;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.school.management.entity.Classs;

import java.util.List;

import javax.transaction.Transactional;


@Transactional
@Repository
public interface ClassDAO extends JpaRepository<Classs,Long> {

    public Classs findById(@Param("id") Integer id);
    
//    @Query(value = "select * from school_mng.classs ", nativeQuery = true)
//    public List<Classs> allclassses();
//
//    @Query(value = "select * from school_mng.classs c where lower(c.classs_name)"
//    		+ " like lower(concat('%', :classs_name,'%'))", nativeQuery = true)
//   public List<Classs> findByName(@Param("classs_name")String classs);
    
    public void removeClasssById(int id);

//	public List<Class> allclasses();

}
