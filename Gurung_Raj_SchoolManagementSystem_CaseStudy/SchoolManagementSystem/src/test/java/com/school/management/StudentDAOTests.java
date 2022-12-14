package com.school.management;

import com.school.management.dao.StudentDAO;
import com.school.management.entity.Student;

import org.junit.jupiter.api.Test;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

public class StudentDAOTests {

    @Test
    void contextLoads() {

        StudentDAO studentDAO = new StudentDAO() {
            @Override
            public Student findById(Integer id) {
                return null;
            }

            @Override
            public List<Student> findAll() {
                return null;
            }

            @Override
            public List<Student> findAll(Sort sort) {
                return null;
            }

            @Override
            public List<Student> findAllById(Iterable<Long> longs) {
                return null;
            }

            @Override
            public <S extends Student> List<S> saveAll(Iterable<S> entities) {
                return null;
            }

            @Override
            public void flush() {

            }

            @Override
            public <S extends Student> S saveAndFlush(S entity) {
                return null;
            }

            @Override
            public <S extends Student> List<S> saveAllAndFlush(Iterable<S> entities) {
                return null;
            }

            @Override
            public void deleteAllInBatch(Iterable<Student> entities) {

            }

            @Override
            public void deleteAllByIdInBatch(Iterable<Long> longs) {

            }

            @Override
            public void deleteAllInBatch() {

            }

            @Override
            public Student getOne(Long aLong) {
                return null;
            }

            @Override
            public Student getById(Long aLong) {
                return null;
            }

            @Override
            public <S extends Student> List<S> findAll(Example<S> example) {
                return null;
            }

            @Override
            public <S extends Student> List<S> findAll(Example<S> example, Sort sort) {
                return null;
            }

            @Override
            public Page<Student> findAll(Pageable pageable) {
                return null;
            }

            @Override
            public <S extends Student> S save(S entity) {
                return null;
            }

            @Override
            public Optional<Student> findById(Long aLong) {
                return Optional.empty();
            }

            @Override
            public boolean existsById(Long aLong) {
                return false;
            }

            @Override
            public long count() {
                return 0;
            }

            @Override
            public void deleteById(Long aLong) {

            }

            @Override
            public void delete(Student entity) {

            }

            @Override
            public void deleteAllById(Iterable<? extends Long> longs) {

            }

            @Override
            public void deleteAll(Iterable<? extends Student> entities) {

            }

            @Override
            public void deleteAll() {

            }

            @Override
            public <S extends Student> Optional<S> findOne(Example<S> example) {
                return Optional.empty();
            }

            @Override
            public <S extends Student> Page<S> findAll(Example<S> example, Pageable pageable) {
                return null;
            }

            @Override
            public <S extends Student> long count(Example<S> example) {
                return 0;
            }

            @Override
            public <S extends Student> boolean exists(Example<S> example) {
                return false;
            }
        };
    }
}

