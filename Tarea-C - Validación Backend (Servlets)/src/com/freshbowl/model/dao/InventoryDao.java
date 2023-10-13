package com.freshbowl.model.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.freshbowl.model.pojos.InventoryItem;
import com.freshbowl.model.pojos.User;

public class InventoryDao implements IDao<InventoryItem> {

    @Override
    public List<InventoryItem> getAll() {
        
        List<InventoryItem> inventoryItems = new ArrayList<>();
        ResultSet resultSet = DataSource.ejecuteQuery("SELECT * FROM users", null).getResultSet();
        try 
        {
            while (resultSet.next()) {
                
                int itemId = resultSet.getInt("item_id");
                String itemName = resultSet.getString("name");
                int quantity = resultSet.getInt("quantity");
                double price = resultSet.getDouble("price");

                InventoryItem inventoryItem = new InventoryItem(itemId, itemName, quantity, price);
                inventoryItems.add(inventoryItem);
            }
        } 
        catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public InventoryItem get(int idItem) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'get'");
    }

    @Override
    public DaoResult create(InventoryItem newItem) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'create'");
    }

    @Override
    public DaoResult update(InventoryItem newItem) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public DaoResult delete(InventoryItem newItem) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

}
