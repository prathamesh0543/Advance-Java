package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Hospital {

    doctor d;

    Hospital(doctor d1)
    {
        d=d1;
        System.out.println("This is hospital class constructor");
    }
    String hname="Bharti Hospital";
    String location ="Dhankawadi Pune";
    public String gethospitalinfo()
    {
        return d.getdoctorinfo()+" who works at "+hname+" which is located at"+location;
    }

}
