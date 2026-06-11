import java.util.Scanner; 

public class Exercicio11 {

	public static void main(String[] args) {
		// Validação
		Scanner scanner = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Digite um numero entre 1 a 10: ");
		numero = scanner.nextInt();
				
		while (numero < 1 || numero > 10)		
		{
			System.out.println("Numero invalido! Digite novamente entre 1 e 10: ");
			numero = scanner.nextInt();
		}			
			System.out.println("Numero " + numero + " validado com sucesso!");
			
			scanner.close();
	}

}
