import java.util.Random;
import java.util.Scanner;

public class Jogo3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int pontuacaoTotal = 0;
        boolean continuarJogo = true;

        System.out.println("=== Bem-vindo ao Cofre Misterioso! ===");

        while (continuarJogo) {
            System.out.print("\nEscolha a dificuldade [1-Fácil(1-20) | 2-Médio(1-50) | 3-Difícil(1-100)]: ");
            int dif = lerInteiro(sc);
            int max = (dif == 1) ? 20 : (dif == 3) ? 100 : 50;

            int numeroSecreto = 1 + rd.nextInt(max);
            boolean acertou = false;
            int pontosRodada = 10;

            for (int tent = 1; tent <= 5; tent++) {
                System.out.printf("Tentativa %d/5. Seu palpite: ", tent);
                int palpite = lerInteiro(sc);

                if (palpite == numeroSecreto) {
                    System.out.println("Cofre aberto! Código: " + numeroSecreto);
                    acertou = true;
                    break;
                } else {
                    pontosRodada = Math.max(0, pontosRodada - 2);
                    String dica = (palpite > numeroSecreto) ? "MENOR" : "MAIOR";
                    System.out.printf("O código é %s. Restam %d tentativas.\n", dica, 5 - tent);
                }
            }

            if (!acertou) {
                System.out.println("Tentativas acabaram! O código era: " + numeroSecreto);
                pontosRodada = 0;
            }

            pontuacaoTotal += pontosRodada;
            System.out.println("Pontuação nesta rodada: +" + pontosRodada);

            char resposta;
            do {
                System.out.print("Deseja jogar novamente? (s/n): ");
                resposta = sc.next().toLowerCase().charAt(0);
            } while (resposta != 's' && resposta != 'n');

            if (resposta == 'n') {
                continuarJogo = false;
            }
        }

        System.out.println("\n=== FIM DE JOGO ===");
        System.out.println("Pontuação final acumulada: " + pontuacaoTotal + " pontos.");
        sc.close();
    }

    public static int lerInteiro(Scanner sc) {
        while (!sc.hasNextInt()) {
            System.out.print("Entrada inválida! Digite apenas números: ");
            sc.next();
        }
        return sc.nextInt();
    }
}

