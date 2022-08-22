# Laboratorio 2 CVDS
**Nombre:** Wilson Alirio Delgado Hernandez

## Herramienta Maven
#### ¿Cuál es su mayor utilidad?
Permite generar compilados de los proyectos y estructurarlos de forma ordenada a través de un archivo de configuración **pom.xml**.
También permite trabajar en red, es decir, ubica todas las librerías con las que se requiera trabajar en Maven Central.

#### Fases de Maven
1. Validar
* Valida que el proyecto dispone de la información necesaria para ser procesado
2. Compilar
* Compila ficheros fuente .java y genera carpetas de destino 
3. Test
* Ejecuta pruebas unitarias
4. Package
* Empaqueta código a un formato estándar de Java 
5. Verificar
* Lanza tests de integración  
6. Instalar
* Despliega el artefacto (bloque de código reutilzable) en el repositorio local para que otros artefactos puedan hacer uso de este.
7. Despliegue
* Ubica copia del .jar en servidor remoto

#### Ciclo de vida de la construcción
* Ciclo de vida default\
Gestiona la construcción y despliegue del proyecto.
* Ciclo de vida clean\
Gestiona la limpieza del directorio del proyecto. Es decir, se encarga de eliminar todos los archivos generados en el proceso de construcción y despliegue.
* Ciclo de vida site\
Gestiona la creación de la documentación del proyecto.

#### ¿Para qué sirven los plugins?
Sirven para centralizar una serie de tareas que son comunes a la construcción del software y están fuertemente relacionadas
#### ¿Qué es y para qué sirve el repositorio central de maven?
Es la ubicación predeterminada para que maven descargue las dependencias del proyecto.
Es un repositorio proveído por la comunidad de Maven, contiene una gran cantidad de librerías comúnmente usadas.




## Ejercicio de las figuras
### Crear un proyecto con maven
* Los arquetipos son plantillas, parametrizadas o configuradas para utilizar determinadas tecnologías, que los programadores 
  utilizan como base para escribir y organizar el
  código de la aplicación.

* Se puede ejecutar desde la línea de comandos para crear un nuevo proyecto

~~~
mvn archetype:generate -DgropuId=edu.eci.cvds -DartifactId=Patterns -DarchetypeArtifactId=maven-archetype-quickstart -Dpackage=edu.eci.cvds.patterns -DinteractiveMode=false
~~~

### Compilar y ejecutar
* El objetivo de **package** es empaquetar el código compilado y transformarlo en algún formato tipo .jar o .war.
* Ejecución sin parámetros
~~~
mvn exec:java -D"exec.mainClass=edu.eci.cvds.patterns.App"
~~~
_Resultado_
~~~
Hello World!
~~~
* Ejecución enviando nombre como parámetro
~~~
mvn exec:java -D"exec.mainClass=edu.eci.cvds.patterns.App" -D"exec.args"="Wilson"
~~~
_Resultado_
~~~
Hello Wilson!
~~~
* Ejecución con nombre y apellido
~~~
mvn exec:java -D"exec.mainClass=edu.eci.cvds.patterns.App" -D"exec.args"="Wilson Delgado"
~~~
_Resultado_
~~~
Hello Wilson Delgado!
~~~

### Esqueleto de la aplicación
* Ejecución ShapeMain sin parámetros

~~~
 mvn exec:java -D"exec.mainClass=edu.eci.cvds.patterns.shapes.ShapeMain" 
~~~
_Resultado_
~~~
Parameter of type RegularShapeType is required.
~~~
* Ejecución ShapeMain parámetro: qwerty

~~~
mvn exec:java -D"exec.mainClass=edu.eci.cvds.patterns.shapes.ShapeMain" -D"exec.args"="qwerty"
~~~
_Resultado_
~~~
Parameter 'qwerty' is not a valid RegularShapeType
~~~
* Ejecución ShapeMain parámetro: pentagon

~~~
mvn exec:java -D"exec.mainClass=edu.eci.cvds.patterns.shapes.ShapeMain" -D"exec.args"="pentagon"
~~~
_Resultado_
~~~
Parameter 'pentagon' is not a valid RegularShapeType
~~~
* Ejecución ShapeMain parámetro: Hexagon

~~~
mvn exec:java -D"exec.mainClass=edu.eci.cvds.patterns.shapes.ShapeMain" -D"exec.args"="Hexagon"
~~~
_Resultado_
~~~
Successfully created a Hexagon with 6 sides.
~~~


* Funciona correctamente la última instrucción ya que el parámetro que se ingresa es válido dentro de la enumeración en RegularShapeType

### Gitignore
* El archivo .gitignore, es un archivo de texto que le dice a Git qué archivos o carpetas ignorar en un proyecto
  * "*"  se utiliza como una coincidencia comodín.
  * "/" se usa para ignorar las rutas relativas al archivo .gitignore.
  * "#" es usado para agregar comentarios

## Bibliografía
* http://panamahitek.com/que-es-maven-y-para-que-se-utiliza/
* https://www.arquitecturajava.com/que-es-un-maven-lifecycle-y-como-funciona/
* https://www.arquitecturajava.com/que-es-un-maven-goal/
* https://geekflare.com/es/apache-maven-for-beginners/
* https://www.adictosaltrabajo.com/2008/06/09/creararquetiposmaven/
* https://maven.apache.org/guides/getting-started/maven-in-five-minutes.html
* https://www.freecodecamp.org/espanol/news/gitignore-explicado-que-es-y-como-agregar-a-tu-repositorio/#:~:text=gitignore%20%2C%20es%20un%20archivo%20de,puedes%20crear%20un%20archivo%20global%20.
