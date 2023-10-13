package com.freshbowl.service;

import java.util.List;

import com.freshbowl.model.dao.UserDao;
import com.freshbowl.model.pojos.User;
import com.freshbowl.model.pojos.output.UserOut;

public class UsersTest {
    
    public static void main(String[] args) {
        
        UserDao userDao = new UserDao();
        String response;

        User user = new User(0, "Nuevo","Chef", 3);
        response = userDao.create(user).getMessage();
        System.out.println(response);

        int lastId = 0;
        List<User> users = userDao.getAll();
        for(User user2 : users)
        {
            UserOut u2 = (UserOut)user2;
            StringBuilder userString = new StringBuilder("ID:\t\t");
            userString.append(u2.getUserId())
            .append("\nNAME:\t\t")
            .append(u2.getName())
            .append("\nLASTNAME:\t")
            .append(u2.getLastname())
            .append("\nJOB:\t\t")
            .append(u2.getJobName())
            .append("\n");
            System.out.println(userString);
            lastId = u2.getUserId();
        }

        System.out.println("\nUsuario " + lastId + ":");
        UserOut u2 = (UserOut)userDao.get(lastId);
        StringBuilder userString;
        if(u2!=null)
        {
            userString = new StringBuilder("ID:\t\t");
            userString.append(u2.getUserId())
            .append("\nNAME:\t\t")
            .append(u2.getName())
            .append("\nLASTNAME:\t")
            .append(u2.getLastname())
            .append("\nJOB:\t\t")
            .append(u2.getJobName())
            .append("\n");
            System.out.println(userString);

            User u2p = new User(u2.getUserId(), "Antiguo", u2.getLastname(), 2);
            response = userDao.update(u2p).getMessage();
            System.out.println(response);

            System.out.println("\nUsuario " + lastId + " despues: ");
            u2 = (UserOut)userDao.get(lastId);
            userString = new StringBuilder("ID:\t\t");
            userString.append(u2.getUserId())
            .append("\nNAME:\t\t")
            .append(u2.getName())
            .append("\nLASTNAME:\t")
            .append(u2.getLastname())
            .append("\nJOB:\t\t")
            .append(u2.getJobName())
            .append("\n");
            System.out.println(userString);
            
            System.out.println("Eliminando usuario " + lastId);
            response = userDao.delete(u2).getMessage();
            System.out.println(response);

        }
        else
            System.err.println("No se encontro el usuario " + lastId);
        

        

        
    }
}
