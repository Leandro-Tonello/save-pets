<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <!DOCTYPE html>
        <html>

        <head>
    	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
		<link rel="stylesheet" href="css/styles.css">
        </head>

        <body id="body_home">
    <div id="seccion_cartas">  
      <c:forEach items="${listaDeRefugios}" var="refugio">
        <div id="cartas" class="card" style="width: 18rem;">
  			<img src="${refugio.imagen}" class="card-img-top" alt="..." width="30px" height="200px">
  			<div class="card-body">
    		<h5 class="card-title">${refugio.nombre}</h5>
    		<h5 class="card-title">${refugio.direccion}</h5>
    		<p class="card-text">Capacidad máxima: ${refugio.capMax}</p>
    		<a href="mostrar-animales" class="btn btn-primary">Ver animales</a>
  			</div>
		</div>
	  </c:forEach>
    </div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</body>

        </html>