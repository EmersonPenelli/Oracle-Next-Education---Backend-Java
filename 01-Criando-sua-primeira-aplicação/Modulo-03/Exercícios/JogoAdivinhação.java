import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Random random = new Random();
        int numeroAleatorio = random.nextInt(100);
        Scanner scanner = new Scanner(System.in);
        int tentativas = 0;

        System.out.println("Bem-vindo ao Jogo de Adivinhação!");
        System.out.println("Tente adivinhar o número entre 0 e 100.");

        while (tentativas < 5) {
            System.out.print("Tentativa " + (tentativas + 1) + ": Digite um número: ");
            int palpite = scanner.nextInt();
            tentativas++;

            if (palpite == numeroAleatorio) {
                System.out.println("Parabéns! Você acertou o número " + numeroAleatorio + " em " + tentativas + " tentativas.");
                break;
            } else if (palpite < numeroAleatorio) {
                System.out.println("O número que você digitou é menor que o número aleatório.");
            } else {
                System.out.println("O número que você digitou é maior que o número aleatório.");
            }
        }

        if (tentativas == 5) {
            System.out.println("Você excedeu o número máximo de tentativas. O número correto era " + numeroAleatorio + ".");
        }

        scanner.close();
    }
}
