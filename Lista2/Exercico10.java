import java.util.Scanner;

public class Exercico10 {

	public static void main(String[] args) {
		// Desconto em compra
		Scanner sc = new Scanner(System.in);

		 System.out.print("Digite o valor da sua compra R$: "); 
		 
		 double valorCompra = sc.nextDouble(); 
		 double valorFinal;
		 
		 if (valorCompra >= 100) {
			 double desconto = valorCompra * 0.10;
			 
			 valorFinal = valorCompra - desconto;
			 
			 System.out.println("Deconto de 10% aplicado na sua compra!!");
		 } else {
			 valorFinal = valorCompra;
			 System.out.println("Compras abaixo de R$ 100,00 não possuem desconto");
		 } 
	        System.out.println("O valor final da sua compra com o cupom aplicado é de: R$ " + valorFinal); 
		 
	        sc.close();
	}

}
