package org.lingg.bootstart.myboot2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class MyBoot2StartApplication {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(MyBoot2StartApplication.class);

        application.run(args);
    }

}
