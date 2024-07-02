package com.mariadoro.brawlers.services;

import com.mariadoro.brawlers.entities.Brawler;
import java.util.List;
import java.util.Optional;

public interface BrawlerService {
    List<Brawler> getBrawlers();
    List<Brawler> getBrawlersByRarity(String rarity);
    List<Brawler> getBrawlerByCarattere(String carattere);
    Brawler getBrawlerById(int id);

    List<String> getRarities();
    List<String> getCaratteri();

}
