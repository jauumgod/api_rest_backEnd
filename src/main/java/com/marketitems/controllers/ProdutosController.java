package com.marketitems.controllers;



import com.marketitems.domain.items.Produto;
import com.marketitems.dtos.ProdutosDTO;
import com.marketitems.services.ProdutoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/items")
public class ProdutosController {
    @Autowired
    private ProdutoServices produtoServices;

    @PostMapping
    public ResponseEntity<Produto> createItem(@RequestBody ProdutosDTO itemsDTO){
        Produto newItems = produtoServices.createNewItem(itemsDTO);
        return new ResponseEntity<>(newItems, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Produto>> getAllItems(){
        List<Produto> items = this.produtoServices.getAllItems();
        return new ResponseEntity<>(items, HttpStatus.OK);
    }
}
