package com.freshbowl.model.pojos.output;

import com.freshbowl.model.pojos.User;

public class UserOut extends User{

    private String jobName;
    
    public UserOut(int userId, String name, String lastname, int job, String jobName) {
        super(userId, jobName, lastname, job);
        this.userId = userId;
        this.name = name;
        this.lastname = lastname;
        this.jobName = jobName;
    }

    public String getJobName() {
        return jobName;
    }
}
