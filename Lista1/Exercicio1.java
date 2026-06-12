package lista1;

public class Exercicio1 {

	public static void main(String[] args) {
		//exercicio 1 nome e idade
		
		String name= "João";
		int idade= 20;
		
		System.out.println("Meu nome é " + name + " e tenho " + idade + " anos.");



// exercicio 2

	int i = 7;
	int y= 8;
	System.out.println("Resultado da soma é: " + (i+y));

	
// exercicio 3- declare 3 variáveis e calcule a média	
	double n1= 4.2;
	double n2= 5.6;
	double n3= 6.1;
	
	System.out.println("O resultado da média é:" + + ((n1 + n2 + n3)/ 2));
	
	
// exercicio 4- área de um retangulo

	double largura= 20.0;
	double altura= 10.5;

	System.out.println("A área do retangulo é: " + (largura*altura));	
			
// exercicio 5- Conversão de temperatura

	double celsius= 25;
	double fahrenheit= (celsius * 9/5)+ 32;

	System.out.println("Temperatura em Fahrenheit: " + fahrenheit);

	
// exercicio 6- salário mensal

	double salariohora= 7.37;
	double horastrabalhadas= 200.0;
	double salariomes= 7.37*200;

	System.out.println("O salário total do mês trabalhado é de R$ " + salariomes);		
	
	
// exercicio 7- antecessor e sucessor

	int numero= 10;
	int antecessor= i-1; 		

	System.out.println("O antecessor do número 10 é o numéro " + antecessor);

	int sucessor= i+1;

	System.out.println("O sucessor do número 10 é o numéro " + sucessor);	
	
	
// exercicio 8- Conversão de metros

	int x = 4;
	int centimetros = 100;
	int milimetros = 1000;
	int resultadocent = 4*100;

	System.out.println("4 metros equivale a " + resultadocent + " centimetros");

	int resultadomili = 4*1000;

	System.out.println("4 metros equivale a " + resultadomili + " milimetros");	
	

// exercicio 9- troca de valores- visto na lista de correção

	int a = 5;
	int b= 10;
	int temp= a;
	
	a=b;
	b=temp;

	System.out.println("a = " + a);

	System.out.println("b = " + b);
	
	
// exercicio 10- Cálculo de idade

			int nascimento= 2004;
			int anoatual= 2026;
			int anos= anoatual-nascimento;

			System.out.println("Joana tem " + anos + " anos");	
			
// exercicio 11- // Extra Produto

			String produto= "Livro Orgulho e preconceito";
			double preço = 45.00;
			int quantidade = 3;

			System.out.println("O valor total da compra é de R$ " + (preço*quantidade));			
	}

}	
