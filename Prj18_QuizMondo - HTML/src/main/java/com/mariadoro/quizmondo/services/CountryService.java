package com.mariadoro.quizmondo.services;

import com.mariadoro.quizmondo.entities.Country;

import java.util.List;

public interface CountryService {
    Country getCountryByFlag(String flag);
    Country getCountryByCapital(String capital);
    List<String> getCapitals();
    List<Country> getCountries();
    Country getRandomCountry();
}
