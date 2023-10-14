package com.freshbowl.servlets.forms;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.freshbowl.model.dao.DataSource;
import com.freshbowl.model.pojos.InventoryItem;

public class InventoryValidator {

    private String itemId;
    private String itemName;
    private String itemType;
    private String quantity;
    private String price;
    private String unit;
    private String img;
    private String acquisitionDate;
    private String expiryDate;
    private String description;
    private String comments;
    private String provider;

    
    private InventoryItem inventoryItem;
    private Map<String, String> errorsMesages;

    public InventoryValidator(String itemId, String itemName, String itemType, String quantity, String price,
            String unit, String img, String acquisitionDate, String expiryDate, String description, String comments,
            String provider) {
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

        errorsMesages = new HashMap<>();
    }


    public InventoryItem getInventoryItem() {
        return inventoryItem;
    }

    public Map<String, String> getErrorsMesages() {
        return errorsMesages;
    }

    public int validateItemId() {
        int itemIdFormat = numericValidator(itemId);

        if(itemIdFormat == -1)
        {
            itemIdFormat = 0;
            errorsMesages.put("Id del articulo", "No ha ingresado un Id numerico.");
        }
        
        return itemIdFormat;
    }
    public int validateQuantity() {

        int itemQuantity = numericValidator(quantity);

        if(itemQuantity == -1)
        {
            itemQuantity = 0;
            errorsMesages.put("Cantidad en stock", "No ha ingresado un valor numerico.");
        }
        
        return itemQuantity;
    }

    public double validatePrice() {
        double itemPrice = decimalValidator(price);

        if(itemPrice == -1)
        {
            itemPrice = 0;
            errorsMesages.put("Precio del articulo", "No ha ingresado un valor numerico.");
        }
        
        return itemPrice;
    }

    public int validateUnit()
    {
        List<Map<String,String>> avaibleUnits = availableOptions("units");
        for(Map<String,String>  tuple : avaibleUnits)
        {
            if(tuple.get("item").equals(unit))
                return numericValidator(tuple.get("idItem"));
        }
        errorsMesages.put("Unidad de medida", "No ha ingresado unidad de medida valida.");
        return -1;

        
    }

    public boolean validateItemSupplier()
    {
        if(provider.isEmpty())
        {
            errorsMesages.put("Provedor", "No se ha informado proveedor.");
            return false;
        }

        return true;
    }

    public int validateType()
    {
        List<Map<String,String>> avaibleTypes = availableOptions("product_types");
        for(Map<String,String>  tuple : avaibleTypes)
        {
            if(tuple.get("item").equals(itemType))
                return numericValidator(tuple.get("idItem"));
        }
        errorsMesages.put("Tipo de articulo", "No ha ingresado un tipo de articulo valido.");
        return -1;
    }

    public String validateExpiryDate()
    {
        if(expiryDate.isEmpty())
            return null;

        DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        try {
            LocalDate aqDate = LocalDate.parse(acquisitionDate, formatoFecha);
            LocalDate exDate = LocalDate.parse(expiryDate, formatoFecha);

            if(!exDate.isAfter(aqDate))
            {
                errorsMesages.put("Fecha de caducidad", "Se ingreso una fecha de caducidad anterior a la fecha de adquisicion.");
            }
        } catch (Exception e) {
            errorsMesages.put("Formato de fecha incorrecto", "Se ha recibido una fecha en un formato distinto al esperado (YYYY-MM-DD).");
        }
        
        return expiryDate;
    }

    public InventoryItem validateForm()
    {
        validateItemId();
        validateType();
        validateQuantity();
        validatePrice();
        validateUnit();
        validateItemSupplier();
        validateExpiryDate();
        if(errorsMesages.isEmpty())
        {
            return new InventoryItem(validateItemId(), itemName, validateType(), validateQuantity(), validatePrice(), validateUnit(), img, acquisitionDate, validateExpiryDate(), description, comments, provider);

        }
        return null;
    }

    private int numericValidator(String numericValue)
    {
        int itemValueFormat;
        try {
            itemValueFormat = Integer.parseInt(numericValue);
        } catch (NumberFormatException e) {

            itemValueFormat = -1;
        }
        return itemValueFormat;
    }

    private double decimalValidator(String numericValue)
    {
        double itemValueFormat;
        try {
            itemValueFormat = Double.parseDouble(numericValue);
        } catch (NumberFormatException e) {

            itemValueFormat = -1;
        }
        return itemValueFormat;
    }

    private List<Map<String,String>> availableOptions(String inventoryField)
    {
        StringBuilder availableOptions = new StringBuilder("SELECT * FROM ")
        .append(inventoryField);

        return DataSource.getList(availableOptions.toString(), null).getResultSet();
    }

}
