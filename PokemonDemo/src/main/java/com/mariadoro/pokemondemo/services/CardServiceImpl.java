package com.mariadoro.pokemondemo.services;

import com.mariadoro.pokemondemo.entities.Card;
import com.mariadoro.pokemondemo.repos.CardDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CardServiceImpl implements CardService {
    @Autowired
    private CardDAO dao;

    @Override
    public List<Card> getCards() {
        return dao.findAll();
    }

    @Override
    public Optional<Card> getCard(String id) {
        return dao.findById(id);
    }

    @Override
    public List<Card> getCardsByName(String name) {
        return dao.findCardsByName(name);
    }

    @Override
    public List<Card> getCardsByType(String type) {
        return dao.findbyType(type);
    }
}
