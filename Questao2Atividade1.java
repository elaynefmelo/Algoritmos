package avaliacao;

import java.util.Scanner;

public class Questao2Atividade1 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		float peso = 0;
		float altura = 0;
		float imc;
		System.out.println("Insira o seu peso: ");
		peso = entrada.nextFloat();
		System.out.println("Insira a sua altura: ");
		altura = entrada.nextFloat();
		imc = peso/(altura*altura);
		System.out.println("O seu IMC é: "+imc);
		
	}

}
