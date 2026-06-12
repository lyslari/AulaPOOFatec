import java.util.Scanner; 

public class Exercicio5 {

	public static void main(String[] args) {
		// Contagem de pares
        Scanner sc = new Scanner(System.in); 

        int pares = 0;
        
        for (int i = 0; i < 10; i++) {
        	int n = sc.nextInt(); 
        	if (n % 2 == 0) pares++; 
        }
        
        System.out.println(pares); 
        
        sc.close(); 
	}

}
