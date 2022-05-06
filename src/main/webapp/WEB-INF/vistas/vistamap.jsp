<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Add Map</title>
    <script src="https://polyfill.io/v3/polyfill.min.js?features=default"></script>

  <!--  <link rel="stylesheet" type="text/css" href="webapp/css/styles.css" />-->
  <!--  <script type="module" src="webapp/js/index.js"></script>-->
    <script>
        // Initialize and add the map
        function initMap() {
            const micasa = ${data};

            // The map, centered at la casa de igna
            const map = new google.maps.Map(document.getElementById("map"), {
                zoom: 4,
                center: micasa,
            });
            // The marker, positioned at la casa de igna
            const marker = new google.maps.Marker({
                position: micasa,
                map: map,
            });
        }

        window.initMap = initMap;

    </script>
    <style>
        #map {
            height: 400px;
            /* The height is 400 pixels */
            width: 100%;
            /* The width is the width of the web page */
        }
    </style>

</head>
<body>
<h3>My Google Maps Demo</h3>
<h2>${data}</h2>
<!--The div element for the map -->
<div id="map"></div>

<!--
 The `defer` attribute causes the callback to execute after the full HTML
 document has been parsed. For non-blocking uses, avoiding race conditions,
 and consistent behavior across browsers, consider loading using Promises
 with https://www.npmjs.com/package/@googlemaps/js-api-loader.
-->
<script async
        src="https://maps.googleapis.com/maps/api/js?key=AIzaSyDruCZjP_qnHh5ikKTqJWJWPAfM9CkhzIo&callback=initMap">
</script>
</body>
</html>