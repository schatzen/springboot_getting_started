package me.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class SampleRunner implements ApplicationRunner {

//    @Value("${me.name}")
//    private String name;
//
//    @Value("${me.age}")
//    private int age;

    @Autowired
    EmilyProperties emilyProperties;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("=======================");
        System.out.println(emilyProperties.getFullname());
        System.out.println(emilyProperties.getAge());
        System.out.println("=======================");
    }
}
