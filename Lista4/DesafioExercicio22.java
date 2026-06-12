import java.util.Scanner; 

public class DesafioExercicio22 {

	public static void main(String[] args) {
		// Sudoku simplificado (3x3 sem repetição)
        Scanner sc = new Scanner(System.in);

        int[][] m = new int[3][3]; 
        boolean repetido = false;
        
        System.out.println("Digite os elementos da matriz 3x3 (de 1 a 9):");
        
        for (int i = 0; i < 3; i++) {
        	for (int j = 0; j < 3; j++) {
        		m[i][j] = sc.nextInt();
        	}
        }
        boolean[] conferir = new boolean[10];
        
        for (int i = 0; i < 3; i++) {
        	for (int j = 0; j < 3; j++) {
        		int valor = m [i][j];
        		if (valor >= 1 && valor <= 9) {
        			if (conferir[valor]) {
        				repetido = true;
        			}
        			conferir[valor] = true;
        		}
        	}
        }
        if (repetido) {
        	System.out.println("A matriz possui numeros repetidos.");
        } else {
        	System.out.println("A matriz não possui numeros repetidos (Válida!).");
        }
        sc.close();		
	}

}
