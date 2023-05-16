package com.jawad.MappingPractice.controller;

import com.jawad.MappingPractice.model.Student;
import com.jawad.MappingPractice.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping()
    public String createStudents(@RequestBody Student student){
        return studentService.saveStudent(student);
    }

    @GetMapping()
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    @PutMapping("{id}")
    public String updateStudent(@PathVariable String id, @RequestBody Student updatedStudent){
        return studentService.updateStudent(id, updatedStudent);
    }

    @DeleteMapping("{id}")
    public String deleteStudent(@PathVariable String id){
        return studentService.deleteStudentById(id);
    }
}
