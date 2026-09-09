package com.controller;

import com.car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EngineCarController {
    @Autowired
    car c;
    @GetMapping("/getcarinfo")
    public String getcarinfo()
    {
        return c.driving();
    }

}
