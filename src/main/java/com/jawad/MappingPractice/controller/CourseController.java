package com.jawad.MappingPractice.controller;

import com.jawad.MappingPractice.model.Course;
import com.jawad.MappingPractice.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("course")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @PostMapping()
    public String addCourse(@RequestBody Course course){
        return courseService.saveCourse(course);
    }

    @GetMapping()
    public List<Course> getAllCourses(){
        return courseService.getAllCourses();
    }

    @PutMapping("{courseId}")
    public String updateCourse(@PathVariable String courseId, @RequestBody Course course){
        return courseService.updateCourseById(courseId, course);
    }

    @DeleteMapping("{courseId}")
    public String deleteCourse(@PathVariable String courseId){
        return courseService.deleteCourseById(courseId);
    }
}
