# springboot-kotlin-ng2

Starter project inspired from Angular Hero App (https://angular.io/tutorial). It usage following technologies
 - kotlin
 - spring-boot-web
 - spring-boot-jpa
 - angular 4

Running App --
 - Maven command >> spring-boot:run
 - or Tomcat
 - For developing ng4 app run following command from ng2app dir >> ng build -w -op ../webapp
 
Config DB --
 - Application is at present using h2db
 - Update application.properties for config new DB
 
Project structure --
 - src/main/kotlin -> kotlin application backend based on spring-boot
 - src/ng2app - angular hero app
 - src/main/resources - java resources like logging and application.properties
 - src/main/generated-java - Generated Java code using sqldsl and kapt 
 - src/test/kotlin - testcases (TODO) 
 - src/main/java - contains java code (none)
 - src/test/java - java testcases (none) 
