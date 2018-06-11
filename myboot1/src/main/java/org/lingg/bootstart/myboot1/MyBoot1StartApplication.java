package org.lingg.bootstart.myboot1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class MyBoot1StartApplication {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(MyBoot1StartApplication.class);

        application.run(args);
    }

}
