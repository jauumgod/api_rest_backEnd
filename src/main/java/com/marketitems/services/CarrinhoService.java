package com.marketitems.services;

import com.marketitems.domain.Cart.Carrinho;
import com.marketitems.dtos.CarrinhoDTO;
import com.marketitems.repositories.CarrinhoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarrinhoService {

    @Autowired
    private CarrinhoRepository repository;


    public Carrinho createNewCar(CarrinhoDTO data){
        Carrinho newUser = new Carrinho(data);
        this.saveCar(newUser);
        return newUser;
    }

    public List<Carrinho> getAllList(){
        return this.repository.findAll();
    }

    public void saveCar(Carrinho produto){
        this.repository.save(produto);
    }

}
