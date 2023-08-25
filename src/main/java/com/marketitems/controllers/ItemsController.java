package com.marketitems.controllers;


import com.marketitems.domain.items.Items;
import com.marketitems.dtos.ItemsDTO;
import com.marketitems.services.ItemServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/items")
public class ItemsController {
    @Autowired
    private ItemServices itemServices;

    @PostMapping
    public ResponseEntity<Items> createItem(@RequestBody ItemsDTO itemsDTO){
        Items newItems = itemServices.createNewItem(itemsDTO);
        return new ResponseEntity<>(newItems, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Items>> getAllItems(){
        List<Items> items = this.itemServices.getAllItems();
        return new ResponseEntity<>(items, HttpStatus.OK);
    }
}
