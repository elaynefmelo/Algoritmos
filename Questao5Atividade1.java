package avaliacao;

import java.util.Scanner;

public class Questao5Atividade1 {
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		int numero;
		
		System.out.println("Digite um n�mero:");
		numero = entrada.nextInt();
		
		if(numero %2 == 0) {
			System.out.println("O n�mero � par");
		}
		else {
			System.out.println("O n�mero � �mpar");
		}
	}

}
