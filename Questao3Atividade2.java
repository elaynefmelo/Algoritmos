package avaliacao;

import java.util.Random;

public class Questao3Atividade2 {
	public static void main (String[] args) {
		Random aleatorio = new Random();
		int[] array = new int[100];
		int[] inverso = new int[array.length];
		// preenchendo a array
		System.out.println("ARRAY GERADO");
		for(int i = 0; i < array.length; i++) {
			array[i] = aleatorio.nextInt(300);
			System.out.print(array[i] + "|");
		}
		System.out.println("\nARRAY INVERTIDO");
		for(int i = 0; i < array.length; i++) {
			inverso[i] = array[(array.length-i)-1];
			System.out.print(inverso[i]+"|");
		}
		
			
	}
}
