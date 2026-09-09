package com;

import org.springframework.stereotype.Component;

@Component
public class student {
    String Name="Prathemesh";
    String Course="Java Full Stack";
    public String getstudonfo()
    {
        return "Name of Student "+Name+" Course is "+Course;
    }
}
