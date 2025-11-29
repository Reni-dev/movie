package com.example.models;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MoviesSource implements DataAccessible<Movies> {
    Database database;
    public MoviesSource(Database database){
        this.database = database;
    }

    @Override
    public List<Movies> get() {
        try{
            return tryGet();
        }catch(SQLException e){
            System.err.println(e.getMessage());
            return null;
        }
    }

    private List<Movies> tryGet() throws SQLException{
        Connection conn = database.connect();
        String sql = "select * from movies";
        Statement sm = conn.createStatement();
        ResultSet rs = sm.executeQuery(sql);

        List<Movies> moviesList = new ArrayList<>();

        while (rs.next()) { 
            Movies movies = new Movies();

            movies.setId(rs.getInt("id"));
            movies.setTitle(rs.getString("title"));
            movies.setDirector(rs.getString("director"));
            movies.setRelease_year(rs.getInt("release_year"));
            movies.setGenre(rs.getString("genre"));

            moviesList.add(movies);
        }        
        return moviesList;
    }

    @Override
    public void add(Movies data) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @SuppressWarnings("unused")
    private void tryAdd(){
    }

    @Override
    public void edit(Movies data, int id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @SuppressWarnings("unused")
    private void tryEdit(){
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @SuppressWarnings("unused")
    private void tryDelete(){
    }    
}
