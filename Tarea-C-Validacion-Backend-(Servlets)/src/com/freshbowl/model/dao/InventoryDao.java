package com.freshbowl.model.dao;

import java.util.List;

import com.freshbowl.model.dao.mappers.InventoryMapper;
import com.freshbowl.model.pojos.InventoryItem;

public class InventoryDao implements IDao<InventoryItem> {

    @Override
    public List<InventoryItem> getAll() {
        
       return DataSource.ejecuteQuery("SELECT * FROM inventory", null,new InventoryMapper()).getResultSet();
        
    }

    @Override
    public InventoryItem get(int idItem) {
        
        List<InventoryItem> inventoryItems = DataSource.ejecuteQuery("SELECT * FROM inventory WHERE item_id = ?", new Object[]{idItem},new InventoryMapper()).getResultSet();

        if(inventoryItems != null && !inventoryItems.isEmpty())
            return inventoryItems.get(0);
        else
            return null;

    }

    @Override
    public DaoResult<InventoryItem> create(InventoryItem newItem) {
        
        String sqlQuery = "INSERT INTO inventory(name, quantity, price) VALUES (?,?,?,?,?);";
        InventoryMapper mapper = new InventoryMapper();
        return DataSource.executeUpdate(sqlQuery, mapper.outputDemap(newItem));
    }

    @Override
    public DaoResult<InventoryItem> update(InventoryItem updateItem) {
        
        String sqlQuery = "UPDATE inventory SET name = ? , quantity = ?, price = ?, unit = ?, img = ? WHERE item_id = ?";
        InventoryMapper mapper = new InventoryMapper();
        return DataSource.executeUpdate(sqlQuery, mapper.demap(updateItem));
    }

    @Override
    public DaoResult<InventoryItem> delete(InventoryItem deleteItem) {

        String sqlQuery = "DELETE FROM inventory WHERE item_id = ?";
        return DataSource.executeUpdate(sqlQuery, new Object[]{deleteItem.getItemId()});
    }

}
