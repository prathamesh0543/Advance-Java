package com.controller;

import com.Laptop;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Component
public class ConstructorInjectionController {
    Laptop l;
    ConstructorInjectionController(Laptop l1)
    {
        l=l1;

    }
    @GetMapping("/getconstructorinfo")
    public String get()
    {
        return l.getlaptopinfo();
    }
}
