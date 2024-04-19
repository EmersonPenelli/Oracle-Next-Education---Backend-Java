public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top gun: Maverick");

        int anodeLancamento = 2022;
        System.out.println("Ano de Lançamento: " + anodeLancamento);
        boolean incluidoNoPlano = false;
        double notaDoFilme = 8.1;

        double media = (9.8 + 6.3 + 8.0)/ 3;
        System.out.println(media);
        String sinopse;
        sinopse = """
                Filme Top Gun
                Filme de aventura com ação
                Muito bom!
                Ano de lançamento
                """ + anodeLancamento;
        System.out.println(sinopse);


        // Casting - Convertendo valores
        int classificacao = (int) (media / 2);
        System.out.println(classificacao);
    }
}
