package org.person;

import org.person.compoent.TestBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PersonApplication {



    @Bean
    public TestBean getBean(){
        return new TestBean();
    }
    public static void main(String[] args) {

        SpringApplication.run(PersonApplication.class, args);
        // SpringApplication app=new SpringApplication();
        // app.setBannerMode(Banner.Mode.OFF);
        // app.run(args);

    }
}
