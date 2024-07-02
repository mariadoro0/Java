package com.mariadoro.brawlers.repos;

import com.mariadoro.brawlers.entities.Brawler;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BrawlerDAO extends JpaRepository<Brawler, Integer> {
    List<Brawler> findByRarity(String rarity);
    List<Brawler> findByCarattere(String carattere);
}
