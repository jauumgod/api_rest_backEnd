package com.marketitems.services;


import com.marketitems.domain.user.User;
import com.marketitems.dtos.ItemsDTO;
import com.marketitems.dtos.UserDTO;
import com.marketitems.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServices  {

    @Autowired
    private UserRepository repository;

    public void validateUser(UserDTO user) throws Exception{
        if(user.email().isEmpty()){
            throw new Exception("email inválido");
        }

    }
    public User findUserById(Long id) throws Exception{
        return (User) this.repository.findUserById(id).orElseThrow(()-> new Exception("Usuario não encontrado\n"));
    }

    public User createNewUser(UserDTO data){
        User newUser = new User(data);
        this.saveUser(newUser);
        return newUser;
    }

    public List<User> getAllUsers(){
        return this.repository.findAll();
    }
    public void saveUser(User user){
        this.repository.save(user);
    }
}
