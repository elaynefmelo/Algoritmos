package avaliacao;

import java.util.Scanner;

public class Questão3Atividade1 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		float base_maior = 0;
		float base_menor = 0;
		float altura = 0;
		float area;
		System.out.println("Digite o valor da base maior:");
		base_maior = entrada.nextFloat();
		System.out.println("Digite o valor da base menor:");
		base_menor = entrada.nextFloat();
		System.out.println("Digite o valor da altura:");
		altura = entrada.nextFloat();
		area = (base_maior + base_menor)*altura/2;
		System.out.println("A área do trapézio em é " + area +" cm²");
		
	}

}
