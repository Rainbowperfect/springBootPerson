package org.person.config;

import org.person.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

    //将返回值添加到容器中，不用在启动类上添加ImportResource(locations={"classpath:xx.xml"})

     @Bean
    public HelloService GetHelloService(){

        return  new HelloService() ;
    }
}
