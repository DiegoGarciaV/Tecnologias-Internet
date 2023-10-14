package com.freshbowl.model.pojos;

public class InventoryItem {
    
    protected int itemId;
    protected String itemName;
    protected int itemType;
    protected int quantity;
    protected double price;
    protected int unit;
    protected String img;
    protected String acquisitionDate;
    protected String expiryDate;
    protected String description;
    protected String comments;
    protected String provider;
    

    


    public InventoryItem(int itemId, String itemName, int itemType, int quantity, double price, int unit, String img, String acquisitionDate, String expiryDate, String description,
            String comments, String provider) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.itemType = itemType;
        this.quantity = quantity;
        this.price = price;
        this.unit = unit;
        this.img = img;
        this.acquisitionDate = acquisitionDate;
        this.expiryDate = expiryDate;
        this.description = description;
        this.comments = comments;
        this.provider = provider;
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

    public int getUnit() {
        return unit;
    }

    public String getImg() {
        return img;
    }

    public int getItemType() {
        return itemType;
    }


    public String getAcquisitionDate() {
        return acquisitionDate;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public String getDescription() {
        return description;
    }

    public String getComments() {
        return comments;
    }

    public String getProvider() {
        return provider;
    }

    
}
