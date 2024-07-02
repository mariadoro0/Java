package com.mariadoro.brawlers.services;

import com.mariadoro.brawlers.entities.Brawler;
import com.mariadoro.brawlers.repos.BrawlerDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BrawlerServiceImpl implements BrawlerService{

    @Autowired
    private BrawlerDAO dao;


    @Override
    public List<Brawler> getBrawlers() {
        return dao.findAll();
    }

    @Override
    public List<Brawler> getBrawlersByRarity(String rarity) {
        return dao.findByRarity(rarity);
    }

    @Override
    public List<Brawler> getBrawlerByCarattere(String carattere) {
        return dao.findByCarattere(carattere);
    }

    @Override
    public Brawler getBrawlerById(int id) {
        return dao.findById(id).get();
    }

    @Override
    public List<String> getRarities() {
        return dao.findAll().stream().map(Brawler::getRarity).distinct().sorted().toList();
    }

    @Override
    public List<String> getCaratteri() {
        return dao.findAll().stream().map(Brawler::getCarattere).distinct().sorted().toList();
    }
}
