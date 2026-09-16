package com.controller;

import com.library;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class BookLibrarycontroller {
    library l;
    @Autowired
    public void setl(library l1)
    {
        l=l1;
    }
    @GetMapping("/" +
            "")
    public String get()
    {
        return l.getlibraryinfo();
    }




}
