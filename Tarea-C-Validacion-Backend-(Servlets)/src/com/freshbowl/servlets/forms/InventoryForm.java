package com.freshbowl.servlets.forms;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.freshbowl.model.dao.InventoryDao;
import com.freshbowl.model.pojos.InventoryItem;

public class InventoryForm extends HttpServlet  {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        InventoryDao inventoryDao = new InventoryDao();
        List<InventoryItem> inventoryItems = inventoryDao.getAll();
        InventoryItem inventoryItem = null;
        if(!inventoryItems.isEmpty())
                inventoryItem = inventoryItems.get(0);

        request.setAttribute("item", inventoryItem);
        try {
            
        request.getRequestDispatcher("../views/forms/inventory/crud-form.jsp").forward(request, response);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int itemId = Integer.parseInt(request.getParameter("itemId"));
        String itemName = request.getParameter("itemName");
        String itemType = request.getParameter("itemType");
        String itemSize = request.getParameter("itemSize");
        String itemAcquisition = request.getParameter("itemAcquisition");
        String itemExpiry = request.getParameter("itemExpiry");
        String itemDesc = request.getParameter("itemDesc");
        String itemComments = request.getParameter("itemComments");
        String itemSupplier = request.getParameter("itemSupplier");


        InventoryDao inventoryDao = new InventoryDao();
        InventoryItem inventoryItem = inventoryDao.get(itemId);
        
        request.setAttribute("item", inventoryItem);
        try {
            
        request.getRequestDispatcher("../views/forms/inventory/crud-form.jsp").forward(request, response);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

}
