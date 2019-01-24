package com.hackathon.demo.controller;

import com.hackathon.demo.entity.Student;
import com.hackathon.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired private StudentService studentService;

    @RequestMapping(value = "/students", method = RequestMethod.GET)
    public List<Student> getAll() {
        return studentService.getAll();
    }

    @RequestMapping(value = "/students/{id}", method = RequestMethod.GET)
    public Student getStudent(@PathVariable("id") Long id) {
        return studentService.getStudent(id);
    }

    @RequestMapping(value = "/students", method = RequestMethod.POST)
    public Student postStudent(@RequestBody Student student) {
        return studentService.save(student);
    }

}
