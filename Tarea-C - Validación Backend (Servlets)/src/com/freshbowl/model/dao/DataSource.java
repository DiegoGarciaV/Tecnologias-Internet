package com.freshbowl.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DataSource {

    private static final String URL = "jdbc:mysql://localhost/internet_tech";
    private static final String USER = "root";
    private static final String PASSWORD = "1234";

    public static Connection getConnection() throws SQLException 
    {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

   

    public static DaoResult ejecuteQuery(String sqlQuery, Object[] params)
    {
        PreparedStatement preparedStatement = null;

        try(Connection connection = getConnection())
        {
            ResultSet resultSet = null;
            preparedStatement = connection.prepareStatement(sqlQuery);
            for(int i = 0; i < params.length; i++)
                preparedStatement.setObject(i + 1,params[i]);

            resultSet = preparedStatement.executeQuery();
            return new DaoResult(true, "Consulta ejecutada con éxito", 0,resultSet);
        }
        catch(SQLException e)
        {
            return new DaoResult(e.getMessage());
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

    public static DaoResult executeUpdate(String sqlQuery, Object[] params)
    {
        PreparedStatement preparedStatement = null;

        try(Connection connection = getConnection())
        {
            int operatedRecord = 0;
            preparedStatement = connection.prepareStatement(sqlQuery);
            for(int i = 0; i < params.length; i++)
                preparedStatement.setObject(i + 1,params[i]);

            operatedRecord = preparedStatement.executeUpdate();
            return new DaoResult(true, "Consulta ejecutada con éxito", operatedRecord,null);
        }
        catch(SQLException e)
        {
            return new DaoResult(e.getMessage());
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
