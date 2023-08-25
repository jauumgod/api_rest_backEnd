package com.marketitems.controllers;


import com.marketitems.domain.user.User;
import com.marketitems.dtos.UserDTO;
import com.marketitems.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserServices userServices;

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody UserDTO user){
        User newUser = userServices.createNewUser(user);
        return new ResponseEntity<>(newUser, HttpStatus.CREATED);
    }
    @GetMapping
    public ResponseEntity <List<User>> getAllUsers(){
        List<User> users = this.userServices.getAllUsers();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }
}
