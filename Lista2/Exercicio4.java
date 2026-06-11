import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// Maior numero
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero: ");
		int num1 =  sc.nextInt();
		
		System.out.println("Digite o segundo numero: ");
		int num2 = sc.nextInt();
				
		if (num1 > num2) {
			System.out.println("O numero maior é o: " + num1);
		} else if (num2 > num1) {
			System.out.println("O numero maior é o: " + num2);
		} else {
			System.out.println("Os dois numeros são iguais");
		}
		
		sc.close();
	}

}
