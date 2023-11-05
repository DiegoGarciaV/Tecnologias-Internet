# Tecnologias-Internet
Repositorio para los proyectos de Tecnologias para desarrollos en Internet

    * Validacion Back End:
        - Colcorse en la ruta del proyecto
        - Ejecutar el siguiente comando: for /r "src\com\freshbowl" %i in (*.java) do javac -cp "webapp/WEB-INF/classes;webapp/WEB-INF/lib/servlet-api.jar;webapp/WEB-INF/lib/mysql-connector-j-8.1.0.jar" -d webapp\WEB-INF\classes "%i"
        - Ejecutar el siguiente comando: jar cvf fresh-bowl.war -C webapp\WEB-INF\classes . -C webapp . 
        - Desplegar aplicacion en Tomcat
            * Colocar *.war en Tomcat/webapps
            * Reiniciar Tomcat