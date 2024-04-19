import java.util.Scanner;

public class NumeroPouNumeroN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário um número
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        // Verifica se o número é positivo ou negativo
        if (numero > 0) {
            System.out.println("Número positivo");
        } else if (numero < 0) {
            System.out.println("Número negativo");
        } else {
            System.out.println("O número é zero");
        }

        scanner.close();
    }
}
