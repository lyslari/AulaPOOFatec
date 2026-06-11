import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		// Média do aluno
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a primeira nota do aluno Elton: "); 
		double nota1 =  sc.nextDouble();

		System.out.println("Digite a segunda nota do aluno Elton: ");
		double nota2 = sc.nextDouble();

		double media = (nota1 + nota2) / 2; 
		
        System.out.println("Média: " + media); 		
        
        if (media >= 6) {
        	System.out.println("O aluno Elton foi aprovado");
        } else if (media >= 4){
        	System.out.println("O aluno Elton está de recuperação");
        } else {
        	System.out.println("O aluno Elton foi reprovado");
        }
        
        sc.close();
	}

}
