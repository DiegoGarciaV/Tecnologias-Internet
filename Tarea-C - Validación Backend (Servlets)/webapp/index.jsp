<!DOCTYPE html>
<html lang="es">

<head>
    <title>The Fresh Bowl</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta charset="utf-8">
    <link rel="stylesheet" href="css/bootstrap/bootstrap.min.css">
    <link rel="stylesheet" href="css/index/style.css">
    <script src="js/bootstrap/bootstrap.bundle.min.js"></script>
</head>

<body class="bg-light">

    <header>
        <nav class="navbar fixed-top navbar-dark bg-success navbar-expand-lg">
            <div class="container-fluid">
                <a class="navbar-brand" href="">
                    <div class="img-panel" id="logo-panel">
                        <img src="imgs/logo-w.png" alt="" class="d-inline-block align-text-top">
                    </div>
                </a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#nav-options"
                    aria-controls="nav-options" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="nav-options">
                    <ul class="navbar-nav me-auto mb-2 mb-lg-0 w-100 justify-content-end">
                        <li class="nav-item text-center">
                            <a class="nav-link active" href="#menu">Menú</a>
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

    <div class="full-container screen-container full-screen-container-static" id="cover-container">

        <div class="title-container">
            <h1 class="text-light">THE FRESH BOWL</h1>
            <p class="text-light">FRESH BOWLS, FRESH SOULS</p>
        </div>
        <div class="container" id="main-options">
            <div class="row justify-content-center text-center">
                <div class="col col-12 col-lg-3">
                    <p>Menu</p>
                </div>
                <div class="col col-12 col-lg-3">
                    <p>Recetas</p>
                </div>
            </div>
        </div>

    </div>
    <div class="half-screen-container-static screen-container">
        <div id="best-dishes" class="carousel slide h-100" data-bs-ride="carousel">
            <div class="carousel-indicators">
                <button type="button" data-bs-target="#best-dishes" data-bs-slide-to="0" class="active"
                    aria-current="true" aria-label="Slide 1"></button>
                <button type="button" data-bs-target="#best-dishes" data-bs-slide-to="1" aria-label="Slide 2"></button>
                <button type="button" data-bs-target="#best-dishes" data-bs-slide-to="2" aria-label="Slide 3"></button>
                <button type="button" data-bs-target="#best-dishes" data-bs-slide-to="3" aria-label="Slide 4"></button>
            </div>
            <div class="carousel-inner">
                <div class="carousel-item active">
                    <div class="carousel-item-content"
                        style="background-image: url('imgs/dishes/exclusive/ensalada-langosta.png');">
                        <div class="exclusive-item-card">
                            <h3>ENSALADA LANGOSTA DELUXE</h3>
                            <p>
                                Descubre el lujo en cada bocado con nuestra nueva Ensalada de Langosta Deluxe.
                                Ingredientes frescos y langosta premium se combinan en una experiencia culinaria
                                exclusiva.
                                Sumérgete en la sofisticación.
                            </p>
                            <p class="exclusive-link">
                                <a href="">Realiza tu pedido</a>
                            </p>
                        </div>
                    </div>
                </div>
                <div class="carousel-item">
                    <div class="carousel-item-content"
                        style="background-image: url('imgs/dishes/exclusive/hibisco-frambuesa.png');">
                        <div class="exclusive-item-card">
                            <h3>ELIXIR DE HIBISCO Y FRAMBUESA</h3>
                            <p>
                                Experimenta la sofisticación en cada sorbo con nuestro Elixir de Hibisco y Frambuesa.
                                La intensidad floral del hibisco se equilibra con la dulzura natural de las frambuesas,
                                creando una bebida refrescante y lujosa.
                            </p>
                            <p class="exclusive-link">
                                <a href="">Realiza tu pedido</a>
                            </p>
                        </div>
                    </div>
                </div>
                <div class="carousel-item">
                    <div class="carousel-item-content"
                        style="background-image: url('imgs/dishes/exclusive/coctel-maracuya.png');">
                        <div class="exclusive-item-card">
                            <h3>ELEGANTE CÓCTEL DE MARACUYÁ</h3>
                            <p>
                                Refresca tus sentidos con nuestro Cóctel de Maracuyá, una fusión única de sabores
                                tropicales y
                                presentación elegante. Exclusividad en cada sorbo.
                            </p>
                            <p class="exclusive-link">
                                <a href="">Realiza tu pedido</a>
                            </p>
                        </div>
                    </div>
                </div>
                <div class="carousel-item">
                    <div class="carousel-item-content"
                        style="background-image: url('imgs/dishes/exclusive/tarta-frutos.png');">
                        <div class="exclusive-item-card">
                            <h3>TARTA DE FRUTAS DE LA PASIÓN</h3>
                            <p>
                                Sumérgete en la indulgencia con nuestro Pastel de Frutas de la Pasión. Un postre
                                exclusivo
                                que combina la exótica fruta de la pasión con la suavidad de un pastel gourmet.
                            </p>
                            <p class="exclusive-link">
                                <a href="">Realiza tu pedido</a>
                            </p>
                        </div>
                    </div>
                </div>
            </div>
            <button class="carousel-control-prev" type="button" data-bs-target="#best-dishes" data-bs-slide="prev">
                <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                <span class="visually-hidden">Previous</span>
            </button>
            <button class="carousel-control-next" type="button" data-bs-target="#best-dishes" data-bs-slide="next">
                <span class="carousel-control-next-icon" aria-hidden="true"></span>
                <span class="visually-hidden">Next</span>
            </button>
        </div>
    </div>

    <section id="menu-intro">
            <div class="full-container screen-container">
                <h2 class="section-title">VERDE Y FRESCO</h2>
                <div class="row menu-row">
                    <div class="col col-12 col-lg-4">
                        <div class="card">
                            <div class="card-img-panel bg-dark">
                                <img src="imgs/dishes/exclusive/ensalada-langosta.png" class=" bg-dark" alt="...">

                            </div>
                            <div class="card-body">

                                <h5 class="card-title">LANGOSTA DELUXE</h5>
                            
                                <p class="card-text">
                                    Descubre el lujo en cada bocado con nuestra nueva Ensalada de 
                                    Langosta Deluxe. Ingredientes frescos y langosta premium se 
                                    combinan en una experiencia culinaria exclusiva
                                </p>
                                
                            </div>
                            <div class="card-body card-pricing">
                                <div class="row pricing-buttons">
                                    <div class="btn-group" role="group" aria-label="pricing buttons">
                                        <a type="button" href="#" class="btn btn-outline-secondary">
                                            <p class="my-0">250 g</p>
                                            <p class="my-0">$ 295</p>
                                        </a>
                                        <a type="button" href="#" class="btn  btn-outline-secondary">
                                            <p class="my-0">400 g</p>
                                            <p class="my-0">$ 490</p>
                                        </a>
                                        <a type="button" href="#" class="btn btn-outline-secondary">
                                            <p class="my-0">600 g</p>
                                            <p class="my-0">$ 800</p>
                                        </a>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col col-12 col-lg-4">
                        <div class="card">
                            <div class="card-img-panel bg-dark">
                                <img src="imgs/dishes/mediterranea.jpg" class=" bg-dark" alt="...">

                            </div>
                            <div class="card-body">

                                <h5 class="card-title">EGEO FRESCO SUPREMO</h5>
                            
                                <p class="card-text">
                                    Explora una fusión de sabores mediterráneos con olivas 
                                    Kalamata y queso feta, una experiencia fresca y elegante.
                                </p>
                                
                            </div>
                            <div class="card-body card-pricing">
                                <div class="row pricing-buttons">
                                    <div class="btn-group" role="group" aria-label="pricing buttons">
                                        <a type="button" href="#" class="btn btn-outline-secondary">
                                            <p class="my-0">250 g</p>
                                            <p class="my-0">$ 175</p>
                                        </a>
                                        <a type="button" href="#" class="btn  btn-outline-secondary">
                                            <p class="my-0">400 g</p>
                                            <p class="my-0">$ 230</p>
                                        </a>
                                        <a type="button" href="#" class="btn btn-outline-secondary">
                                            <p class="my-0">600 g</p>
                                            <p class="my-0">$ 450</p>
                                        </a>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col col-12 col-lg-4">
                        <div class="card">
                            <div class="card-img-panel bg-dark">
                                <img src="imgs/dishes/pollo-cesar.jpg" class=" bg-dark" alt="...">
                            </div>
                            <div class="card-body">
                                <h5 class="card-title">CÉSAR REAL DE LA PARRILLA</h5>
                                <p class="card-text">
                                    Disfruta la frescura de lechuga romana con pollo a la 
                                    parrilla y crutones, una sinfonía clásica y deliciosa.
                                </p>
                                
                            </div>
                            <div class="card-body card-pricing">
                                <div class="row pricing-buttons">
                                    <div class="btn-group" role="group" aria-label="pricing buttons">
                                        <a type="button" href="#" class="btn btn-outline-secondary">
                                            <p class="my-0">250 g</p>
                                            <p class="my-0">$ 175</p>
                                        </a>
                                        <a type="button" href="#" class="btn  btn-outline-secondary">
                                            <p class="my-0">400 g</p>
                                            <p class="my-0">$ 230</p>
                                        </a>
                                        <a type="button" href="#" class="btn btn-outline-secondary">
                                            <p class="my-0">600 g</p>
                                            <p class="my-0">$ 450</p>
                                        </a>
                                      </div>
                                </div>
                            </div>
                            
                        </div>
                    </div>
                    <div class="col col-12 col-lg-4">
                        <div class="card">
                            <div class="card-img-panel bg-dark">
                                <img src="imgs/dishes/caprese.jpg" class=" bg-dark" alt="...">
                            </div>
                            <div class="card-body">
                                <h5 class="card-title">CAPRICHO SOLEADO</h5>
                                <p class="card-text">
                                    Descubre la simplicidad de tomates heirloom, mozzarella 
                                    y albahaca, una combinación fresca y auténtica.
                                </p>
                                
                            </div>
                            <div class="card-body card-pricing">
                                <div class="row pricing-buttons">
                                    <div class="btn-group" role="group" aria-label="pricing buttons">
                                        <a type="button" href="#" class="btn btn-outline-secondary">
                                            <p class="my-0">250 g</p>
                                            <p class="my-0">$ 175</p>
                                        </a>
                                        <a type="button" href="#" class="btn  btn-outline-secondary">
                                            <p class="my-0">400 g</p>
                                            <p class="my-0">$ 230</p>
                                        </a>
                                        <a type="button" href="#" class="btn btn-outline-secondary">
                                            <p class="my-0">600 g</p>
                                            <p class="my-0">$ 450</p>
                                        </a>
                                      </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col col-12 col-lg-4">
                        <div class="card">
                            <div class="card-img-panel bg-dark">
                                <img src="imgs/dishes/tropical.jpg" class=" bg-dark" alt="...">
                            </div>
                            <div class="card-body">
                                <h5 class="card-title">PARAÍSO FRUTAL</h5>
                                <p class="card-text">
                                    Sumérgete en un paraíso de frescura con piña, aguacate 
                                    y mango, una explosión de sabores tropicales.
                                </p>
                                
                            </div>
                            <div class="card-body card-pricing">
                                <div class="row pricing-buttons">
                                    <div class="btn-group" role="group" aria-label="pricing buttons">
                                        <a type="button" href="#" class="btn btn-outline-secondary">
                                            <p class="my-0">250 g</p>
                                            <p class="my-0">$ 175</p>
                                        </a>
                                        <a type="button" href="#" class="btn  btn-outline-secondary">
                                            <p class="my-0">400 g</p>
                                            <p class="my-0">$ 230</p>
                                        </a>
                                        <a type="button" href="#" class="btn btn-outline-secondary">
                                            <p class="my-0">600 g</p>
                                            <p class="my-0">$ 450</p>
                                        </a>
                                      </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col col-12 col-lg-4">
                        <div class="card">
                            <div class="card-img-panel bg-dark">
                                <img src="imgs/dishes/quinoa-aguacate.jpg" class="bg-dark" alt="...">
                            </div>
                            <div class="card-body">
                                <h5 class="card-title">QUINOA AVANT-GARDE</h5>
                                <p class="card-text">
                                    Redefine la excelencia saludable con quinoa y aguacate, 
                                    sabores frescos en una obra maestra nutritiva.
                                </p>
                                
                            </div>
                            <div class="card-body card-pricing">
                                <div class="row pricing-buttons">
                                    <div class="btn-group" role="group" aria-label="pricing buttons">
                                        <a type="button" href="#" class="btn btn-outline-secondary">
                                            <p class="my-0">250 g</p>
                                            <p class="my-0">$ 175</p>
                                        </a>
                                        <a type="button" href="#" class="btn  btn-outline-secondary">
                                            <p class="my-0">400 g</p>
                                            <p class="my-0">$ 230</p>
                                        </a>
                                        <a type="button" href="#" class="btn btn-outline-secondary">
                                            <p class="my-0">600 g</p>
                                            <p class="my-0">$ 450</p>
                                        </a>
                                      </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col col-12 col-lg-4">
                        <div class="card">
                            <div class="card-img-panel bg-dark">
                                <img src="imgs/dishes/remolacha-cabra-2.png" class="bg-dark" alt="...">
                            </div>
                            <div class="card-body">
                                <h5 class="card-title">REMOLINO REAL DE CABRA</h5>
                                <p class="card-text">
                                    Sumérgete en la elegancia con remolacha asada, queso de cabra 
                                    y sabores vibrantes, una experiencia equilibrada.
                                </p>
                                
                            </div>
                            <div class="card-body card-pricing">
                                <div class="row pricing-buttons">
                                    <div class="btn-group" role="group" aria-label="pricing buttons">
                                        <a type="button" href="#" class="btn btn-outline-secondary">
                                            <p class="my-0">250 g</p>
                                            <p class="my-0">$ 175</p>
                                        </a>
                                        <a type="button" href="#" class="btn  btn-outline-secondary">
                                            <p class="my-0">400 g</p>
                                            <p class="my-0">$ 230</p>
                                        </a>
                                        <a type="button" href="#" class="btn btn-outline-secondary">
                                            <p class="my-0">600 g</p>
                                            <p class="my-0">$ 450</p>
                                        </a>
                                      </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col col-12 col-lg-4">
                        <div class="card">
                            <div class="card-img-panel bg-dark">
                                <img src="imgs/dishes/fig-goat-chesse.png" class="bg-dark" alt="...">
                            </div>
                            <div class="card-body">
                                <h5 class="card-title">HIGO Y CABRA ARMONIOSA</h5>
                                <p class="card-text">
                                    Deléitate con esta ensalada elegante que presenta higos frescos, 
                                    queso de cabra, nueces y una vinagreta de miel.
                                </p>
                                
                            </div>
                            <div class="card-body card-pricing">
                                <div class="row pricing-buttons">
                                    <div class="btn-group" role="group" aria-label="pricing buttons">
                                        <a type="button" href="#" class="btn btn-outline-secondary">
                                            <p class="my-0">250 g</p>
                                            <p class="my-0">$ 175</p>
                                        </a>
                                        <a type="button" href="#" class="btn  btn-outline-secondary">
                                            <p class="my-0">400 g</p>
                                            <p class="my-0">$ 230</p>
                                        </a>
                                        <a type="button" href="#" class="btn btn-outline-secondary">
                                            <p class="my-0">600 g</p>
                                            <p class="my-0">$ 450</p>
                                        </a>
                                      </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col col-12 col-lg-4">
                        <div class="card">
                            <div class="card-img-panel bg-dark">
                                <img src="imgs/dishes/watercress-watermelon.png" class="bg-dark" alt="...">
                            </div>
                            <div class="card-body">
                                <h5 class="card-title">CRISPÍSIMA MELÓDICA</h5>
                                <p class="card-text">
                                    El crujiente berro se mezcla con trozos jugosos de sandía, queso feta 
                                    desmenuzado y nueces tostadas, todo aderezado con una vinagreta de menta.
                                </p>
                                
                            </div>
                            <div class="card-body card-pricing">
                                <div class="row pricing-buttons">
                                    <div class="btn-group" role="group" aria-label="pricing buttons">
                                        <a type="button" href="#" class="btn btn-outline-secondary">
                                            <p class="my-0">250 g</p>
                                            <p class="my-0">$ 175</p>
                                        </a>
                                        <a type="button" href="#" class="btn  btn-outline-secondary">
                                            <p class="my-0">400 g</p>
                                            <p class="my-0">$ 230</p>
                                        </a>
                                        <a type="button" href="#" class="btn btn-outline-secondary">
                                            <p class="my-0">600 g</p>
                                            <p class="my-0">$ 450</p>
                                        </a>
                                      </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="full-container screen-container">
                <h2 class="section-title">BEBIDAS SELECTAS</h2>
                <div class="row menu-row">
                    <div class="col col-12 col-lg-4">
                        <div class="card">
                            <div class="card-img-panel bg-dark">
                                <img src="imgs/dishes/exclusive/hibisco-frambuesa.png" class=" bg-dark" alt="...">

                            </div>
                            <div class="card-body">

                                <h5 class="card-title">ELIXIR DE HIBISCO Y FRAMBUESA</h5>
                            
                                <p class="card-text">
                                    La intensidad floral del hibisco se equilibra con la dulzura natural 
                                    de las frambuesas, creando una bebida refrescante y lujosa.
                                </p>
                                
                            </div>
                            <div class="card-body card-pricing">
                                <div class="row pricing-buttons">
                                    <div class="btn-group" role="group" aria-label="pricing buttons">
                                        <a type="button" href="#" class="btn btn-outline-secondary">
                                            <p class="my-0">250 g</p>
                                            <p class="my-0">$ 175</p>
                                        </a>
                                        <a type="button" href="#" class="btn  btn-outline-secondary">
                                            <p class="my-0">400 g</p>
                                            <p class="my-0">$ 230</p>
                                        </a>
                                        <a type="button" href="#" class="btn btn-outline-secondary">
                                            <p class="my-0">600 g</p>
                                            <p class="my-0">$ 450</p>
                                        </a>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col col-12 col-lg-4">
                        <div class="card">
                            <div class="card-img-panel bg-dark">
                                <img src="imgs/dishes/exclusive/te-blanco-mango.png" class=" bg-dark" alt="...">

                            </div>
                            <div class="card-body">

                                <h5 class="card-title">TÉ BLANCO DE MANGO Y JAZMÍN</h5>
                            
                                <p class="card-text">
                                    Las notas suaves del té blanco se fusionan con la dulzura tropical 
                                    del mango y la fragancia delicada del jazmín, ofreciendo una experiencia única.
                                </p>
                                
                            </div>
                            <div class="card-body card-pricing">
                                <div class="row pricing-buttons">
                                    <div class="btn-group" role="group" aria-label="pricing buttons">
                                        <a type="button" href="#" class="btn btn-outline-secondary">
                                            <p class="my-0">250 g</p>
                                            <p class="my-0">$ 175</p>
                                        </a>
                                        <a type="button" href="#" class="btn  btn-outline-secondary">
                                            <p class="my-0">400 g</p>
                                            <p class="my-0">$ 230</p>
                                        </a>
                                        <a type="button" href="#" class="btn btn-outline-secondary">
                                            <p class="my-0">600 g</p>
                                            <p class="my-0">$ 450</p>
                                        </a>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col col-12 col-lg-4">
                        <div class="card">
                            <div class="card-img-panel bg-dark">
                                <img src="imgs/dishes/exclusive/coctel-maracuya.png" class=" bg-dark" alt="...">

                            </div>
                            <div class="card-body">

                                <h5 class="card-title">ELEGANTE CÓCTEL DE MARACUYÁ</h5>
                            
                                <p class="card-text">
                                    Refresca tus sentidos con nuestro Cóctel de Maracuyá, una fusión 
                                    única de sabores tropicales y presentación elegante. 
                                    Exclusividad en cada sorbo.
                                </p>
                                
                            </div>
                            <div class="card-body card-pricing">
                                <div class="row pricing-buttons">
                                    <div class="btn-group" role="group" aria-label="pricing buttons">
                                        <a type="button" href="#" class="btn btn-outline-secondary">
                                            <p class="my-0">250 g</p>
                                            <p class="my-0">$ 175</p>
                                        </a>
                                        <a type="button" href="#" class="btn  btn-outline-secondary">
                                            <p class="my-0">400 g</p>
                                            <p class="my-0">$ 230</p>
                                        </a>
                                        <a type="button" href="#" class="btn btn-outline-secondary">
                                            <p class="my-0">600 g</p>
                                            <p class="my-0">$ 450</p>
                                        </a>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col col-12 col-lg-4">
                        <div class="card">
                            <div class="card-img-panel bg-dark">
                                <img src="imgs/drinks/cucumber-basil.png" class=" bg-dark" alt="...">

                            </div>
                            <div class="card-body">

                                <h5 class="card-title">GIN TÓNICO DE PEPINO Y ALBAHACA</h5>
                            
                                <p class="card-text">
                                    Una bebida sofisticada con gin, tónica, 
                                    rodajas de pepino y hojas de albahaca.
                                </p>
                                
                            </div>
                            <div class="card-body card-pricing">
                                <div class="row pricing-buttons">
                                    <div class="btn-group" role="group" aria-label="pricing buttons">
                                        <a type="button" href="#" class="btn btn-outline-secondary">
                                            <p class="my-0">250 g</p>
                                            <p class="my-0">$ 175</p>
                                        </a>
                                        <a type="button" href="#" class="btn  btn-outline-secondary">
                                            <p class="my-0">400 g</p>
                                            <p class="my-0">$ 230</p>
                                        </a>
                                        <a type="button" href="#" class="btn btn-outline-secondary">
                                            <p class="my-0">600 g</p>
                                            <p class="my-0">$ 450</p>
                                        </a>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col col-12 col-lg-4">
                        <div class="card">
                            <div class="card-img-panel bg-dark">
                                <img src="imgs/drinks/mango-coconut-2.png" class=" bg-dark" alt="...">

                            </div>
                            <div class="card-body">

                                <h5 class="card-title">SMOOTHIE DE MANGO Y COCO</h5>
                            
                                <p class="card-text">
                                    Una deliciosa mezcla de mango, leche de coco y yogurt, 
                                    perfecta para refrescarse.
                                </p>
                                
                            </div>
                            <div class="card-body card-pricing">
                                <div class="row pricing-buttons">
                                    <div class="btn-group" role="group" aria-label="pricing buttons">
                                        <a type="button" href="#" class="btn btn-outline-secondary">
                                            <p class="my-0">250 g</p>
                                            <p class="my-0">$ 175</p>
                                        </a>
                                        <a type="button" href="#" class="btn  btn-outline-secondary">
                                            <p class="my-0">400 g</p>
                                            <p class="my-0">$ 230</p>
                                        </a>
                                        <a type="button" href="#" class="btn btn-outline-secondary">
                                            <p class="my-0">600 g</p>
                                            <p class="my-0">$ 450</p>
                                        </a>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>

                    <div class="col col-12 col-lg-4">
                        <div class="card">
                            <div class="card-img-panel bg-dark">
                                <img src="imgs/drinks/vanilla-coffe.png" class=" bg-dark" alt="...">

                            </div>
                            <div class="card-body">

                                <h5 class="card-title">CAFÉ HELADO CON VAINILLA</h5>
                            
                                <p class="card-text">
                                    Un café suave y refrescante con hielo y esencia de vainilla.
                                </p>
                                
                            </div>
                            <div class="card-body card-pricing">
                                <div class="row pricing-buttons">
                                    <div class="btn-group" role="group" aria-label="pricing buttons">
                                        <a type="button" href="#" class="btn btn-outline-secondary">
                                            <p class="my-0">250 g</p>
                                            <p class="my-0">$ 175</p>
                                        </a>
                                        <a type="button" href="#" class="btn  btn-outline-secondary">
                                            <p class="my-0">400 g</p>
                                            <p class="my-0">$ 230</p>
                                        </a>
                                        <a type="button" href="#" class="btn btn-outline-secondary">
                                            <p class="my-0">600 g</p>
                                            <p class="my-0">$ 450</p>
                                        </a>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col col-12 col-lg-4">
                        <div class="card">
                            <div class="card-img-panel bg-dark">
                                <img src="imgs/drinks/cucumber-basil.png" class=" bg-dark" alt="...">

                            </div>
                            <div class="card-body">

                                <h5 class="card-title">MOCKTAIL DE FRUTAS FRESCAS</h5>
                            
                                <p class="card-text">
                                    Una mezcla refrescante de frutas tropicales, 
                                    soda y hierbas frescas, sin alcohol.
                                </p>
                                
                            </div>
                            <div class="card-body card-pricing">
                                <div class="row pricing-buttons">
                                    <div class="btn-group" role="group" aria-label="pricing buttons">
                                        <a type="button" href="#" class="btn btn-outline-secondary">
                                            <p class="my-0">250 g</p>
                                            <p class="my-0">$ 175</p>
                                        </a>
                                        <a type="button" href="#" class="btn  btn-outline-secondary">
                                            <p class="my-0">400 g</p>
                                            <p class="my-0">$ 230</p>
                                        </a>
                                        <a type="button" href="#" class="btn btn-outline-secondary">
                                            <p class="my-0">600 g</p>
                                            <p class="my-0">$ 450</p>
                                        </a>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col col-12 col-lg-4">
                        <div class="card">
                            <div class="card-img-panel bg-dark">
                                <img src="imgs/drinks/mango-coconut-2.png" class=" bg-dark" alt="...">

                            </div>
                            <div class="card-body">

                                <h5 class="card-title">MOJITO DE MENTA Y FRESA</h5>
                            
                                <p class="card-text">
                                    Una versión del clásico mojito con un toque de fresa y menta fresca.
                                </p>
                                
                            </div>
                            <div class="card-body card-pricing">
                                <div class="row pricing-buttons">
                                    <div class="btn-group" role="group" aria-label="pricing buttons">
                                        <a type="button" href="#" class="btn btn-outline-secondary">
                                            <p class="my-0">250 g</p>
                                            <p class="my-0">$ 175</p>
                                        </a>
                                        <a type="button" href="#" class="btn  btn-outline-secondary">
                                            <p class="my-0">400 g</p>
                                            <p class="my-0">$ 230</p>
                                        </a>
                                        <a type="button" href="#" class="btn btn-outline-secondary">
                                            <p class="my-0">600 g</p>
                                            <p class="my-0">$ 450</p>
                                        </a>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>

                    <div class="col col-12 col-lg-4">
                        <div class="card">
                            <div class="card-img-panel bg-dark">
                                <img src="imgs/drinks/vanilla-coffe.png" class=" bg-dark" alt="...">

                            </div>
                            <div class="card-body">

                                <h5 class="card-title">AGUA FRESCA DE SANDÍA Y MENTA</h5>
                            
                                <p class="card-text">
                                    Una opción hidratante con el dulce sabor de la sandía y un toque de menta.
                                </p>
                                
                            </div>
                            <div class="card-body card-pricing">
                                <div class="row pricing-buttons">
                                    <div class="btn-group" role="group" aria-label="pricing buttons">
                                        <a type="button" href="#" class="btn btn-outline-secondary">
                                            <p class="my-0">250 g</p>
                                            <p class="my-0">$ 175</p>
                                        </a>
                                        <a type="button" href="#" class="btn  btn-outline-secondary">
                                            <p class="my-0">400 g</p>
                                            <p class="my-0">$ 230</p>
                                        </a>
                                        <a type="button" href="#" class="btn btn-outline-secondary">
                                            <p class="my-0">600 g</p>
                                            <p class="my-0">$ 450</p>
                                        </a>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

            <div class="full-container screen-container">
                <h2 class="section-title">DELICIAS DULCES</h2>
                <div class="row menu-row">
                    <div class="col col-12 col-lg-4">
                        <div class="card">
                            <div class="card-img-panel bg-dark">
                                <img src="imgs/dishes/exclusive/tarta-frutos.png" class=" bg-dark" alt="...">

                            </div>
                            <div class="card-body">

                                <h5 class="card-title">TARTA DE FRUTAS DE LA PASIÓN</h5>
                            
                                <p class="card-text">
                                    Un postre exclusivo que combina la exótica fruta de la pasión con la suavidad de un pastel gourmet.
                                </p>
                                
                            </div>
                            <div class="card-body card-pricing">
                                <div class="row pricing-buttons">
                                    <div class="btn-group" role="group" aria-label="pricing buttons">
                                        <a type="button" href="#" class="btn btn-outline-secondary">
                                            <p class="my-0">250 g</p>
                                            <p class="my-0">$ 175</p>
                                        </a>
                                        <a type="button" href="#" class="btn  btn-outline-secondary">
                                            <p class="my-0">400 g</p>
                                            <p class="my-0">$ 230</p>
                                        </a>
                                        <a type="button" href="#" class="btn btn-outline-secondary">
                                            <p class="my-0">600 g</p>
                                            <p class="my-0">$ 450</p>
                                        </a>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col col-12 col-lg-4">
                        <div class="card">
                            <div class="card-img-panel bg-dark">
                                <img src="imgs/desserts/raspberry-tiram-2.png" class=" bg-dark" alt="...">

                            </div>
                            <div class="card-body">

                                <h5 class="card-title">TIRAMISÚ DE FRAMBUESA</h5>
                            
                                <p class="card-text">
                                    Una versión frutal del clásico tiramisú, con capas 
                                    de bizcocho, crema y frambuesas frescas.
                                </p>
                                
                            </div>
                            <div class="card-body card-pricing">
                                <div class="row pricing-buttons">
                                    <div class="btn-group" role="group" aria-label="pricing buttons">
                                        <a type="button" href="#" class="btn btn-outline-secondary">
                                            <p class="my-0">250 g</p>
                                            <p class="my-0">$ 175</p>
                                        </a>
                                        <a type="button" href="#" class="btn  btn-outline-secondary">
                                            <p class="my-0">400 g</p>
                                            <p class="my-0">$ 230</p>
                                        </a>
                                        <a type="button" href="#" class="btn btn-outline-secondary">
                                            <p class="my-0">600 g</p>
                                            <p class="my-0">$ 450</p>
                                        </a>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col col-12 col-lg-4">
                        <div class="card">
                            <div class="card-img-panel bg-dark">
                                <img src="imgs/desserts/raspberry-tiram-2.png" class=" bg-dark" alt="...">

                            </div>
                            <div class="card-body">

                                <h5 class="card-title">COULIS DE MANGO CON HELADO DE COCO</h5>
                            
                                <p class="card-text">
                                    Una mezcla tropical de coulis de mango y helado de coco, 
                                    una explosión de sabores.
                                </p>
                                
                            </div>
                            <div class="card-body card-pricing">
                                <div class="row pricing-buttons">
                                    <div class="btn-group" role="group" aria-label="pricing buttons">
                                        <a type="button" href="#" class="btn btn-outline-secondary">
                                            <p class="my-0">250 g</p>
                                            <p class="my-0">$ 175</p>
                                        </a>
                                        <a type="button" href="#" class="btn  btn-outline-secondary">
                                            <p class="my-0">400 g</p>
                                            <p class="my-0">$ 230</p>
                                        </a>
                                        <a type="button" href="#" class="btn btn-outline-secondary">
                                            <p class="my-0">600 g</p>
                                            <p class="my-0">$ 450</p>
                                        </a>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col col-12 col-lg-4">
                        <div class="card">
                            <div class="card-img-panel bg-dark">
                                <img src="imgs/desserts/raspberry-tiram-2.png" class=" bg-dark" alt="...">

                            </div>
                            <div class="card-body">

                                <h5 class="card-title">PANNA COTTA DE LAVANDA</h5>
                            
                                <p class="card-text">
                                    Una panna cotta delicada con un toque de lavanda, 
                                    acompañada de frutas rojas.
                                </p>
                                
                            </div>
                            <div class="card-body card-pricing">
                                <div class="row pricing-buttons">
                                    <div class="btn-group" role="group" aria-label="pricing buttons">
                                        <a type="button" href="#" class="btn btn-outline-secondary">
                                            <p class="my-0">250 g</p>
                                            <p class="my-0">$ 175</p>
                                        </a>
                                        <a type="button" href="#" class="btn  btn-outline-secondary">
                                            <p class="my-0">400 g</p>
                                            <p class="my-0">$ 230</p>
                                        </a>
                                        <a type="button" href="#" class="btn btn-outline-secondary">
                                            <p class="my-0">600 g</p>
                                            <p class="my-0">$ 450</p>
                                        </a>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col col-12 col-lg-4">
                        <div class="card">
                            <div class="card-img-panel bg-dark">
                                <img src="imgs/desserts/raspberry-tiram-2.png" class=" bg-dark" alt="...">

                            </div>
                            <div class="card-body">

                                <h5 class="card-title">PASTEL DE CHOCOLATE NEGRO Y AVELLANAS</h5>
                            
                                <p class="card-text">
                                    Un postre decadente con capas de chocolate negro y avellanas tostadas.
                                </p>
                                
                            </div>
                            <div class="card-body card-pricing">
                                <div class="row pricing-buttons">
                                    <div class="btn-group" role="group" aria-label="pricing buttons">
                                        <a type="button" href="#" class="btn btn-outline-secondary">
                                            <p class="my-0">250 g</p>
                                            <p class="my-0">$ 175</p>
                                        </a>
                                        <a type="button" href="#" class="btn  btn-outline-secondary">
                                            <p class="my-0">400 g</p>
                                            <p class="my-0">$ 230</p>
                                        </a>
                                        <a type="button" href="#" class="btn btn-outline-secondary">
                                            <p class="my-0">600 g</p>
                                            <p class="my-0">$ 450</p>
                                        </a>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    
                </div>
            </div>
    </section>






    <footer></footer>
</body>

</html>