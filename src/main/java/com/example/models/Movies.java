package com.example.models;

public class Movies {
    Integer id;
    String title;
    String director;
    Integer release_year;
    String genre;

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Movies() {
    }

    public Movies(String title, String director, Integer release_year, String genre) {
        this.title = title;
        this.director = director;
        this.release_year = release_year;
        this.genre = genre;
    }

    public Movies(Integer id, String title, String director, Integer release_year, String genre) {
        this.id = id;
        this.title = title;
        this.director = director;
        this.release_year = release_year;
        this.genre = genre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Integer getRelease_year() {
        return release_year;
    }

    public void setRelease_year(Integer release_year) {
        this.release_year = release_year;
    }   
}
