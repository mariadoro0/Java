package com.mariadoro.pokemondemo.services;

import com.mariadoro.pokemondemo.entities.Card;

import java.util.List;
import java.util.Optional;

public interface CardService {
    List<Card> getCards();
    Optional<Card> getCard(String id);
    List<Card> getCardsByName(String name);
    List<Card> getCardsByType(String type);
}
