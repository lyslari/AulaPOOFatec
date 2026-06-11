import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		//  Classificação por idade
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a sua idade: "); 
		int idade = sc.nextInt(); 
		
		if (idade >= 0 && idade <= 12) {
			System.out.println("Você é criança");
		} else if (idade <= 17) {
            System.out.println("Você é adolescente"); 
		} else if (idade <= 59) {
            System.out.println("Você é adulto"); 
		} else {
			 System.out.println("Você é idoso"); 
		}
		
		sc.close();
	}

}
