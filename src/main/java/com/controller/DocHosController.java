package com.controller;

import com.Hospital;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DocHosController {
    Hospital h;

    DocHosController(Hospital h1)
    {
        h=h1;

    }
    @GetMapping("/gethospitalinfo")
    public String getinfo()
    {
        return h.gethospitalinfo();
    }

}
