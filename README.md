 
 
Evidencia: GA7-220501096-AA3-EV01

Nombre: Codificación de módulos del software Stand-alone, web y móvil de acuerdo al proyecto a desarrollar 


Aprendiz: 
Jhonatan Samuel Martínez Hernández
Análisis y Desarrollo de Software
Ficha: 2675859
SENA – Centro de Comercio y Turismo
Abril 2024


Este proyecto es basado el algunos requerimientos que he desarrollado para mi proyecto final de software. 

El presente projecto, lo he desarrollando usando el framework de Java Spring Boot 3 junto con el motor de base de datos MariaDb para el back-end. En cuanto al front-end hice uso del motor de plantillas Thymeleaf junto con Bootstrap 5.3. La version de Java SDK 17.0.10 fue la utilizada para el desarollo del programa.

Las funciones que se pueden ejecturar son: 

* Crear nuevo producto.
* Listar todos los productos existentes.
* Modificar información de un producto.
* ver los detalles de un producto por su Id.
* Eliminar un producto de la base de datos.

#Vistas

* Vista de inicio del programa

![index_view_product_manager_system_spring_boot](https://github.com/dev-jsmh/spring-boot-products-manager-system-/assets/112201008/a2b5d283-c702-41df-954c-c66a4fd55f2a)


* Vista modulo Administrar Productos

![tabla_productos](https://github.com/dev-jsmh/spring-boot-products-manager-system-/assets/112201008/4e08cf32-3dd9-47c3-b45f-9d3de7d11636)


* Vista Crear Nuevo Producto

![crear_producto](https://github.com/dev-jsmh/spring-boot-products-manager-system-/assets/112201008/7857062a-bfd1-4219-a35a-0762c5e36a3d)


* Vista Detalles del Producto

![detalles_producto](https://github.com/dev-jsmh/spring-boot-products-manager-system-/assets/112201008/eb58313f-6859-424b-9103-6def812270e9)


* Vista Modificar Productos

![modificar_product](https://github.com/dev-jsmh/spring-boot-products-manager-system-/assets/112201008/edb5161f-d49b-48d4-b659-c4286411dbe4)


* Vista Modal Confirmación Eliminar Producto

![eliminar_producto](https://github.com/dev-jsmh/spring-boot-products-manager-system-/assets/112201008/566deb05-3cfc-41d7-89da-c0883bd059f9)


* Vista Modal Confirmación Modificar Datos del Producto

![modal_validacion_modificar](https://github.com/dev-jsmh/spring-boot-products-manager-system-/assets/112201008/c29e13e7-221d-4aa3-9888-9ebfd7d73f67)


Nota:
En la carpeta "db" que se encuentra en la raiz del projecto encontrará el script de la base de datos que podra utilizar para generar una copia local en su computadora para la ejecución del projecto. Aunque, spring boot le genera la DB de manera automatica al momento de correr el projecto.

Adicionalmente, he incluido una version exejutable con extención .jar en la carpeta "compiled-project" ubicada en la raiz del proyecto.
