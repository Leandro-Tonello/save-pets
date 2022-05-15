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
    <form:form action="registrar-refugio" method="POST" modelAttribute="datosRefugio" class="col s12">
        <h4 class="center-align">REGISTRAR REFUGIO</h4>
        <article class="col s6 offset-s3">

            <div class="row">
                <div class="input-field col s12">
                    <form:input path="nombre" name="nombre" id="nombre" type="text" class="validate" required="true"/>
                    <form:label path="nombre" for="nombre">Nombre</form:label>
                </div>
            </div>

            <div class="row">
                <div class="input-field col s12">
                    <form:input path="direccion" name="direccion" id="direccion" type="text" class="validate" required="true"/>
                    <form:label path="direccion" for="direccion">Dirección</form:label>
                </div>
            </div>

            <div class="row">
                <div class="input-field col s12">
                    <form:input path="numeroTelefono" name="numeroTelefono" id="numeroTelefono" type="number" class="validate" required="true"/>
                    <form:label path="numeroTelefono" for="numeroTelefono">Teléfono:</form:label>
                </div>
            </div>

            <div class="row">
                <div class="input-field col s12">
                    <form:input path="capmax" name="capmax" id="capmax" type="number" class="validate" required="true"/>
                    <form:label path="capmax" for="capmax">Capacidad Maxima:</form:label>
                </div>
            </div>

            <div class="row">
                <div class="input-field col s12">
                    <form:input path="urlimagen" name="urlimagen" id="urlimagen" type="text" class="validate" required="true"/>
                    <form:label path="urlimagen" for="urlimagen">Url imagen:</form:label>
                </div>
            </div>


            <p class="center-align">
                <button class="waves-effect waves-light btn" type="submit"><i class="material-icons right">send</i>Enviar</button>
            </p>
        </article>

    </form:form>
    <c:if test="${not empty error}">
        <h4><span>${error}</span></h4>
        <br>
    </c:if>
</div>
<!--JavaScript at end of body for optimized loading-->

<script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>


</body>
</html>capmax