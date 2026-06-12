import java.util.Scanner; 

public class DesafioExercicio24 {

	public static void main(String[] args) {
		// Busca em matriz
        Scanner sc = new Scanner(System.in);

        int[][] m = new int[5][5]; 
        
        for (int i = 0; i < 5; i++) {
        	for (int j = 0; j < 5; j++) {
                m[i][j] = sc.nextInt(); 
        	}
        }
        int x = sc.nextInt(); 
        
        for (int i = 0; i < 5; i++) {
        	for (int j = 0; j < 5; j++) {
        		if (m[i][j] == x) {
                    System.out.println("Encontrado em: " + i + "," + j); 
        		}
        	}
        }
        
        sc.close(); 

	}

}
