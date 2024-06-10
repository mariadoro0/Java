package com.mariadoro.hellospringboot.services;

import com.mariadoro.hellospringboot.entities.Prodotto;

import java.util.List;

public interface ProdottoService {
    List<Prodotto> getProdotti();
    Prodotto addProdotto(Prodotto p);

}
