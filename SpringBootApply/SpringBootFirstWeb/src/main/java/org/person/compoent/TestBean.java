package org.person.compoent;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalTime;

@Component
public class TestBean implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("do something :"+LocalTime.now());
    }
}
