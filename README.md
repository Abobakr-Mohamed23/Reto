- En la carpeta creacionBD está el archivo scriptBD.txt para ejecutar manualmente en Derby y crear e insertar los datos en la BD
- También tenemos la clase PruebaConexion.java para verificar que tenemos conexión a la BD Derby 
- Finalmente tenemos la clase InsertarDatos.java para ejecutar e insertar directamente los datos en la BD (Solo funciona si se ha creado las tablas en las bases de datos)

El usuario y contraseña para la BD será "reto" el cual en la clase DerbyUtil tenemos toda la configuración.

- Se ha instalado una dependencia jcalendar para manejar los datos tipo Date en los formularios de las vistas, adjunto link de descarga: https://www.toedter.com/download/jcalendar-1.4.zip

- Cada participante deberá crear una clase dentro del parquete acceso con el nombre accesoNombreEntidad para el desarrollo de las actividades.

- Antes de iniciar el desarrollo hay que configurar la base de datos derby-10.17.1.0, 
la forma correcta es: 
Services -> JAVA DB -> properties -> y en Java DB Installation poner la ruta a la BD derby-10.17.1.0 que en mi caso es: C:\Program Files\Java\jdk-21\Apache\db-derby-10.17.1.0-bin 

para Database Location: C:\Program Files\Java
