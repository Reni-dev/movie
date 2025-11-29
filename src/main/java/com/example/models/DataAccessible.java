package com.example.models;

import java.util.List;

public interface DataAccessible<T>{
    public List<T> get();
    public void add(T data);
    public void edit(T data, int id);
    public void delete(int id);
}
