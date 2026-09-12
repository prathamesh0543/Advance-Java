package com.controller;

import com.Entity.student;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentsContrller {

    List<student> students = new ArrayList<>();

    @PostMapping("/addstudent")
    public String addstudent(@RequestBody student s) {
        students.add(s);
        return "Student added successfully";
    }
}