import java.util.Scanner; 

public class Exercicio7 {

	public static void main(String[] args) {
		// 10 números: positivos e negativos
		Scanner scanner = new Scanner(System.in);
		
		int positivos = 0;
		int negativos = 0;
		
		System.out.println("Digite 10 números inteiros: ");
		for (int i = 1; i <=10; i++) {
			System.out.println("Número " + i + ": ");
			
			int numero = scanner.nextInt();
			
			if (numero > 0) {
				positivos++;
			} else if (numero < 0) {
				negativos++;
			}
		}
		System.out.println("Quantidade de números positivos: " + positivos);
		System.out.println("Quantidade de números negativos: " + negativos);
		
		scanner.close();
	}

}
