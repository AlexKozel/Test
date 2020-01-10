package com.mastery.java.task;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


public class Application
{

    static String s ;
    static int i;
    static {i = 50;
    s = "s";}

    public static void main( String[] args )
    {
//        SpringApplication.run(Application.class, args);
        System.out.println("there is " + s + i);


    }
}
