<!DOCTYPE html>
<html lang="es">

<head>
    <title>The Fresh Bowl</title>
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
                <a class="navbar-brand" href="../">
                    <div class="img-panel" id="logo-panel">
                        <img src="../imgs/logo-w.png" alt="" class="d-inline-block align-text-top">
                    </div>
                </a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#nav-options"
                    aria-controls="nav-options" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="nav-options">
                    <ul class="navbar-nav me-auto mb-2 mb-lg-0 w-100 justify-content-end">
                        <li class="nav-item text-center">
                            <a class="nav-link active" href="../">Menú</a>
                        </li>
                        <li class="nav-item text-center">
                            <a class="nav-link" aria-current="page" href="../recipes">Recetas</a>
                        </li>
                        <li class="nav-item text-center">
                            <a class="nav-link" href="../inventory">Inventario</a>
                        </li>

                    </ul>
                </div>
            </div>
        </nav>
    </header>
    <h1>Inventario</h1>
    <c:forEach var="item" items="${requestScope.inventory}">
    <p>Nombre del artículo: ${item.getItemName()}</p>
    <p>Cantidad: ${item.getQuantity()}</p>
    <p>Precio: ${item.getPrice()}</p>
    <hr/>
</c:forEach>
</body>
</html>