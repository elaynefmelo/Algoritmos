package avaliacao;

import java.util.Random;

public class Questao7Atividade2 {
	public static void main(String[] arg) {
		Random aleatorio = new Random();
		int[] array = new int[100];
		int maior = 0;
		int menor = 0;
		
		System.out.println("ARRAY GERADO");
		///array com numeros aleatorios
		for(int i=0; i< array.length; i++) {
			array[i] = aleatorio.nextInt(300);
			System.out.print(array[i]+"|");
		}
		for(int i=0; i<array.length; i++) {
			if(array[i]>maior){
				maior = array[i];
			}
			if(array[i]<menor){
				menor = array[i];	
			}
		}
		System.out.println("\nO maior número é "+maior+"\nO menor número é "+menor);
		
	}

}
