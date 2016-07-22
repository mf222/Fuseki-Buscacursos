# Fuseki-Buscacursos
Archivos necesarios para correr y crear la base de datos RDF de cursos.

# Levantar servidor con datos

* Instalar Jena (apache-jena-3.1.0) descargar y descomprimir

* Registrar las variables de entorno
```
export JENAROOT=<Directorio donde se encuentre>/apache-jena-3.1.0
export JENA_HOME=<Directorio donde se encuentre>/apache-jena-3.1.0
export PATH=$PATH:$JENAROOT/bin
```

* Para comprobar la instalación `sparql --version`

* Instalar Fuseki (apache-jena-fuseki-2.4.0) descarga y entrar al directorio

* Se corre el servidor con
```
 ./fuseki-server --update --mem /ds
```

* Para correr con los datos generados en TBD
```
./fuseki-server --update --loc <Directorio donde se creo el TDB> /ds
```

## Referencias
* [Documentación](https://jena.apache.org/documentation/serving_data/)
* [Video Tutorial](https://www.youtube.com/watch?v=5-UfFV5XmTI)
