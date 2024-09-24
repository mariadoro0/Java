package com.mariadoro.pokemondemo.services;

import com.mariadoro.pokemondemo.entities.Card;

import java.util.List;

public interface CardService {
    List<Card> getCards();
    Card getCard(String id);
    List<Card> getCardsByName(String name);
    List<Card> getCardsByType(String type);
}
