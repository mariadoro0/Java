package controller;

import database.FilmDAO;
import model.Film;

import java.util.ArrayList;
import java.util.List;

public class FilmCtrl {

    FilmDAO dao= new FilmDAO();

    public ArrayList<Film> getFilms(){
        return dao.getFilm();
    }
    public ArrayList<Film> getFilmsByGenre(int genreId){

        ArrayList<Film>  filmByGenre= new ArrayList<>();    //creazione ArrayList vuoto
        for (Film f : dao.getFilm()){           //ciclo for tutti i film
            if(f.getGenreId()==genreId){    //se il genere del film corrisponde al genere passato
                filmByGenre.add(f);         //aggiungo film corrente all'ArrayList nuovo
            }
        }
        return filmByGenre;         //ritorno ArrayList nuovo
    }
}
