# SQL no Maven

Houve uma mudança no Maven em relação à dependência do MySQL, na qual o group-id e o artifact-id foram alterados.

A partir de agora, você deve adicionar a dependência do driver MySQL no arquivo pom.xml da seguinte maneira:
```
<dependency>
    <groupId>com.mysql</groupId>
    <artifactId>mysql-connector-j</artifactId>
    <scope>runtime</scope>
</dependency>
```
Além disso, pode acontecer do Spring Boot não encontrar automaticamente o driver do MySQL no projeto, sendo recomendado que você adicione mais uma propriedade no arquivo application.properties:
```
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
```
