package com.freshbowl.service;

import java.util.List;

import com.freshbowl.model.dao.InventoryDao;
import com.freshbowl.model.pojos.InventoryItem;

public class InventoryTest {
    
    public static void main(String[] args) {
        
        InventoryDao inventoryDao = new InventoryDao();
        String response;

        InventoryItem inventoryItem = new InventoryItem(0, "Jitomate",60, 14.90);
        response = inventoryDao.create(inventoryItem).getMessage();
        System.out.println(response);

        inventoryItem = new InventoryItem(0, "Tomate",30, 9.90);
        response = inventoryDao.create(inventoryItem).getMessage();
        System.out.println(response);

        inventoryItem = new InventoryItem(0, "Mango",20, 35.50);
        response = inventoryDao.create(inventoryItem).getMessage();
        System.out.println(response);

        inventoryItem = new InventoryItem(0, "Queso de cabra",2, 450.00);
        response = inventoryDao.create(inventoryItem).getMessage();
        System.out.println(response);

        inventoryItem = new InventoryItem(0, "Pollo",5, 198.0);
        response = inventoryDao.create(inventoryItem).getMessage();
        System.out.println(response);

        inventoryItem = new InventoryItem(0, "Pollo",5, 198.0);
        response = inventoryDao.create(inventoryItem).getMessage();
        System.out.println(response);

        int lastId = 0;
        List<InventoryItem> inventoryItems = inventoryDao.getAll();
        for(InventoryItem inventoryItem2 : inventoryItems)
        {
            StringBuilder inventoryItemString = new StringBuilder("ID:\t\t");
            inventoryItemString.append(inventoryItem2.getItemId())
            .append("\nITEM_NAME:\t")
            .append(inventoryItem2.getItemName())
            .append("\nQUANTITY:\t")
            .append(inventoryItem2.getQuantity())
            .append("\nPRICE:\t\t")
            .append(inventoryItem2.getPrice())
            .append("\n");
            System.out.println(inventoryItemString);
            lastId = inventoryItem2.getItemId();
        }

        System.out.println("\nItem " + lastId + ":");
        InventoryItem inventoryItem2 = inventoryDao.get(lastId);
        StringBuilder inventoryItemString;
        if(inventoryItem2!=null)
        {
            inventoryItemString = new StringBuilder("ID:\t\t");
            inventoryItemString.append(inventoryItem2.getItemId())
            .append("\nITEM_NAME:\t")
            .append(inventoryItem2.getItemName())
            .append("\nQUANTITY:\t")
            .append(inventoryItem2.getQuantity())
            .append("\nPRICE:\t\t")
            .append(inventoryItem2.getPrice())
            .append("\n");
            System.out.println(inventoryItemString);

            InventoryItem inventoryItem2p = new InventoryItem(inventoryItem2.getItemId(), "Tomate", inventoryItem2.getQuantity()+10, 17.95);
            response = inventoryDao.update(inventoryItem2p).getMessage();
            System.out.println(response);

            System.out.println("\nItem " + lastId + " despues: ");
            inventoryItem2 = inventoryDao.get(lastId);
            inventoryItemString = new StringBuilder("ID:\t\t");
            inventoryItemString.append(inventoryItem2.getItemId())
            .append("\nITEM_NAME:\t")
            .append(inventoryItem2.getItemName())
            .append("\nQUANTITY:\t")
            .append(inventoryItem2.getQuantity())
            .append("\nPRICE:\t\t")
            .append(inventoryItem2.getPrice())
            .append("\n");
            System.out.println(inventoryItemString);

            System.out.println("Eliminando Item " + lastId);
            response = inventoryDao.delete(inventoryItem2).getMessage();
            System.out.println(response);

        }
        else
            System.err.println("No se encontro el Item " + lastId);
        

        

       
    }
}
