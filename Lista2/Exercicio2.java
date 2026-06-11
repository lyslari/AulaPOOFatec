import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// Par ou impar
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero inteiro: ");
		
		int numero = sc.nextInt();
		
		if (numero % 2 == 0) {
			System.out.println("Par");
		} else {
			System.out.println("Impar");
		}
		
		sc.close();
	}

}
