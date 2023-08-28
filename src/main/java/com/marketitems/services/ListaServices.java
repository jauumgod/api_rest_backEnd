package com.marketitems.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marketitems.domain.listadecompras.ListaDeCompras;
import com.marketitems.dtos.ListaDeComprasDTO;
import com.marketitems.repositories.ItemListaRepository;

@Service
public class ListaServices{
    @Autowired
    private ItemListaRepository repository;

    public ListaDeCompras createNewLista(ListaDeComprasDTO data){
        ListaDeCompras newlista = new ListaDeCompras(data);
        this.saveList(newlista);
        return newlista;
    }

    public List<ListaDeCompras> getAllList(){
        return this.repository.findAll();
    }

    public void saveList(ListaDeCompras lista){
        this.repository.save(lista);
    }

}