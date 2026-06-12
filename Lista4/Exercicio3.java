import java.util.Scanner; 

public class Exercicio3 {

	public static void main(String[] args) {
		// Maior e menor valor
        Scanner sc = new Scanner(System.in); 
        
        int[] numeros = new int [8];
        
        System.out.println("Digite 8 numeros: ");
        	for (int i = 0; i < 8; i++) {
        		numeros[i] =  sc.nextInt();
        	}
        	
        	int maior = numeros[0];
        	int menor = numeros[0];

        	for (int i = 1; i < 8; i++) {
        		if (numeros[i] > maior) maior = numeros[i];
        		if (numeros[i] < menor) menor = numeros[i];
        	}
        	
        	System.out.println("Maior valor: " + maior);
        	System.out.println("Menor valor: " + menor);

        	sc.close();
	}

}
