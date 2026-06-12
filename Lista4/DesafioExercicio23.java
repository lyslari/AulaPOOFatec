import java.util.Scanner; 

public class DesafioExercicio23 {

	public static void main(String[] args) {
		// Rotação de matriz 90 grausb
        Scanner sc = new Scanner(System.in);

        int[][] m = new int[3][3]; 
        int[][] r = new int[3][3]; 
        
        for (int i = 0; i < 3; i++) {
        	for (int j = 0; j < 3; j++) {
                m[i][j] = sc.nextInt(); 
        	}
        }
        for (int i = 0; i < 3; i++) {
        	for (int j = 0; j < 3; j++) {
        		 r[j][2- i] = m[i][j]; 
        	}
        }
        for (int i = 0; i < 3; i++) {
        	for (int j = 0; j < 3; j++) {
        		System.out.print(r[i][j] + " "); 
        	}
            System.out.println(); 
        }
        
        sc.close(); 

	}

}
