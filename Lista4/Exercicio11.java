import java.util.Scanner; 

public class Exercicio11 {

	public static void main(String[] args) {
		// Leitura Matriz 3x3
        Scanner sc = new Scanner(System.in);
        int[][] m = new int[3][3]; 
        
        for (int i = 0; i < 3; i++) {
        	for (int j = 0; j < 3; j++) {
        		 m[i][j] = sc.nextInt(); 
        	}
        }
        System.out.println("\nMatriz informada:"); 
        
        for (int i = 0; i < 3; i++) {
        	for (int j = 0; j< 3; j++) {
        		System.out.print(m[i][j] + "\t");
        	}
        	System.out.println();
        }
        sc.close();
	}

}
