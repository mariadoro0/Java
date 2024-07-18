package com.mariadoro.quizmondo.services;

import com.mariadoro.quizmondo.entities.Country;
import com.mariadoro.quizmondo.repos.CountryDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class CountryServiceImp implements CountryService {

    @Autowired
    private CountryDAO dao;


    @Override
    public Country getCountryByFlag(String flag) {
        return dao.findByFlag(flag);
    }

    @Override
    public Country getCountryByCapital(String capital) {
        return dao.findByCapital(capital);
    }

    @Override
    public List<String> getCapitals() {
        return dao.findAll().stream().map(Country::getCapital).distinct().sorted().toList();
    }

    @Override
    public List<Country> getCountries() {
        return dao.findAll();
    }

    @Override
    public Country getRandomCountry() {
        Random r = new Random();
        List<Country> countries = getCountries();
        int index = r.nextInt(countries.size());
        return countries.get(index);
    }


}
