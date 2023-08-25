package com.marketitems.services;


import com.marketitems.domain.user.User;
import com.marketitems.dtos.ItemsDTO;
import com.marketitems.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServices  {

    @Autowired
    private UserRepository repository;

    public void validateInsert(ItemsDTO items) throws Exception{
        if(items.itemName().isEmpty()){
            throw new Exception("item informado está vazio");
        }

    }

    public List<User> getAllUsers(){
        return this.repository.findAll();
    }
    public void saveUser(User user){
        this.repository.save(user);
    }
}
