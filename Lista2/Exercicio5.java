import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		//  Número dentro de intervalo
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um numero: ");
		
		int numero = sc.nextInt(); 
		
		if (numero >= 10 && numero <= 50) {
            System.out.println("Está entre 10 e 50"); 
		} else {
            System.out.println("Está fora do intervalo"); 
		}
		
		sc.close();
	}

}
