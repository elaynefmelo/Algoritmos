package avaliacao;

import java.util.Scanner;

public class Questao1Atividade1 {
	public static void main(String[] args){
		Scanner entrada = new Scanner (System.in);
		int num_inteiro;
		long num_long;
		float num_float;
		System.out.println("Digite um n�mero inteiro:");
		num_inteiro = entrada.nextInt();
		System.out.println("Digite um n�mero long:");
		num_long = entrada.nextLong();
		System.out.println("Digite um n�mero flutuante:");
		num_float = entrada.nextFloat();
		System.out.printf("O n�mero inteiro � %d, o n�mero long � %d e o n�mero float � %f", num_inteiro,num_long,num_float);
		
		
		
	}

}
