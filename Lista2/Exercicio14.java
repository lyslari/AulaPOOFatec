import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		// Tipo de triângulo
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o lado A: ");
		double ladoA = sc.nextDouble();
		
		System.out.println("Digite o lado B: ");
		double ladoB = sc.nextDouble();
		
		System.out.println("Digite o lado C: ");
		double ladoC = sc.nextDouble();
		
		if ((ladoA + ladoB > ladoC) && (ladoA + ladoC > ladoB) && (ladoB + ladoC > ladoA)) {
			System.out.println("Triangulo  Equilátero");
			
		} else if (ladoA == ladoB || ladoA == ladoC || ladoB == ladoC) {
			System.out.println("Triângulo Isósceles");
		} else {
			System.out.println("Triângulo Escaleno");
		}
		
		sc.close();
	}

}
