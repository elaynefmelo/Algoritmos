package avaliacao;

import java.util.Scanner;

public class Questao1Atividade1 {
	public static void main(String[] args){
		Scanner entrada = new Scanner (System.in);
		int num_inteiro;
		long num_long;
		float num_float;
		System.out.println("Digite um número inteiro:");
		num_inteiro = entrada.nextInt();
		System.out.println("Digite um número long:");
		num_long = entrada.nextLong();
		System.out.println("Digite um número flutuante:");
		num_float = entrada.nextFloat();
		System.out.printf("O número inteiro é %d, o número long é %d e o número float é %f", num_inteiro,num_long,num_float);
		
		
		
	}

}
