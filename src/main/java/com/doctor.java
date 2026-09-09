package com;

import org.springframework.stereotype.Component;

@Component
public class doctor {
    String name="Dr.Santu Nana ";
    String type=" Surgon";

    public String getdoctorinfo()
    {
        return "Docter name is "+name+"and type is "+type;

    }
}
