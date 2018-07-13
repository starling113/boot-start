package org.lingg.bootstart.boot3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StartApplication {
    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(StartApplication.class);

        application.run(args);
    }
}
