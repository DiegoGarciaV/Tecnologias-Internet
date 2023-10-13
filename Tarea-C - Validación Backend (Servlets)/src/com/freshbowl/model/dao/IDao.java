package com.freshbowl.model.dao;

import java.util.List;

public interface IDao<T> {
    
    public  List<T> getAll(); 

    public T get(int idItem);

    public DaoResult create(T newItem);

    public DaoResult update(T newItem);

    public DaoResult delete(T newItem);
}
