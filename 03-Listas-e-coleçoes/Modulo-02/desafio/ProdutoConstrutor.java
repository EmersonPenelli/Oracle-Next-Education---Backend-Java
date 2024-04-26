public class Produto {
    // ... 

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public static void main(String[] args) {
        Produto produtoNovo = new Produto("Novo Produto", 15.99, 3);
        System.out.println(produtoNovo);
    }
}


