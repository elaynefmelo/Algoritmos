package avaliacao;

import java.util.Random;

public class Questao5Atividade2 {
	public static void main(String[] args) {
		Random aleatorio = new Random();
		int[] array = new int[100];
		System.out.println("ARRAY GERADO");
		
		//Array com numeros aleatorios
		for(int i=0; i< array.length; i++) {
			array[i] = aleatorio.nextInt(300);
			System.out.print(array[i]+"|");
		}
		//Array de números impares
		System.out.println("\nNUMEROS íMPARES DO ARRAY");
		for(int i=0;i < array.length; i++) {
			if(array[i]%2 != 0) {
				System.out.print(array[i]+"|");
			}
		}
	}

}
