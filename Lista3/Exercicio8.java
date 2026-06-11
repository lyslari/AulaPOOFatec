import java.util.Scanner; 

public class Exercicio8 {

	public static void main(String[] args) {
		// Média de valores
		Scanner scanner = new Scanner(System.in);

		 System.out.print("Quantos números deseja informar? "); 
		 int quantidade = scanner.nextInt();
		 
		 double soma = 0; 
		 
		 for (int i = 1; i <= quantidade; i++) {
			 System.out.print("Digite o " + i + "º número: "); 
			 double numero = scanner.nextDouble(); 
			 soma += numero;
		 } 
		 
		 double media = soma / quantidade; 
		 System.out.println("Média: " + media);
		 
	        scanner.close(); 
	}

}
