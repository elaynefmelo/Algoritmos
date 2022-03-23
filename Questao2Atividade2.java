package avaliacao;

import java.util.Scanner;

public class Questao2Atividade2 {
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		int[] numero = new int [10];
		int[] inverso = new int[numero.length];
		
		//Recebendo dados do usuario
		for(int i = 0; i<10; i++) {
			System.out.println("Insira um numero inteiro:");
			numero[i] = entrada.nextInt();
			}
		System.out.println("\nARRAY INVERTIDO");
		//Invertendo o array
		for(int i = 0; i < numero.length; i++){
			inverso[i] = numero[(numero.length-i)-1];
			System.out.print(inverso[i]+" ");
		}	
	}
}
