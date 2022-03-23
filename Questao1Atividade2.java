package avaliacao;

import java.util.Scanner;

public class Questao1Atividade2 {
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		float[] notas = new float[5];
		float soma = 0f;
		float media; 
		
		//Recebendo dados do usuario
		for(int i=0; i<5; i++) {
			System.out.println("Insira a nota:");
			notas[i] = entrada.nextFloat();
		}
		//Somando as notas do array
		for(int i = 0; i<notas.length; i++) {
			soma += notas[i];
		}
		System.out.println("A soma das notas é "+soma);
		media = soma/5;
		System.out.println("A média aritmetica é "+media);
		
	}

}
