package avaliacao;

import java.util.Scanner;

public class Questao4Atividade1 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int primeiro;
		int segundo;
		
		System.out.println("Digite o primeiro n�mero:");
		primeiro = entrada.nextInt();
		System.out.println("Digite o segundo n�mero:");
		segundo = entrada.nextInt();
		if (primeiro > segundo) {
			System.out.println("O primeiro n�mero � maior");	
		}
		else if(primeiro < segundo) {
			System.out.println("O segundo n�mero � maior");
		}
		else {
			System.out.println("Os n�meros s�o iguais");
		}	
	}
}
