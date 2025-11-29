package com.example.views;

import java.util.List;

import com.example.models.Movies;

public class MainView {
    public void show(List<Movies> moviesList){
        System.out.printf("\n%2s %20s %20s %6s\n\n", "Id", "Cím", "Rendező", "Év");
        for (Movies movies : moviesList) {
            System.out.printf("%2d %20s %20s %6d\n", 
                movies.getId(), 
                movies.getTitle(), 
                movies.getDirector(), 
                movies.getRelease_year()
            );
        }
    }
}
