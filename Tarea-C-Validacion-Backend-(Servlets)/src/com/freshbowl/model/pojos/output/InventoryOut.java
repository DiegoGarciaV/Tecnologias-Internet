package com.freshbowl.model.pojos.output;

import com.freshbowl.model.pojos.InventoryItem;

public class InventoryOut extends InventoryItem{

    private String unitName;
    private boolean unitType;
    private String itemTypeName;
    public InventoryOut(int itemId, String itemName, int itemType, int quantity, double price, int unit, String img,
            String acquisitionDate, String expiryDate, String description, String comments, String provider,
            String unitName, boolean unitType, String itemTypeName) {
        super(itemId, itemName, itemType, quantity, price, unit, img, acquisitionDate, expiryDate, description,
                comments, provider);
        this.unitName = unitName;
        this.unitType = unitType;
        this.itemTypeName = itemTypeName;
    }

    public String getUnitName() {
        return unitName;
    }
    public boolean isUnitType() {
        return unitType;
    }
    public String getItemTypeName() {
        return itemTypeName;
    }

    
}
