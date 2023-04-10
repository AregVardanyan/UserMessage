package com.example.usermessage.controllers;

import com.example.usermessage.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UsersService usersService;

    @Autowired
    public UserController(UsersService usersService, UsersService usersService1){
        this.usersService = usersService1;
    }

    @GetMapping("/getAll")
    public List<User> getUsers(){
        return usersService.getUsers();
    }

    @GetMapping("/searchUser")
    public List<User> searchUsers(@RequestParam("user") String searchUser){
        return usersService.filterUsers(searchUser);
    }
}
