package com.example.usermessage;

import com.example.usermessage.models.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication

public class UserMessageApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserMessageApplication.class, args);
    }


}
