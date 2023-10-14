package com.freshbowl.model.dao.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface IMapper<T> {

    T map(ResultSet resultSet) throws SQLException;

    Object[] demap(T entity);

    Object[] demapKey(T entity);

    Object[] outputDemap(T entity);

    Object[] outputDemapKey(T entity);
    
}
