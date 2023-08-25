package com.marketitems.services;

import com.marketitems.domain.items.Items;
import com.marketitems.dtos.ItemsDTO;
import com.marketitems.repositories.ItemsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServices {

    @Autowired
    private ItemsRepository repository;



    public Items createNewItem(ItemsDTO data){
        Items newItem =  new Items(data);
        this.saveItem(newItem);
        return newItem;
    }

    public List<Items> getAllItems(){
        return this.repository.findAll();
    }
    public void saveItem(Items item){
        this.repository.save(item);
    }

    //TODO delete item;
}
