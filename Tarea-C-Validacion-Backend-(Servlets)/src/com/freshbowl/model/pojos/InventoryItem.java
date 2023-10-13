package com.freshbowl.model.pojos;

public class InventoryItem {
    
    private int itemId;
    private String itemName;
    private int quantity;
    private double price;
    private String unit;
    private String img;

    

    public InventoryItem(int itemId, String itemName, int quantity, double price, String unit, String img) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.quantity = quantity;
        this.price = price;
        this.unit = unit;
        this.img = img;
    }

    public int getItemId() {
        return itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public String getUnit() {
        return unit;
    }

    public String getImg() {
        return img;
    }

    
}
