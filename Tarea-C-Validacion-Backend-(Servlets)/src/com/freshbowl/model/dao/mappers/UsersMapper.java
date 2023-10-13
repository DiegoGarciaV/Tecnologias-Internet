package com.freshbowl.model.dao.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.freshbowl.model.pojos.User;
import com.freshbowl.model.pojos.output.UserOut;

public class UsersMapper implements IMapper<User>{

    @Override
    public User map(ResultSet resultSet) throws SQLException {
        
        if(resultSet==null)
            return null;

        int userId = resultSet.getInt("user_id");
        String userName = resultSet.getString("name");
        String userLastName = resultSet.getString("lastname");
        int userJob = resultSet.getInt("job");
        String userJobName = resultSet.getString("job_name");
        return new UserOut(userId, userName, userLastName, userJob, userJobName);
    }

    @Override
    public Object[] demap(User entity) {
        
        return new Object[]{entity.getName(), entity.getLastname(), entity.getJob(),entity.getUserId()};
    }

    @Override
    public Object[] outputDemap(User entity) {
       
        return new Object[]{entity.getName(), entity.getLastname(), entity.getJob()};
    }
    
}
