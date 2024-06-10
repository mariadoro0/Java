package com.mariadoro.hellospringboot.services;

import com.mariadoro.hellospringboot.entities.Prodotto;
import com.mariadoro.hellospringboot.repos.ProdottoDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdottoImp implements ProdottoService {

    @Autowired
    private ProdottoDAO dao;

    @Override
    public List<Prodotto> getProdotti() {
        return dao.findAll();
    }

    @Override
    public Prodotto addProdotto(Prodotto p) {
        return dao.save(p);
    }
}
