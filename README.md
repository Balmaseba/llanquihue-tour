# Llanquihue Tour

## Autor del proyecto

* **Nombre completo:** Sebastián Alejandro Reinoso Ortega
* **Sección:** DESARROLLO ORIENTADO A OBJETOS I_001A
* **Carrera:** ANALISTA PROGRAMADOR COMPUTACIONAL
* **Sede:** Online

---

## Descripción general del sistema

Este proyecto corresponde a la Tercera Actividad Sumativa de la asignatura Desarrollo Orientado a Objetos I. Se trata de una aplicación desarrollada en Java que permite gestionar un catálogo de tours de turismo mediante la lectura de información almacenada en un archivo de texto.

El sistema carga los datos de los tours desde un archivo externo, crea objetos de tipo `Tour` y los almacena en una colección dinámica (`ArrayList`). Posteriormente, permite visualizar el catálogo completo y aplicar consultas sobre los datos, como la búsqueda de tours por categoría y la identificación del tour con el menor precio.

El objetivo principal es aplicar conceptos de Programación Orientada a Objetos, manejo de archivos, colecciones dinámicas, encapsulamiento y organización modular del código.

---

## Estructura general del proyecto

📁 src/

├── 📁 data/          # Clase encargada de la lectura y gestión de datos (GestorDatos)

├── 📁 model/         # Clase de dominio (Tour)

├── 📁 resources/     # Archivo de datos de los tours (tour.txt)

└── 📁 ui/            # Clase principal con el método main

---

## Instrucciones para ejecutar el proyecto

1. Clonar el repositorio o descargar el proyecto.

2. Abrir el proyecto en IntelliJ IDEA o Apache NetBeans.

3. Verificar que el archivo `tour.txt` se encuentre dentro de la carpeta `src/resources`.

4. Ejecutar el archivo `Main.java` ubicado en el paquete `ui`.

5. El sistema cargará automáticamente los datos de los tours y mostrará por consola:

   * El catálogo completo de tours.
   * El filtro de tours de pesca.
   * El tour con el precio más bajo.

---

## Repositorio GitHub

https://github.com/Balmaseba/llanquihue-tour

**Fecha de entrega:** 15/06/2026
