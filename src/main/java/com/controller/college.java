package com.controller;

import com.student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class college {
    String cname="pdvp college";
    String clocation="Tasgaon";
    @Autowired
    student s;
    public String college(){

        return s.getstudonfo() +  " name of college is "+cname+"which is at"+clocation;


    }
}
