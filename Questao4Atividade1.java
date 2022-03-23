package avaliacao;

import java.util.Scanner;

public class Questao4Atividade1 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int primeiro;
		int segundo;
		
		System.out.println("Digite o primeiro número:");
		primeiro = entrada.nextInt();
		System.out.println("Digite o segundo número:");
		segundo = entrada.nextInt();
		if (primeiro > segundo) {
			System.out.println("O primeiro número é maior");	
		}
		else if(primeiro < segundo) {
			System.out.println("O segundo número é maior");
		}
		else {
			System.out.println("Os números são iguais");
		}	
	}
}
