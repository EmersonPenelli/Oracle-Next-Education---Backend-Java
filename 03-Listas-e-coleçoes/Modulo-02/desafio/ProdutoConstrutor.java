public class Produto {

    // ... 

    @Override
    public String toString() {
        return "Produto [nome=" + nome + ", preco=" + preco + ", quantidade=" + quantidade + "]";
    }

    public static void main(String[] args) {
        ArrayList<Produto> listaProdutos = new ArrayList<>();
        // …
 
        for (Produto produto : listaProdutos) {
            System.out.println(produto);
        }
    }
}

