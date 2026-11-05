# NSJ-Company

## Compilación con Maven

Requisitos: JDK 19 o superior y Maven 3.9 o superior. `JAVA_HOME` debe
apuntar al JDK y el comando `java` debe usar esa misma instalación
(comprobar con `mvn -version` y `java -version`). Java 8 no es compatible.

Desde la raíz del repositorio:

```powershell
mvn clean package
java -jar target/nsj-company-1.0-SNAPSHOT.jar
```

Maven descarga las dependencias automáticamente. El resultado es el JAR
en `target/` junto con sus bibliotecas en `target/lib/`; para distribuir
la aplicación hay que conservar ambos. Los recursos gráficos se incluyen
en el JAR. En NetBeans se puede abrir la carpeta raíz como proyecto Maven;
esta compilación no depende de la configuración privada del antiguo proyecto Ant.

Para iniciar sesión y usar las funciones de negocio también se necesita MySQL
y la base de datos configurada en `App/src/ConexionBD/Conexion.java`.
La compilación no requiere una base de datos activa. El script SQL y los
problemas funcionales de ventas quedan pendientes de una revisión independiente.

## Descripción original

Es un Software creado en Java puro, que permite la gestión de inventario de un giro de negocio, está pensado para negocios de barrio a miniMarket, 
-Cuenta con control de Stock.
-Sala de ventas de productos en Inventario.
-CRUD Proveedor asignado a cada producto que vende (asi facilita la compra del cliente para cada proveedor y saber que productos son los que el tiene). 
-2 tipos de Secciones (ADMIN, Cajero).
-CRUD Personal con asignacion de privilegios.
-CRUD de clientes para generar facturas.
