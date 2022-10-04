package com.prototype.playground;

import com.prototype.playground.model.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class PlaygroundApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext appContext = SpringApplication.run(PlaygroundApplication.class, args);
        User usr = appContext.getBean(User.class);
        usr.printDetails();
        System.out.println("Welcome to the playground");
    }

}
