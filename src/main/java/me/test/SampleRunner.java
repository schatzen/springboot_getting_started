package me.test;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
public class SampleRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
    }
}
