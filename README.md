# GeoGO


Esta aplicación le permite calcular rutas desde y hacia diferentes puntos en el mapa. Usted tiene la posibilidad de compartir su ubicación o escribir una dirección para calcular la ruta óptima. Cuenta además con la información de tráfico, que usted puede consultar para validar si la ruta es apropiada. 

Adicionalmente la aplicación muestra las indicaciones de cada ruta trazada, y por medio de un asistente de voz se describe la sección seleccionada. 

Esta aplicación fue adaptada por el grupo Semillero de Innovación Geográfica (SIG) de Esri Colombia. Para mayor información, no olvide seguirnos en la cuenta de Twitter @geo_geeks o en el portal de desarrolladores http://desarrolladores.esri.co.

## Configuración

Para que la aplicación sea funcional es necesario contar con un los Sistemas de Información Geográfica de ESRI Colombia por medio de la plataforma ArcGis, de ahí se toman lo datos a mostrar

Se debe generar el codigo de Google Cloud Messaging para habilitar la recepcion de notificaciones en el dispositivo Android

   ```java
// Create a new application at https://developers.arcgis.com/en/applications
private static final String AGO_CLIENT_ID = "...";

// The project number from https://code.google.com/apis/console
private static final String GCM_SENDER_ID = "...";
```

## Implementación

- Se requiere que los servicios de Arcgis se encuentren habilitados y públicos
- Agregue el proyecto en su entorno de desarrollo para aplicaciones moviles

## Licenciamiento

Copyright 2014 Esri

Licenciado bajo la licencia Apache, Versión 2.0; usted no puede utilizar este archivo excepto en conformidad con la Licencia. Usted puede obtener una copia de la licencia en

http://www.apache.org/licenses/LICENSE-2.0

A menos que lo requiera la ley o se acuerde por escrito, el software distribuido bajo la licencia se distribuye "TAL CUAL", SIN GARANTÍAS NI CONDICIONES DE NINGÚN TIPO, ya sea expresa o implícita. Consulte la licencia para los permisos específicos de gobierno de idiomas y limitaciones en la licencia. 

Una copia de la licencia está disponible en el archivo license.txt del repositorio.
