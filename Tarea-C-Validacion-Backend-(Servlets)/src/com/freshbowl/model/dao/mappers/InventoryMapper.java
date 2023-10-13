package com.freshbowl.model.dao.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.freshbowl.model.pojos.InventoryItem;

public class InventoryMapper implements IMapper<InventoryItem>{

    @Override
    public InventoryItem map(ResultSet resultSet) throws SQLException {
        
        if(resultSet==null)
            return null;

        int itemId = resultSet.getInt("item_id");
        String itemName = resultSet.getString("name");
        int itemQuantity = resultSet.getInt("quantity");
        double itemPrice = resultSet.getDouble("price");
        String itemUnit = resultSet.getString("unit");
        String itemImg = resultSet.getString("img");
        return new InventoryItem(itemId, itemName, itemQuantity, itemPrice,itemUnit, itemImg);
        
    }

    @Override
    public Object[] demap(InventoryItem entity) {
        
        return new Object[]{entity.getItemName(),entity.getQuantity(), entity.getPrice(), entity.getUnit(), entity.getImg(), entity.getItemId()};
    }

    @Override
    public Object[] outputDemap(InventoryItem entity) {

        return new Object[]{entity.getItemName(),entity.getQuantity(), entity.getPrice(), entity.getUnit(), entity.getImg()};
    }

}
