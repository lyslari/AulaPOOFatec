import java.util.Scanner; 

public class Exercicio10 {

	public static void main(String[] args) {
		// Soma até digitar zero
		Scanner scanner = new Scanner(System.in);
		
		int soma = 0; 
		int numero; 
		
		do {
			System.out.print("Digite um número ou 0 para sair: "); 
	        numero = scanner.nextInt(); 
	        soma += numero;
	        
		} while (numero != 0);
		
		System.out.println("Soma total: " + soma);
		
		scanner.close();
	}

}
