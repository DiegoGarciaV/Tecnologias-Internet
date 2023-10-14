package com.freshbowl.servlets.forms;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.freshbowl.model.dao.DaoResult;
import com.freshbowl.model.dao.InventoryDao;
import com.freshbowl.model.pojos.InventoryItem;
import com.freshbowl.model.pojos.output.InventoryOut;

public class InventoryForm extends HttpServlet  {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");
        InventoryDao inventoryDao = new InventoryDao();
        List<InventoryItem> inventoryItems = inventoryDao.getAll();
        InventoryItem inventoryItem = null;
        if(!inventoryItems.isEmpty())
                inventoryItem = inventoryItems.get(0);

        
        if(inventoryItem!= null)
        {
            request.setAttribute("initialId", inventoryItem.getItemId());
            InventoryOut inventoryOut = (InventoryOut)inventoryItem;
            Map<String,String> submitedValues = new HashMap<>();
            submitedValues.put("itemId", inventoryOut.getItemId() + "");
            submitedValues.put("itemType", inventoryOut.getItemTypeName());
            submitedValues.put("itemName", inventoryOut.getItemName());
            submitedValues.put("itemSize", inventoryOut.getQuantity() + "");
            submitedValues.put("itemUnit", inventoryOut.getUnitName());
            submitedValues.put("itemPrice", inventoryOut.getPrice() + "");
            submitedValues.put("itemAcquisition", inventoryOut.getAcquisitionDate());
            submitedValues.put("itemExpiry", inventoryOut.getExpiryDate());
            submitedValues.put("itemDesc", inventoryOut.getDescription());
            submitedValues.put("itemComments", inventoryOut.getComments());
            submitedValues.put("itemSupplier", inventoryOut.getProvider());
            request.setAttribute("item", submitedValues);
        }
        else
        {
            Map<String,String> submitedValues = new HashMap<>();
            submitedValues.put("itemId", "");
            submitedValues.put("itemType", "");
            submitedValues.put("itemName", "");
            submitedValues.put("itemSize", "");
            submitedValues.put("itemUnit", "");
            submitedValues.put("itemPrice", "");
            submitedValues.put("itemAcquisition", "");
            submitedValues.put("itemExpiry", "");
            submitedValues.put("itemDesc", "");
            submitedValues.put("itemComments", "");
            submitedValues.put("itemSupplier", "");
            request.setAttribute("item", submitedValues);
            request.setAttribute("initialId", 0);
        }
            
        try {
            
        request.getRequestDispatcher("../views/forms/inventory/crud-form.jsp").forward(request, response);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");
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
            {
                DaoResult<InventoryItem> result = inventoryDao.update(inventoryItem);
                if(result.getOperatedRecords() > 0)
                    request.setAttribute("success-message","Se ha actualizado exitosamente el articulo '" + previusInventoryItem.getItemName() + "'");
                else
                {
                    inventoryValidator.getErrorsMesages().put("Error al actualizar datos: ", result.getMessage());
                    request.setAttribute("errors", inventoryValidator.getErrorsMesages());
                }
            }
            else
            {
                DaoResult<InventoryItem> result = inventoryDao.create(inventoryItem);
                if(result.getOperatedRecords() > 0)
                    request.setAttribute("success-message","Se ha agregado exitosamente el articulo '" + itemName + "'");
                else
                {
                    inventoryValidator.getErrorsMesages().put("Error al insertar datos: ", result.getMessage());
                    request.setAttribute("errors", inventoryValidator.getErrorsMesages());  
                }
                
            }     
        }
        else
        {
            request.setAttribute("errors", inventoryValidator.getErrorsMesages());
            Map<String,String> submitedValues = new HashMap<>();
            submitedValues.put("itemId", itemId);
            if(!inventoryValidator.getErrorsMesages().containsKey("Tipo de articulo"))
                submitedValues.put("itemType", itemType);
            submitedValues.put("itemName", itemName);
            submitedValues.put("itemSize", itemSize);
            if(!inventoryValidator.getErrorsMesages().containsKey("Unidad de medida"))
                submitedValues.put("itemUnit", itemUnit);
            submitedValues.put("itemPrice", itemPrice);
            submitedValues.put("itemAcquisition", itemAcquisition);
            if(!inventoryValidator.getErrorsMesages().containsKey("Fecha de caducidad"))
                submitedValues.put("itemExpiry", itemExpiry);
            submitedValues.put("itemDesc", itemDesc);
            submitedValues.put("itemComments", itemComments);
            if(!inventoryValidator.getErrorsMesages().containsKey("Provedor"))
                submitedValues.put("itemSupplier", itemSupplier);
            request.setAttribute("item", submitedValues);
        }

        request.setAttribute("initialId", 0);
        
        try {
            
        request.getRequestDispatcher("../views/forms/inventory/crud-form.jsp").forward(request, response);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

}
