package com.example.usermessage.controllers;

import com.example.usermessage.UsersRepository;
import com.example.usermessage.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.stream.Collectors;


@Component
public class UsersService {
    private final UsersRepository usersRepository;

    @Autowired
    public UsersService(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    public List<User> getUsers(){
        return usersRepository.findAll();
    }

    public User addUser(User user){
        usersRepository.save(user);
        return user;
    }

    public List<User> filterUsers(String searchName){
        List<User> searchedUsers = usersRepository.findAll()
                .stream()
                .filter(user-> user.getName().startsWith(searchName))
                .toList();
        return searchedUsers;
    }
}
