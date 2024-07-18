package com.mariadoro.quizmondo.controllers;


import com.mariadoro.quizmondo.entities.Country;
import com.mariadoro.quizmondo.services.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

@Controller
@RequestMapping("quiz")
public class CountryRest {

    @Autowired
    private CountryService service;
    @GetMapping("/home")
    public String index(Model model) {
        model.addAttribute("message", "Ciao da QuizMondo!");
        return "index"; // Nome della vista Thymeleaf (senza estensione .html)
    }


    @GetMapping("/quizcapitali")
    public String quizcapitali(Model model) {
        Country c = service.getRandomCountry();
        model.addAttribute("flag", c.getFlag());
        model.addAttribute("country",c);
        Country c2 = service.getRandomCountry();
        Country c3 = service.getRandomCountry();
        while(c.equals(c2) || c3.equals(c2) || c.equals(c3)){
            c2 = service.getRandomCountry();
            c3 = service.getRandomCountry();
        }
        List<Country> lista = new ArrayList<>();
        lista.add(c);
        lista.add(c2);
        lista.add(c3);
        Collections.shuffle(lista);
        model.addAttribute("risposte", lista);
        return "quizcapitali";
    }

    @PostMapping( "/result")
        public String result(@RequestParam(required = false) Country selected, @RequestParam Country country, Model model){
        System.out.println(selected.toString());
        System.out.println(country.toString());
        if(selected.equals(country)){
            return "vittoria";
        }else{
            return "sconfitta";
        }

    }

    @GetMapping("/quizbandiere")
        public String quizbandiere(Model model){
            model.addAttribute("countryname",service.getRandomCountry().getName());

            return "quizbandiere";
        }





    @GetMapping("countries")
    public ResponseEntity<List<Country>> getAllCountries() {
        return new ResponseEntity<List<Country>>(service.getCountries(), HttpStatus.OK);
    }

    @GetMapping("capitals")
    public ResponseEntity<List<String>> getAllCapitals() {
        return new ResponseEntity<List<String>>(service.getCapitals(), HttpStatus.OK);
    }


}
