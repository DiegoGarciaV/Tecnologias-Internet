package com.freshbowl.model.dao;

import java.sql.ResultSet;

public class DaoResult {
    
    private boolean success;
    private String message;
    private int operatedRecords;
    private ResultSet resultSet;

    
    public DaoResult(boolean success, String message, int operatedRecords, ResultSet resultSet) {
        this.success = success;
        this.message = message;
        this.operatedRecords = operatedRecords;
        this.resultSet = resultSet;
    }

    public DaoResult(String message) {
        this.success = false;
        this.message = message;
        this.operatedRecords = 0;
        this.resultSet = null;
    }

    public boolean isSuccess() {
        return success;
    }

    public String getMessage() {
        return message;
    }

    public int getOperatedRecords() {
        return operatedRecords;
    }

    public ResultSet getResultSet() {
        return resultSet;
    }
    
    
}
