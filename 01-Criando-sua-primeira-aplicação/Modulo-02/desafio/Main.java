//Exercício 1 

public class Media{
    public static void main(String[] args) {
        double nota1 = 8.9;
        double nota2 = 7.5;
        double media = (nota1 + nota2) / 2;

        System.out.println("Média: " + media);
    }
}

//Exercício 2

public class Casting{
    public static void main(String[] args) {
        double numeroDouble = 15.7;
        int numeroInteiro = (int) numeroDouble;
        System.out.println("Casting de double para int: " + numeroInteiro);
    }
}

//Exercício 3

public class Palavras{
    public static void main(String[] args) {
        char letra = 'A';
        String palavra = "MARELO";

        String mensagem = "A letra é " + letra + " e a palavra é " + palavra;

        System.out.println(mensagem);
    }
}


//Exercício 4
public class Produto{
    public static void main(String[] args) {
        double precoProduto = 29.99;
        int quantidade = 3;

        double total = precoProduto * quantidade;

        String mensagem = "O valor total da compra é R$" + total;

        System.out.println(mensagem);
    }
}

//Exercício 5
public class ConversaoDolaresReais {
    public static void main(String[] args) {
        double valorEmDolares = 100.50;
        double taxaDeConversao = 4.94;

        double valorEmReais = valorEmDolares * taxaDeConversao;

        System.out.println("O valor em reais é: " + valorEmReais);
    }
}

//Exercício 6
public class CalculoDesconto {
    public static void main(String[] args) {
        double precoOriginal = 150.0;

        double percentualDesconto = 10.0;
        double valorDesconto = (percentualDesconto / 100.0) * precoOriginal;
        double novoPreco = precoOriginal - valorDesconto;

        System.out.println("Preço original: R$" + precoOriginal);
        System.out.println("Desconto: R$" + valorDesconto);
        System.out.println("Novo preço com desconto: R$" + novoPreco);
    }
}

