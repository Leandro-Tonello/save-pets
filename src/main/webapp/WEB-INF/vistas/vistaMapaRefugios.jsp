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
                center: ${coordenadasDefault},
            });

            <c:forEach items="${refugios}" var="refugio">
            var coordenadasRefugio = ${refugio.direccion}
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
<h3>Mapa de Refugios</h3>
<div id="map"></div>

<script async
        src="https://maps.googleapis.com/maps/api/js?key=AIzaSyDruCZjP_qnHh5ikKTqJWJWPAfM9CkhzIo&callback=initMap">
</script>
</body>
</html>