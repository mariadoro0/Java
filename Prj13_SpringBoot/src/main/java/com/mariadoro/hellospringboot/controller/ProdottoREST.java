package com.mariadoro.hellospringboot.controller;


import com.mariadoro.hellospringboot.entities.Prodotto;
import com.mariadoro.hellospringboot.services.ProdottoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProdottoREST {

    @Autowired
    private ProdottoService service;


    @GetMapping("prodotti")
    List<Prodotto> getProdotti() {
        return service.getProdotti();
    }

    @PostMapping("prodotti")
    Prodotto addProdotto (@RequestBody Prodotto p) {
        return service.addProdotto(p);
    }

    @PostMapping("allprodotti")
    List<Prodotto> addProdotti (@RequestBody List<Prodotto> p) {
        for (Prodotto p1 : p) {
            service.addProdotto(p1);
        }
        return service.getProdotti();
    }

}
