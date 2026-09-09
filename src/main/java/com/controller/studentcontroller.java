package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class studentcontroller {
    @Autowired
    college c;
    @GetMapping("/getcollegeinfo")
    public String getcollegeinfo()

    {
        return c.college();
    }
}
