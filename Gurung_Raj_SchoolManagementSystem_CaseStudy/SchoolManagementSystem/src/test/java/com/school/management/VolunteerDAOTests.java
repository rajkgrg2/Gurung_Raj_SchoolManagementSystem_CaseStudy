package com.school.management;

import com.school.management.dao.VolunteerDAO;
import com.school.management.entity.Volunteer;

import org.junit.jupiter.api.Test;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

public class VolunteerDAOTests {

    @Test
    void contextLoads() {

        VolunteerDAO volunteerDAO = new VolunteerDAO() {
            @Override
            public Volunteer findById(Integer id) {
                return null;
            }

            @Override
            public List<Volunteer> findAll() {
                return null;
            }

            @Override
            public List<Volunteer> findAll(Sort sort) {
                return null;
            }

            @Override
            public List<Volunteer> findAllById(Iterable<Long> longs) {
                return null;
            }

            @Override
            public <S extends Volunteer> List<S> saveAll(Iterable<S> entities) {
                return null;
            }

            @Override
            public void flush() {

            }

            @Override
            public <S extends Volunteer> S saveAndFlush(S entity) {
                return null;
            }

            @Override
            public <S extends Volunteer> List<S> saveAllAndFlush(Iterable<S> entities) {
                return null;
            }

            @Override
            public void deleteAllInBatch(Iterable<Volunteer> entities) {

            }

            @Override
            public void deleteAllByIdInBatch(Iterable<Long> longs) {

            }

            @Override
            public void deleteAllInBatch() {

            }

            @Override
            public Volunteer getOne(Long aLong) {
                return null;
            }

            @Override
            public Volunteer getById(Long aLong) {
                return null;
            }

            @Override
            public <S extends Volunteer> List<S> findAll(Example<S> example) {
                return null;
            }

            @Override
            public <S extends Volunteer> List<S> findAll(Example<S> example, Sort sort) {
                return null;
            }

            @Override
            public Page<Volunteer> findAll(Pageable pageable) {
                return null;
            }

            @Override
            public <S extends Volunteer> S save(S entity) {
                return null;
            }

            @Override
            public Optional<Volunteer> findById(Long aLong) {
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
            public void delete(Volunteer entity) {

            }

            @Override
            public void deleteAllById(Iterable<? extends Long> longs) {

            }

            @Override
            public void deleteAll(Iterable<? extends Volunteer> entities) {

            }

            @Override
            public void deleteAll() {

            }

            @Override
            public <S extends Volunteer> Optional<S> findOne(Example<S> example) {
                return Optional.empty();
            }

            @Override
            public <S extends Volunteer> Page<S> findAll(Example<S> example, Pageable pageable) {
                return null;
            }

            @Override
            public <S extends Volunteer> long count(Example<S> example) {
                return 0;
            }

            @Override
            public <S extends Volunteer> boolean exists(Example<S> example) {
                return false;
            }
        };
    }
}
