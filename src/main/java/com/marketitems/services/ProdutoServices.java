package com.marketitems.services;


import com.marketitems.domain.items.Produto;
import com.marketitems.dtos.ProdutosDTO;
import com.marketitems.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoServices {

    @Autowired
    private ProdutoRepository repository;



    public Produto createNewItem(ProdutosDTO data){
        Produto newItem =  new Produto(data);
        this.saveItem(newItem);
        return newItem;
    }

    public List<Produto> getAllItems(){
        return this.repository.findAll();
    }
    public void saveItem(Produto item){
        this.repository.save(item);
    }

    //TODO delete item;
}
