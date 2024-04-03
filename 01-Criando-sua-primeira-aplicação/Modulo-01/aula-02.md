## O JDK (Java Development Kit) é um conjunto de ferramentas e bibliotecas de software que permite o desenvolvimento de aplicativos Java.

Nesse preparando o ambiente vamos instalar o JDK para começarmos a desenvolver nossos primeiros programas em Java!

Linux
1) No terminal, vamos executar o seguinte comando para atualizar a lista de pacotes disponíveis para download nos repositórios do sistema:

```
sudo apt update
```


2) Feito isso, agora vamos instalar a versão 17 do JDK através do comando:

```
sudo apt install openjdk-17-jdk
```

3) Dessa forma, o sistema irá baixar e instalar o pacote OpenJDK 17 JDK, permitindo que o usuário comece a desenvolver aplicativos Java no Linux. Terminado esse processo de instalação, agora precisamos configurar a variável de ambiente <b>JAVA_HOME</b>, utilizada para indicar o caminho de instalação do JDK. Em uma tradução literal seria o “lar do java” e ela será necessária para utilizarmos os recursos do JDK como o <b>javac</b>.

Para isso, iremos executar o comando `sudo update-alternatives --config java` que mostrará o caminho onde o JDK foi instalado.

Agora, precisamos copiar esse caminho até /bin, por exemplo: `/usr/lib/jvm/java-17-openjdk-amd64/bin` e digitar no seu terminal o comando: `export JAVA_HOME=`, sendo que após o sinal de igual, sem deixar espaços, cole o caminho que você copiou da instalação do JDK.
