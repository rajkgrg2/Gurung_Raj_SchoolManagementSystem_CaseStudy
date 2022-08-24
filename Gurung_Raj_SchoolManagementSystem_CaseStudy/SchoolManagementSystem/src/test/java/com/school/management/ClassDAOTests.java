package com.school.management;


import com.school.management.dao.ClassDAO;
import com.school.management.entity.Classs;

import org.junit.jupiter.api.Test;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

public class ClassDAOTests {

    @Test
    void contextLoads() {

        ClassDAO classDAO = new ClassDAO() {
            @Override
            public Classs findById(Integer id) {
                return null;
            }

            @Override
            public void removeClasssById(int id) {

            }

            @Override
            public List<Classs> findAll() {
                return null;
            }

            @Override
            public List<Classs> findAll(Sort sort) {
                return null;
            }

            @Override
            public List<Classs> findAllById(Iterable<Long> longs) {
                return null;
            }

            @Override
            public <S extends Classs> List<S> saveAll(Iterable<S> entities) {
                return null;
            }

            @Override
            public void flush() {

            }

            @Override
            public <S extends Classs> S saveAndFlush(S entity) {
                return null;
            }

            @Override
            public <S extends Classs> List<S> saveAllAndFlush(Iterable<S> entities) {
                return null;
            }

            @Override
            public void deleteAllInBatch(Iterable<Classs> entities) {

            }

            @Override
            public void deleteAllByIdInBatch(Iterable<Long> longs) {

            }

            @Override
            public void deleteAllInBatch() {

            }

            @Override
            public Classs getOne(Long aLong) {
                return null;
            }

            @Override
            public Classs getById(Long aLong) {
                return null;
            }

            @Override
            public <S extends Classs> List<S> findAll(Example<S> example) {
                return null;
            }

            @Override
            public <S extends Classs> List<S> findAll(Example<S> example, Sort sort) {
                return null;
            }

            @Override
            public Page<Classs> findAll(Pageable pageable) {
                return null;
            }

            @Override
            public <S extends Classs> S save(S entity) {
                return null;
            }

            @Override
            public Optional<Classs> findById(Long aLong) {
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
            public void delete(Classs entity) {

            }

            @Override
            public void deleteAllById(Iterable<? extends Long> longs) {

            }

            @Override
            public void deleteAll(Iterable<? extends Classs> entities) {

            }

            @Override
            public void deleteAll() {

            }

            @Override
            public <S extends Classs> Optional<S> findOne(Example<S> example) {
                return Optional.empty();
            }

            @Override
            public <S extends Classs> Page<S> findAll(Example<S> example, Pageable pageable) {
                return null;
            }

            @Override
            public <S extends Classs> long count(Example<S> example) {
                return 0;
            }

            @Override
            public <S extends Classs> boolean exists(Example<S> example) {
                return false;
            }
        };

    }
}
