package com.freshbowl.model.dao;

import java.util.List;

public interface IDao<T> {
    
    public  List<T> getAll(); 

    public T get(int idItem);

    public DaoResult<T> create(T newItem);

    public DaoResult<T> update(T newItem);

    public DaoResult<T> delete(T newItem);
}
