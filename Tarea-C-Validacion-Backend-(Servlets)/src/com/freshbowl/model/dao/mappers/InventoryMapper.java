package com.freshbowl.model.dao.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.freshbowl.model.pojos.InventoryItem;
import com.freshbowl.model.pojos.output.InventoryOut;

public class InventoryMapper implements IMapper<InventoryItem>{

    @Override
    public InventoryItem map(ResultSet resultSet) throws SQLException {
        
        if(resultSet==null)
            return null;

        int itemId = resultSet.getInt("item_id");
        String itemName = resultSet.getString("name");
        String itemTypeName = resultSet.getString("product_type");
        int itemType = resultSet.getInt("item_type");
        int quantity = resultSet.getInt("quantity");
        double itemPrice = resultSet.getDouble("price");
        String itemImg = resultSet.getString("img");
        int unit = resultSet.getInt("unit");
        String unitName = resultSet.getString("unit_name");
        boolean unitType = resultSet.getBoolean("units_type");
        String acquisitionDate = resultSet.getString("acquisition_date");
        String expiryDate = resultSet.getString("expiry_date");
        String comments = resultSet.getString("coments");
        String description = resultSet.getString("description");
        String provider = resultSet.getString("provider");
        return new InventoryOut(itemId, itemName, itemType, quantity, itemPrice, unit, itemImg, acquisitionDate, expiryDate, description, comments, provider, unitName, unitType, itemTypeName);

    }

    @Override
    public Object[] demap(InventoryItem entity) {
        
        return new Object[]{entity.getItemName(), entity.getItemType(), entity.getQuantity(), entity.getPrice(), entity.getImg(), entity.getUnit(), entity.getAcquisitionDate(), entity.getExpiryDate(), entity.getDescription(), entity.getComments(), entity.getProvider()};
    }

    @Override
    public Object[] outputDemap(InventoryItem entity) {

        InventoryOut entityOut = (InventoryOut)entity;
        return new Object[]{entityOut.getItemName(), entityOut.getItemType(),entityOut.getQuantity(), entityOut.getPrice(), entityOut.getImg(), entityOut.getUnit(), entityOut.getAcquisitionDate(), entityOut.getExpiryDate(), entityOut.getDescription(), entityOut.getComments(), entityOut.getProvider(), entityOut.getItemTypeName(), entityOut.getUnitName(), entityOut.isUnitType()};
    }

    @Override
    public Object[] demapKey(InventoryItem entity) {
        
        return new Object[]{entity.getItemName(), entity.getItemType(),entity.getQuantity(), entity.getPrice(), entity.getImg(), entity.getUnit(), entity.getAcquisitionDate(), entity.getExpiryDate(), entity.getDescription(), entity.getComments(), entity.getProvider(), entity.getItemId()};
    }

    @Override
    public Object[] outputDemapKey(InventoryItem entity) {
        
        InventoryOut entityOut = (InventoryOut)entity;
        return new Object[]{entityOut.getItemName(), entityOut.getItemType(),entityOut.getQuantity(), entityOut.getPrice(), entityOut.getImg(), entityOut.getUnit(), entityOut.getAcquisitionDate(), entityOut.getExpiryDate(), entityOut.getDescription(), entityOut.getComments(), entityOut.getProvider(), entityOut.getItemTypeName(), entityOut.getUnitName(), entityOut.isUnitType(), entityOut.getItemId()};
    }

}
