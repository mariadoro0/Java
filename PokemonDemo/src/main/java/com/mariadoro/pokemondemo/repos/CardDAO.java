package com.mariadoro.pokemondemo.repos;

import com.mariadoro.pokemondemo.entities.Card;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CardDAO extends JpaRepository<Card, String> {
    Card findbyId(String id);
    List<Card> findCardsByName(String name);
    List<Card> findbyType(String type);

}
