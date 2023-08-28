package com.marketitems.controllers;


import com.marketitems.domain.Cart.Carrinho;

import com.marketitems.dtos.CarrinhoDTO;
import com.marketitems.services.CarrinhoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/carrinho")
public class CarrinhoController {
    @Autowired
    CarrinhoService carrinhoService;

    @PostMapping
    public ResponseEntity<Carrinho> createNewCar(@RequestBody CarrinhoDTO carrinhoDTO){
        Carrinho newCar = carrinhoService.createNewCar(carrinhoDTO);
        return new ResponseEntity<>(newCar, HttpStatus.CREATED);
    }
    @GetMapping
    public ResponseEntity<List<Carrinho>> getAllLists(){
        List<Carrinho> listNewCar = this.carrinhoService.getAllList();
        return new ResponseEntity<>(listNewCar, HttpStatus.OK);
    }
}
