import java.util.Scanner; 

public class Exercicio12 {

	public static void main(String[] args) {
		// Menu interativo
		Scanner scanner = new Scanner(System.in);
		int opcao;
		
		do {
			 System.out.println("1 - Somar"); 
	         System.out.println("2 - Subtrair"); 
	         System.out.println("3 - Sair"); 
	         System.out.print("Escolha uma opção: "); 
	         opcao = scanner.nextInt(); 
	         
	         if (opcao == 1) {
	        	 System.out.print("Digite o primeiro número: "); 
	        	 int a = scanner.nextInt();
	        	 
	        	 System.out.print("Digite o segundo número: "); 
	        	 int b = scanner.nextInt(); 
	        	 
	             System.out.println("Resultado: " + (a + b)); 

	         } else if (opcao == 2) {
	        	 System.out.print("Digite o primeiro número: "); 
	        	 int a = scanner.nextInt(); 
	        	 System.out.print("Digite o segundo número: "); 
	        	 
	        	 int b = scanner.nextInt(); 
	        	 System.out.println("Resultado: " + (a - b)); 
	        	 
	         } else if  (opcao == 3) {
	             System.out.println("Encerrando o programa..."); 

	         } else {
	             System.out.println("Opção inválida."); 

	         }
		} while (opcao != 3); 
		
		scanner.close();
	}

}
