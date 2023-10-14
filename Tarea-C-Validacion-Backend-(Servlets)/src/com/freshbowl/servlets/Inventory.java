package com.freshbowl.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.freshbowl.model.dao.InventoryDao;
import com.freshbowl.model.pojos.InventoryItem;
import com.freshbowl.model.pojos.output.InventoryOut;

public class Inventory extends HttpServlet  {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");
        
        InventoryDao inventoryDao = new InventoryDao();
        List<InventoryItem> inventoryItems = inventoryDao.getAll();
        List<InventoryOut> inventoryItemsOut = new ArrayList<>();

        for(InventoryItem item : inventoryItems)    
        {
            InventoryOut itemOut = (InventoryOut)item;
            inventoryItemsOut.add(itemOut);
        }
        request.setAttribute("inventory", inventoryItemsOut);
        try {
            
        request.getRequestDispatcher("views/forms/inventory/index.jsp").forward(request, response);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    
}
