# Intellij

 
A primeira vez que abrimos o IntelliJ vai ter mais ou menos essa aparência, dependendo da versão.

Podemos ou abrir um projeto ou iniciar um novo projeto. Então vamos clicar na opção "New Project".

Ele vai abrir uma janela em que devemos inserir o nome que queremos para esse projeto. Vou escrever "primeiroprojeto" e a pasta podemos nomear como "programa".

Já vai ter uma caixa de seleção para criar um repositório do GitHub para esse projeto, "Create Git repository". Vamos deixar essa caixa de seleção selecionada.

Em seguida, podemos escolher a linguagem. No caso, vamos deixar o Java selecionado. Também temos a opção do sistema de build, falaremos um pouco sobre isso quando estivermos falando sobre compilação.

Por enquanto, vamos deixar o IntelliJ selecionado nesse campo de build system. Mas conforme você for evoluindo nos estudos, verá que muita coisa já está pronta.

Depois, vamos informar qual JDK que vamos usar. No meu caso, só tenho instalada a JDK 17, vamos selecioná-la.

Vai aparecer para você todas as JDKs que você tem instaladas e você escolhe.


Pode acontecer, por exemplo, que você precise usar a 11. Porque no emprego em que você está só usam a 11 e não deixam atualizar porque têm medo. O que é uma situação muito comum, não só em Java, não ficamos atualizando todas as bibliotecas o tempo todo. Principalmente em empresas grandes, porque pode causar alguns efeitos colaterais.

Em seguida, temos a opção de já começar com um código de exemplo. Para isso, vamos selecionar a opção "Add sample code" (adicionar código de exemplo).

Podemos clicar no botão "Create". Ele vai criar o nosso projeto.

Agora temos uma visão geral do projeto. No painel à esquerda, onde temos a estrutura do projeto, é muito comum termos uma pasta chamada "src", que é uma abreviação para "source", em português "fonte", é onde temos o nosso código-fonte.

E, na tela de edição,temos o código exemplo da nossa primeira classe. Ele criou com o nome de Main, ou seja, a classe principal.

Nossos arquivos em Java ficarão divididos em classes.

Observe que ele já criou para nós um comando e uma instrução:


```
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}

```


À esquerda temos a estrutura de diretórios do projeto, temos a pasta "src" com o arquivo `Main`, logo abaixo temos o `.gitgnore` que ele já preparou para o GitHub e tem também um arquivo `primeiroprojeto.iml`, "iml" deve ser alguma configuração do IntelliJ mesmo.
