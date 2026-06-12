import java.util.Scanner; 

public class Exercicio1 {

	public static void main(String[] args) {
		// Leitura e exibição
        Scanner sc = new Scanner(System.in); 
        int[] v = new int[5]; 
        
        for (int i = 0; i < v.length; i++) {
        	 v[i] = sc.nextInt(); 
        }
        for (int i = 0; i < v.length; i++) {
        	 System.out.println(v[i]); 
        }
        sc.close(); 
	}

}
