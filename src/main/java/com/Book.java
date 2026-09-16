package com;


import org.springframework.stereotype.Component;

@Component
public class Book {

    String name="java";
    String author="Jmes Gosling";

    public String getbookinfo()
    {
        return "The book name is "+name+" written by "+author;
    }
}
