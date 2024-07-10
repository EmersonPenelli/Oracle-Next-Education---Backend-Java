# Erro de Portas

Ao tentar executar o projeto, você pode obter o seguinte erro:
```

***************************
APPLICATION FAILED TO START
***************************

Description:

Web server failed to start. Port 8080 was already in use.

Action:

Identify and stop the process that's listening on port 8080 or configure this application to listen on another port.

Process finished with exit code 1
```

Esse erro indica que você está tentando acessar a porta 8080, mas ela já está em uso. O Spring Boot já sobe o servidor, por padrão, na porta 8080, mas podemos alterar essa porta para prosseguir sem erros. Para fazer isso, basta adicionar a linha a seguir no arquivo `application.properties`:
```
server.port=8081
```

Nesse caso, estamos trocando a porta para 8081, mas você pode tentar utilizar alguma outra também. Assim, seu projeto rodará normalmente e poderemos prosseguir!
