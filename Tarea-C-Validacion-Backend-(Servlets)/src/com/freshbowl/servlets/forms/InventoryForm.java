package com.freshbowl.servlets.forms;

import java.io.IOException;
import java.util.List;
import java.util.Map;

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
        if(inventoryItem!= null)
            request.setAttribute("initialId", inventoryItem.getItemId());
        else
            request.setAttribute("initialId", 0);
        try {
            
        request.getRequestDispatcher("../views/forms/inventory/crud-form.jsp").forward(request, response);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {


        String itemId = request.getParameter("itemId");
        String itemType = request.getParameter("itemType");
        String itemName = request.getParameter("itemName");
        String itemSize = request.getParameter("itemSize");
        String itemUnit = request.getParameter("itemUnit");
        String itemPrice = request.getParameter("itemPrice");
        String itemAcquisition = request.getParameter("itemAcquisition");
        String itemExpiry = request.getParameter("itemExpiry");
        String itemDesc = request.getParameter("itemDesc");
        String itemComments = request.getParameter("itemComments");
        String itemSupplier = request.getParameter("itemSupplier");

        String itemImg = "imgs/ingredients/";

        InventoryValidator inventoryValidator = new InventoryValidator(itemId, itemName, itemType, itemSize, itemPrice, itemUnit, itemImg, itemAcquisition, itemExpiry, itemDesc, itemComments, itemSupplier);

        InventoryItem inventoryItem = inventoryValidator.validateForm();
        if(inventoryItem != null)
        {
            InventoryDao inventoryDao = new InventoryDao();
            InventoryItem previusInventoryItem = inventoryDao.get(inventoryItem.getItemId());
            if(previusInventoryItem != null)
                inventoryDao.update(inventoryItem);
            else
                inventoryDao.create(inventoryItem);
                
        }
        else
        {
            request.setAttribute("errors", inventoryValidator.getErrorsMesages());
        }
        request.setAttribute("initialId", 0);
        for(Map.Entry<String,String> tuple : inventoryValidator.getErrorsMesages().entrySet())
        {
            System.err.println(tuple.getKey() + ": " + tuple.getValue());
        }
        try {
            
        request.getRequestDispatcher("../views/forms/inventory/crud-form.jsp").forward(request, response);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

}
