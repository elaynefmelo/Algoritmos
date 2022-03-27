package atividade03bonus;

public class Questao02Atividade03 {

	public static void main(String[] args) {
		int[][] matrizA = {{3,4,5},{5,6,1},{7,8,2}};
		int[][] matrizB = {{10,1,2},{3,5,9},{0,21,15}};
		int [][] subtracao = new int [matrizA.length][matrizA.length];
		
		System.out.println("MATRIZ A\n");
		for(int i=0; i<matrizA.length; i++) {
			for(int j=0; j<matrizA[i].length; j++) {
				System.out.print(matrizA[i][j] + " | ");
			}
			System.out.println();
		}
		System.out.println("\nMATRIZ B\n");
		for(int i=0; i<matrizB.length; i++) {
			for(int j=0; j<matrizB[i].length; j++) {
				System.out.print(matrizB[i][j] + " | ");
			}
			System.out.println();	
		}
		if(matrizA.length == matrizB.length) {
			System.out.println("\nSUBTRAÇÃO DAS MATRIZES A E B\n");
			for(int i=0; i<matrizA.length; i++) {
				for(int j=0; j<matrizA[i].length; j++) {
					subtracao [i][j] = matrizA[i][j] - matrizB[i][j];
					System.out.print(subtracao[i][j]+" | ");	
				}
				System.out.println();
			}
		}
		else {
			System.out.println("\nAS MATRIZES NÃO POSSUEM A MESMA DIMENSÃO, LOGO NÃO PODEM SER SUBTRAÍDAS.");
		}
		
		
		
	}

}
