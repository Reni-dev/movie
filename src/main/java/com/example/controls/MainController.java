package com.example.controls;

import java.util.List;

import com.example.models.Movies;
import com.example.models.MoviesSource;
import com.example.models.Sqlite;
import com.example.views.MainView;

public class MainController {
    MoviesSource moviesSource = new MoviesSource(new Sqlite());

    public void start(){
        List<Movies> moviesList = moviesSource.get(); 
        MainView mv = new MainView();
        mv.show(moviesList);
    }
}
