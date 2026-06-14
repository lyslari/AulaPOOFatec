import java.util.Scanner;

public class Jogo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroSecreto = (int) (Math.random() * 100) + 1;
        boolean acertou = false;

        System.out.println("Jogo da Adivinhação (Versão FOR) - Tente adivinhar o número de 1 a 100!");

        for (int tentativa = 1; tentativa <= 10; tentativa++) {
            System.out.printf("Tentativa %d/10. Digite seu palpite: ", tentativa);
            int palpite = scanner.nextInt();

            if (palpite < 1 || palpite > 100) {
                System.out.println("Palpite inválido! Deve ser entre 1 e 100.");
                continue; 
            }

            if (palpite == numeroSecreto) {
                System.out.println("Você acertou!");
                acertou = true;
                break;
            } else if (palpite > numeroSecreto) {
                System.out.println("O número secreto é menor!");
            } else {
                System.out.println("O número secreto é maior!");
            }
        }

        if (!acertou) System.out.println("Você perdeu! O número secreto era: " + numeroSecreto);
        scanner.close();
    }
}