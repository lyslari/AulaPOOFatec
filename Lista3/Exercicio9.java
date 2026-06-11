import java.util.Scanner; 

public class Exercicio9 {

	public static void main(String[] args) {
		// fatorial
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite um número inteiro positivo: ");
		
		int numero = scanner.nextInt();
		
		int fatorial = 1;
		
		for (int i = numero; i >= 1; i--) {
            fatorial *= i; 
		}
		System.out.println(numero + "! = " + fatorial);
		
		scanner.close();
	}

}
