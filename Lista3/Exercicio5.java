import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// Tabuada
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um número para ver a tabuada: ");
		int numero = scanner.nextInt();
		
		for (int i = 1; i <=10; i++) {
			System.out.println(numero + "x" + i + "=" +  (numero * i));
		}
		
		scanner.close();
	}

}
