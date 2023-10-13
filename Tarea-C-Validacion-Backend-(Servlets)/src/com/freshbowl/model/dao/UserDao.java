package com.freshbowl.model.dao;

import java.util.List;

import com.freshbowl.model.dao.mappers.UsersMapper;
import com.freshbowl.model.pojos.User;

public class UserDao implements IDao<User>{

    @Override
    public List<User> getAll() {
        
        return DataSource.ejecuteQuery("SELECT * FROM users_desc", null,new UsersMapper()).getResultSet();
    }

    @Override
    public User get(int idItem) {
        List<User> users = DataSource.ejecuteQuery("SELECT * FROM users_desc WHERE user_id = ?;", new Object[]{idItem},new UsersMapper()).getResultSet();

        if(users != null && !users.isEmpty())
            return users.get(0);
        else
            return null;
    }

    @Override
    public DaoResult<User> create(User newUser) {
        
        String sqlQuery = "INSERT INTO users(name, lastname, job) VALUES (?,?,?);";
        UsersMapper mapper = new UsersMapper();
        return DataSource.executeUpdate(sqlQuery, mapper.outputDemap(newUser));
    }

    @Override
    public DaoResult<User> update(User newUser) {
        
        String sqlQuery = "UPDATE users SET name = ? , lastname = ?, job = ? WHERE user_id = ?";
        UsersMapper mapper = new UsersMapper();
        return DataSource.executeUpdate(sqlQuery, mapper.demap(newUser));
    }

    @Override
    public DaoResult<User> delete(User deleteUser) {
        
        String sqlQuery = "DELETE FROM users WHERE user_id = ?";
        return DataSource.executeUpdate(sqlQuery, new Object[]{deleteUser.getUserId()});
    }
    
}
