package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class library {
    // setter injection
    Book b;

    @Autowired
    public void setb(Book b1)
    {
        b=b1;
    }
    String lname="Netaji abhyasika";
    String location = " Sangli";
    public String getlibinfo()
    {
        return b.getbookinfo()+" And library name is "+lname+" location is "+location;
    }
}
