import java.util.Scanner;

public class Jogo1 {

    public static void main(String[] args) {
        char[][] tabuleiro = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
        };
        char jogadorAtual = 'X';
        Scanner scanner = new Scanner(System.in);
        boolean fimDeJogo = false;
        int jogadas = 0;

        while (!fimDeJogo) {
            imprimirTabuleiro(tabuleiro);
            System.out.println("\nJogador " + jogadorAtual + ", sua vez!");
            
            int linha, coluna;
            while (true) {
                System.out.print("Digite a linha (1-3): ");
                linha = scanner.nextInt() - 1; 
                System.out.print("Digite a coluna (1-3): ");
                coluna = scanner.nextInt() - 1;

                if (linha >= 0 && linha < 3 && coluna >= 0 && coluna < 3 && tabuleiro[linha][coluna] == ' ') {
                    break; 
                }
                System.out.println("Jogada inválida! Tente novamente.");
            }

            
            tabuleiro[linha][coluna] = jogadorAtual;
            jogadas++;

            
            if (verificarVitoria(tabuleiro, jogadorAtual)) {
                imprimirTabuleiro(tabuleiro);
                System.out.println("\nParabéns! O jogador " + jogadorAtual + " venceu!");
                fimDeJogo = true;
            } else if (jogadas == 9) {
                imprimirTabuleiro(tabuleiro);
                System.out.println("\nDeu velha! O jogo empatou.");
                fimDeJogo = true;
            } else {
                
                jogadorAtual = (jogadorAtual == 'X') ? 'O' : 'X';
            }
        }
        scanner.close();
    }

    public static void imprimirTabuleiro(char[][] tabuleiro) {
        System.out.println("\nTabuleiros (Posições):");
        for (int i = 0; i < 3; i++) {
            System.out.printf(" %c | %c | %c \n", tabuleiro[i][0], tabuleiro[i][1], tabuleiro[i][2]);
            if (i < 2) System.out.println("---|---|---");
        }
    }

    public static boolean verificarVitoria(char[][] t, char j) {
        
        for (int i = 0; i < 3; i++) {
            if ((t[i][0] == j && t[i][1] == j && t[i][2] == j) || 
                (t[0][i] == j && t[1][i] == j && t[2][i] == j)) {
                return true;
            }
        }
        
        if ((t[0][0] == j && t[1][1] == j && t[2][2] == j) || 
            (t[0][2] == j && t[1][1] == j && t[2][0] == j)) {
            return true;
        }
        return false;
    }
}