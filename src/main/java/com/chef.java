package com;

import org.springframework.stereotype.Component;

@Component
public class chef {
    String name="Omkar";
    String Specialdish ="Pizza";
    public String cookfood()
    {
        return "chef name "+name+" and special dish is "+Specialdish;
    }

}
