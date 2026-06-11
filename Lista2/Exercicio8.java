import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		// Maior de tres números
		Scanner sc = new Scanner(System.in);

		 System.out.print("Digite o primeiro número: "); 
		 int num1 = sc.nextInt(); 
		 
		 System.out.print("Digite o segundo número: "); 
		 int num2= sc.nextInt(); 
		 
		 System.out.print("Digite o terceiro número: "); 
		 int num3= sc.nextInt();
		 
		 if (num1 >= num2 && num1 >= num3) {
			 System.out.println("O maior número é o: " + num1);
		 } else if (num2 >= num1 && num2 >= num3) {
			 System.out.println("O maior número é o: " + num2);
		 } else {
			 System.out.println("O maior número é o: " + num3);
		 }
		 
		 sc.close();
	}

}
