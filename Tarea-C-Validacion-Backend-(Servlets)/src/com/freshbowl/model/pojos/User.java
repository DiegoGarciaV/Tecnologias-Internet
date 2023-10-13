package com.freshbowl.model.pojos;

public class User {

    protected int userId;
    protected String name;
    protected String lastname;
    protected int job;
    
    public User(int userId, String name, String lastname, int job) {
        this.userId = userId;
        this.name = name;
        this.lastname = lastname;
        this.job = job;
    }
    public int getUserId() {
        return userId;
    }
    public String getName() {
        return name;
    }
    public String getLastname() {
        return lastname;
    }
    public int getJob() {
        return job;
    }
    
    
}
