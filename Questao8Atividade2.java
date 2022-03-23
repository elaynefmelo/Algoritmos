package avaliacao;

import java.util.Random;

public class Questao8Atividade2 {
	public static void main (String[] args) {
		Random aleatorio = new Random();
		int[] array = new int[100];
		float soma = 0f;
		
		System.out.println("ARRAY GERADO");
		
		///array com numeros aleatorios
		for(int i=0; i< array.length; i++) {
			array[i] = aleatorio.nextInt(300);
			System.out.print(array[i]+"|");
		}
		for(int i = 0; i < array.length; i++){
			soma += array[i];	
		}
		System.out.println("\nO cálculo da média aritmetica é "+soma/100);
		
	}

}
