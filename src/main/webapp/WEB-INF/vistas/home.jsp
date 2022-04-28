<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <!DOCTYPE html>
        <html>

        <head>
    	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
		<link rel="stylesheet" href="css/styles.css">
        </head>

        <body id="body_home">
 <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <div class="container-fluid">
            <a href="index.html"><img src="transparent-blue-world-earth-logo-circle-5e19bc82a67797.1114106915787449626819.png" alt="..." height="30px"></a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
          </button>
            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                    <li class="nav-item">
                        <a class="nav-link active" aria-current="page" href="index.html">Home</a>
                    </li>
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                  Opciones
                </a>
                        <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                            <li><a class="dropdown-item" href="#">Destinos</a></li>
                            <li><a class="dropdown-item" href="#">Excursiones</a></li>
                            <li>
                                <hr class="dropdown-divider">
                            </li>
                            <li><a class="dropdown-item" href="#">Calculador de presupuesto</a></li>
                        </ul>
                    </li>
                </ul>
                <form class="d-flex">
                    <button class="btn btn-primary" href="login">Login</button>
                    <button class="btn btn-outline-primary" href="registrar-usuario">Registrarse</button>
                    <input class="form-control me-2" type="search" placeholder="Destino" aria-label="Search">
                    <button class="btn btn-outline-primary" type="submit">Buscar</button>
                </form>
            </div>
        </div>
    </nav>

    <div id="carouselExampleCaptions" class="carousel slide" data-bs-ride="carousel">
        <div class="carousel-indicators">
            <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="0" class="active" aria-current="true" aria-label="Slide 1"></button>
            <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="1" aria-label="Slide 2"></button>
            <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="2" aria-label="Slide 3"></button>
        </div>
        <div class="carousel-inner">
            <div class="carousel-item active">
                <img src="https://www.hola.com/imagenes/estar-bien/20200811173405/psicologia-obsesion-viajar/0-854-752/viajar-t.jpg" class="d-block w-100" alt="avion" height="300px">
                <div class="carousel-caption d-none d-md-block">
                    <h5>Elegi tu destino</h5>
                    <p>Busca entre todos los disponibles</p>
                </div>
            </div>
            <div class="carousel-item">
                <img src="https://www.hola.com/imagenes/estar-bien/20200811173405/psicologia-obsesion-viajar/0-854-752/viajar-t.jpg" class="d-block w-100" alt="bariloche" height="300px">
                <div class="carousel-caption d-none d-md-block">
                    <h5>Bariloche</h5>
                    <p>Descurbi el sur de Argentina</p>
                </div>
            </div>
            <div class="carousel-item">
                <img src="https://www.hola.com/imagenes/estar-bien/20200811173405/psicologia-obsesion-viajar/0-854-752/viajar-t.jpg" class="d-block w-100" alt="cafayate" height="300px">
                <div class="carousel-caption d-none d-md-block">
                    <h5>Cafayate</h5>
                    <p>Explora el norte del pais</p>
                </div>
            </div>
        </div>
        <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide="prev">
          <span class="carousel-control-prev-icon" aria-hidden="true"></span>
          <span class="visually-hidden">Previous</span>
        </button>
        <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide="next">
          <span class="carousel-control-next-icon" aria-hidden="true"></span>
          <span class="visually-hidden">Next</span>
        </button>
    </div>
<div id="Titulo_cartas_div">
<h3 id="Titulo_cartas">Paquetes exclusivos<a id="vinuclo_cartas" href="#">ver todos > </a></h3>
</div>
<hr>
    <div id="seccion_cartas">  
      <c:forEach items="${listaDeItinerarios}" var="itinerario">
        <div id="cartas" class="card" style="width: 18rem;">
  			<img src="${itinerario.destinos.imagen}" class="card-img-top" alt="..." width="30px" height="200px">
  			<div class="card-body">
    		<h5 class="card-title">${itinerario.destinos.nombre}</h5>
    		<h5 class="card-title">${itinerario.precioTotal}</h5>
    		<p class="card-text">${itinerario.destinos.tipoDeDestino.nombre}</p>
    		<a href="#" class="btn btn-primary">Comprar</a>
  			</div>
		</div>
	  </c:forEach>
    </div>
    <div>
    <div id="Titulo_cartas_div">
<h3 id="Titulo_cartas">Excursiones increibles<a id="vinuclo_cartas" href="#">ver todos > </a></h3>
        </div>
         <hr>
        <div id="seccion_cartas">
        <c:forEach items="${listaDeExcursiones}" var="excursiones">
        <div id="cartas" class="card" style="width: 18rem;">
  			<img src="${excursiones.link}" class="card-img-top" alt="..." width="30px" height="200px">
  			<div class="card-body">
    		<h5 class="card-title">${excursiones.nombre}</h5>
    		<p class="card-text">${excursiones.destinoDeExcursion.nombre}</p>
    		<a href="#" class="btn btn-primary">Ver detalles</a>
  			</div>
		</div>
	  </c:forEach>
        </div>
    </div>
    <div>
    <div id="Titulo_cartas_div">
<h3 id="Titulo_cartas">Destinos disponibles<a id="vinuclo_cartas" href="#">ver todos > </a></h3>
        </div>
         <hr>
        <div id="seccion_cartas">
        <c:forEach items="${listaDeDestinos}" var="destinos">
        <div id="cartas" class="card" style="width: 18rem;">
  			<img src="${destinos.imagen}" class="card-img-top" alt="..." width="30px" height="200px">
  			<div class="card-body">
    		<h5 class="card-title">${destinos.nombre}</h5>
    		<p class="card-text">${destinos.tipoDeDestino.nombre}</p>
    		<a href="#" class="btn btn-primary">Ver detalles</a>
  			</div>
		</div>
	  </c:forEach>
        </div>
    </div>
    <hr>
    <div>
        <a id="Titulo_cartas" href="#">Disfruta la playa</a>
    </div>
	<hr>
    <footer class="footer">
        <div class="">
            © 2014 Copyright Taller Web 1
            <a class="grey-text text-lighten-4 right" href="#!">More Links</a>
        </div>
    </footer>


<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</body>

        </html>