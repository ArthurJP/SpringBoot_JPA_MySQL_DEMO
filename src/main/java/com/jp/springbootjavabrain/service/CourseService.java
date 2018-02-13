package com.jp.springbootjavabrain.service;

import com.jp.springbootjavabrain.dao.CourseDao;
import com.jp.springbootjavabrain.entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {
    private final CourseDao courseDao;

    @Autowired
    public CourseService(CourseDao courseDao) {
        this.courseDao = courseDao;
    }

    public List<Course> getAllCourse(String name) {
        List<Course> courses = new ArrayList<>();
        courseDao.findAllByTopicName(name).forEach( courses::add );
        return courses;
    }

    public Course getCourse(int id) {
        return courseDao.findOne( id );
    }

    public int addCourse(Course course) {
        try {
            courseDao.save( course );
            return 1;
        } catch (Exception e) {
            return 0;
        }
    }

    public int updateCourse(Course course) {
        try {
            courseDao.save( course );
            return 1;
        } catch (Exception e) {
            return 0;
        }
    }


    public int delCourse(int id) {
        try {
            courseDao.delete( id );
            return 1;
        } catch (Exception e) {
            return 0;
        }
    }
}
