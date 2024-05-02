package presentation;

import controller.FilmCtrl;
import model.Film;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Noleggio {
    public static void main(String[] args) {
        FilmCtrl controller = new FilmCtrl();
        //controller.getFilms();
        File miofile = new File("C:\\Users\\ICTS23-25.246\\Desktop\\film.html");
        try {
            PrintWriter output= new PrintWriter(miofile);
            output.println("<table>");
            output.println("<tr>");
            output.println("<th>Film</th>");
            output.println("<th>Anno di pubblicazione</th>");
            output.println("</tr>");

            for (Film f : controller.getFilmsByGenre(3)){
                output.println("<tr>");
                output.println("<td><a target='_blank' href='https://www.google.com/search?q="+f.getTitle()+"'>"+f.getTitle()+"</a></td>");
                output.println("<td>"+f.getReleaseYear()+"</td>");
                output.println("</tr>");
            }

            output.println("</table>");
            output.close();


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        for (Film f : controller.getFilmsByGenre(3)){
            System.out.println(f);
        }

    }
}
