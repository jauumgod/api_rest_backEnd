package com.marketitems.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.marketitems.domain.listadecompras.ListaDeCompras;
import com.marketitems.dtos.ListaDeComprasDTO;
import com.marketitems.services.ListaServices;

@RestController
@RequestMapping("/lista")
public class ListaComprasController {
    @Autowired
    private ListaServices listaservices;

    @PostMapping
    public ResponseEntity<ListaDeCompras> createLista(@RequestBody ListaDeComprasDTO listaDTO){
        ListaDeCompras newLista = listaservices.createNewLista(listaDTO);
        return new ResponseEntity<>(newLista, HttpStatus.CREATED);
    }
    @GetMapping
    public ResponseEntity<List<ListaDeCompras>> getAllLists(){
        List<ListaDeCompras> listofcompras = this.listaservices.getAllList();
        return new ResponseEntity<>(listofcompras, HttpStatus.OK);
    }

}
