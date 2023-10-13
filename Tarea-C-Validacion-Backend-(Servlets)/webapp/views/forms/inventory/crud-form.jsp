<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@page import="java.util.List" %>
<%@page import="com.freshbowl.model.pojos.InventoryItem" %>
<!DOCTYPE html>
<html lang="es">

<head>
    <title>The Fresh Bowl (Inventario)</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta charset="utf-8">
    <link rel="stylesheet" href="../css/bootstrap/bootstrap.min.css">
    <link rel="stylesheet" href="../css/index/style.css">
    <script src="../js/bootstrap/bootstrap.bundle.min.js"></script>
</head>

<body class="bg-light">

    <header>
        <nav class="navbar fixed-top navbar-dark bg-success navbar-expand-lg">
            <div class="container-fluid">
                <a class="navbar-brand" href="index.jsp">
                    <div class="img-panel" id="logo-panel">
                        <img src="../imgs/logo-w.png" alt="" class="d-inline-block align-text-top">
                    </div>
                </a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse"
                    data-bs-target="#nav-options" aria-controls="nav-options" aria-expanded="false"
                    aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="nav-options">
                    <ul class="navbar-nav me-auto mb-2 mb-lg-0 w-100 justify-content-end">
                        <li class="nav-item text-center">
                            <a class="nav-link active" href="index.jsp">Menú</a>
                        </li>
                        <li class="nav-item text-center">
                            <a class="nav-link" aria-current="page" href="recipes">Recetas</a>
                        </li>
                        <li class="nav-item text-center">
                            <a class="nav-link" href="inventory">Inventario</a>
                        </li>

                    </ul>
                </div>
            </div>
        </nav>
    </header>
    <section id="inventory-crud">
        
        <div class="full-container screen-container">
            <div class="container px-5">
                <h2 class="mt-3">Actualización de inventario</h2>
                <form class="row g-3 my-2 w-100" method="post" action="../inventory/form">
                    
                    <div class="col-12 col-lg-6">
                        <div class="row">
                            <div class="col-md-3 mb-3">
                                <label for="itemId" class="form-label">Id</label>
                                <input type="text" class="form-control" id="itemId" name="itemId" value="${item.getItemId()}">
                            </div>
                            <div class="col-md-9 mb-3">
                                <label for="itemName" class="form-label">Nombre del producto</label>
                                <input type="text" class="form-control" id="itemName" name="itemName" value="${item.getItemName()}">
                            </div>
                            <div class="col-6 mb-3">
                                <label for="itemType" class="form-label">Tipo de producto</label>
                                <input type="text" class="form-control" id="itemType" name="itemType">
                            </div>
                            <div class="col-6 mb-3">
                                <label for="itemSize" class="form-label">Medida del producto</label>
                                <input type="text" class="form-control" id="itemSize" name="itemSize">
                            </div>
                            <div class="col-md-6 mb-3">
                                <label for="itemAcquisition" class="form-label">Fecha de adquisición</label>
                                <input type="date" class="form-control" id="itemAcquisition" name="itemAcquisition">
                            </div>
                            <div class="col-md-6 mb-3">
                                <label for="itemExpiry" class="form-label">Fecha de caducidad</label>
                                <input type="date" class="form-control" id="itemExpiry" name="itemExpiry">
                            </div>
                            <div class="col-md-12 mb-3">
                                <label for="itemDesc" class="form-label">Descripcion</label>
                                <input type="text" class="form-control" id="itemDesc" name="itemDesc">
                            </div>
                            <div class="col-md-12 mb-3">
                                <label for="itemComments" class="form-label">Comentarios</label>
                                <input type="text" class="form-control" id="itemComments" name="itemComments">
                            </div>
                            <div class="col-md-12 mb-3">
                                <label for="itemSupplier" class="form-label">Provedor</label>
                                <input type="text" class="form-control" id="itemSupplier" name="itemSupplier">
                            </div>
                            <div class="col-12 mb-3">
                                <button type="submit" class="btn btn-primary">Sign in</button>
                            </div>
                        </div>
                    </div>
                    <div class="col-12 col-lg-6">
                        <div class="row">

                        </div>
                    </div>
                    </div>
                    
                </form>
            </div>
        </div>
    </section>
</body>

</html>