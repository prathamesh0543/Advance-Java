package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/second")
public class SecondController {
    @RequestMapping("/hello")
    public String show()
    {
        return " This is ambigious mapping problem ";
    }

    @GetMapping("/power")
    public String calculatepower(@RequestParam int no,
                                 @RequestParam int power)
    {
        return "Power is "+power+ "  given no is "+no+": "+ Math.pow(no,power);
    }


}
