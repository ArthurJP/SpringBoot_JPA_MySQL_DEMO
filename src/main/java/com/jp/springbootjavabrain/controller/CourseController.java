package com.jp.springbootjavabrain.controller;


import com.jp.springbootjavabrain.entity.Course;
import com.jp.springbootjavabrain.entity.Topic;
import com.jp.springbootjavabrain.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @RequestMapping("/topics/{name}/courses")
    public List<Course> list2json(@PathVariable String name) {
        return courseService.getAllCourse(name);
    }

    @RequestMapping("/topics/{name}/courses/{id}")
    public Course getCourse(@PathVariable int id) {
        return courseService.getCourse( id );
    }

    @PostMapping("/topics/{name}/courses")
    public int addCourse(@RequestBody Course course,@PathVariable String name) {
        course.setTopic( new Topic( name," " ) );
        return courseService.addCourse( course );
    }

    @PutMapping("/topics/{name}/courses")
    public int updateCourse(@RequestBody Course course,@PathVariable String name) {
        course.setTopic( new Topic( name,"" ) );
        return courseService.updateCourse( course );
    }


    @DeleteMapping("/topics/{name}/courses/{id}")
    public int deleteCourse(@PathVariable int id) {
        return courseService.delCourse( id );
    }
}
