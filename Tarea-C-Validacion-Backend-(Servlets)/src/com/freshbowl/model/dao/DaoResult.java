package com.freshbowl.model.dao;

import java.util.List;

public class DaoResult<T> {
    
    private boolean success;
    private String message;
    private int operatedRecords;
    private List<T> resultSet;

    
    public DaoResult(boolean success, String message, int operatedRecords, List<T> resultSet) {
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

    public List<T> getResultSet() {
        return resultSet;
    }
    
    
}
