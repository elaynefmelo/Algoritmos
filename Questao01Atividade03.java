package atividade03bonus;

public class Questao01Atividade03 {

	public static void main(String[] args) {
		int[][] matrizA = {{3,4,},{5,6},{7,8}};
		int[][] matrizB = {{10,1},{3,5},{0,21}};
		int [][] soma = new int [matrizA.length][matrizA.length];
		
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
			System.out.println("\nSOMA DAS MATRIZES A E B\n");
			for(int i=0; i<matrizA.length; i++) {
				for(int j=0; j<matrizA[i].length; j++) {
					soma [i][j] = matrizA[i][j] + matrizB[i][j];
					System.out.print(soma[i][j]+" | ");	
				}
				System.out.println();
			}
		}
		else {
			System.out.println("\nAS MATRIZES N�O POSSUEM A MESMA DIMENS�O, LOGO N�O PODEM SER SOMADAS.");
		}
		
	}

}
