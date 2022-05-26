<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Mapa Refugios</title>
    <script src="https://polyfill.io/v3/polyfill.min.js?features=default"></script>

    <!--  <link rel="stylesheet" type="text/css" href="webapp/css/styles.css" />-->
    <!--  <script type="module" src="webapp/js/index.js"></script>-->

    <script>
        function initMap() {

            const map = new google.maps.Map(document.getElementById("map"), {
                zoom: 10,
                center: { "lat": -34.670283, "lng": -58.5638904 },
            });

            <c:forEach items="${refugios}" var="refugio">
            var coordenadasRefugio = ${refugio.coordenadas}
            var marker = new google.maps.Marker({
                position: coordenadasRefugio,
                map: map,
            });
            </c:forEach>
        }

        window.initMap = initMap;

    </script>
    <style>
        #map {
            height: 400px;
            width: 100%;
        }
    </style>

</head>
<body>

<nav>
    <div id="navegador" class="row">
        <div class="col"><a href="home"><h1>Save-Pets</h1></a></div>
        <div id="nav_item" class="col"><a href="mostrar-mascotas"><h3>Mascotas</h3></a></div>
        <div id="nav_item" class="col"><a href="registrar-mascota"><h3>Registrar mascota</h3></a></div>
        <div id="nav_item" class="col"><a href="mostrar-refugios"><h3>Refugios</h3></a></div>
        <div id="nav_item" class="col"><a href="#"><h3>Registrar refugio</h3></a></div>
        <div id="botones_home" class="col">
            <a href="registrar-usuario"><button class="btn btn-outline-primary">Registrarme</button></a>
            <a href="login"><button class="btn btn-outline-primary">Login</button></a>
        </div>
    </div>
</nav>

<h3>Mapa de Refugios</h3>
<div id="map"></div>
<script async
        src="https://maps.googleapis.com/maps/api/js?key=AIzaSyDruCZjP_qnHh5ikKTqJWJWPAfM9CkhzIo&callback=initMap">
</script>
</body>
</html>