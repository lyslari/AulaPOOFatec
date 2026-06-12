import java.util.Scanner; 

public class Exercicio2 {

	public static void main(String[] args) {
		//  Soma dos elementos
        Scanner sc = new Scanner(System.in); 

        int soma = 0; 
        for (int i = 0; i < 10; i++) {
        	 soma += sc.nextInt();
        }
        
        System.out.println(soma); 
        sc.close(); 
	}

}
