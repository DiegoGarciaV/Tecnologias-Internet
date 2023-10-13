package com.freshbowl.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.freshbowl.model.dao.mappers.IMapper;

public class DataSource {

    private static final String URL = "jdbc:mysql://localhost/internet_tech";
    private static final String USER = "root";
    private static final String PASSWORD = "1234";

    private DataSource(){}

    public static Connection getConnection() throws SQLException, ClassNotFoundException
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

   

    public static <T> DaoResult<T> ejecuteQuery(String sqlQuery, Object[] params, IMapper<T> mapper)
    {
        PreparedStatement preparedStatement = null;

        List<T> itemsList = new ArrayList<>();
        try(Connection connection = getConnection())
        {
            ResultSet resultSet = null;
            preparedStatement = connection.prepareStatement(sqlQuery);
            if(params != null)
            {
                for(int i = 0; i < params.length; i++)
                    preparedStatement.setObject(i + 1,params[i]);
            }

            resultSet = preparedStatement.executeQuery();

            
            while (resultSet.next()) {

                T item = mapper.map(resultSet);
                itemsList.add(item);
            }
            return new DaoResult<>(true, "Consulta ejecutada con éxito", 0,itemsList);
        }
        catch(Exception e)
        {
            System.err.println(e.getMessage());
            return new DaoResult<>(e.getMessage());
        }
        finally
        {
            try {
                if(preparedStatement!= null)
                    preparedStatement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
       
    }

    public static <T> DaoResult<T> executeUpdate(String sqlQuery, Object[] params)
    {
        PreparedStatement preparedStatement = null;

        try(Connection connection = getConnection())
        {
            int operatedRecord = 0;
            preparedStatement = connection.prepareStatement(sqlQuery);
            for(int i = 0; i < params.length; i++)
                preparedStatement.setObject(i + 1,params[i]);

            operatedRecord = preparedStatement.executeUpdate();
            return new DaoResult<>(true, "Actualiacion ejecutada con éxito", operatedRecord,null);
        }
        catch(Exception e)
        {
            return new DaoResult<>(e.getMessage());
        }
        finally
        {
            try {
                if(preparedStatement!= null)
                    preparedStatement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
       
    }
    
}
