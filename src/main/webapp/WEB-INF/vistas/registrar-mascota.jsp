<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>

<html>
<head>
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
    <link rel="stylesheet" href="css/helps.css" >
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <meta name="viewport" content="width=device-width" initial-scale=1.0>
</head>

<nav>
    <div class="nav-wrapper teal darken-1 ">
        <a href="#" class="ml brand-logo">  Save Pets</a>
        <ul id="nav-mobile" class="right hide-on-med-and-down">
            <li><a href="/mapa-mascotas">Mapa</a></li>
            <li><a href="/registrar-mascota">Crear Alerta</a></li>
            <li><a href="/registrar-refugio">Agregar Refugio</a></li>
        </ul>
    </div>
</nav>

<body>
<div class="row container mt" >
    <form class="col s12" action="registrar-mascota" method="POST" modelAttribute="datosMascota">
        <h4 class="center-align">REGISTRAR MASCOTA</h4>
        <article class="col s6 offset-s3">

            <div class="row">
                <div class="input-field col s12">
                    <input id="nombre" type="text" class="validate">
                    <label for="nombre">Nombre</label>
                </div>
            </div>

            <div class="row">
                <div class="input-field col s12">
                    <input id="direccion" type="text" class="validate">
                    <label for="direccion">Dirección</label>
                </div>
            </div>

            <div class="row">
                <div class="input-field col s12">
                    <input id="especie" type="text" class="validate">
                    <label for="especie">Especie:</label>
                </div>
            </div>


            <div class="row">
                <div class="input-field col s12">
                    <select>
                        <option value="perro">Perro</option>
                        <option value="gato">Gato</option>
                    </select>
                <label>Seleccione uno</label>
                </div>
            </div>


            <p class="center-align ">
                <button class="waves-effect waves-light btn" type="submit"><i class="material-icons right">send</i>enviar</button>
            </p>
        </article>
    </form>
</div>
<!--JavaScript at end of body for optimized loading-->
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
<script>
    $(document).ready(function(){
        $('select').formSelect();
    });
</script>


</body>
</html>



