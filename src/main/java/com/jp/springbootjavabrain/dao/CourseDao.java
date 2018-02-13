package com.jp.springbootjavabrain.dao;

import com.jp.springbootjavabrain.entity.Course;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CourseDao extends CrudRepository<Course,Integer> {

    public List<Course> findByName(String name);

    public List<Course> findAllByTopicName(String name);
}
