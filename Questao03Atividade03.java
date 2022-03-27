package atividade03bonus;

public class Questao03Atividade03 {

	public static void main(String[] args) {
		int[][] matrizA = {{3,4,5,},{5,6,1}};
		int[][] matrizB = {{10,1,},{3,5},{0,21}};
		int[][] multi = new int [2][2];
		int i = 0;
		int j = 0; 
		int k = 0;
		
		System.out.println("MATRIZ A\n");
		for(i=0; i<matrizA.length; i++) {
			for(j=0; j<matrizA[i].length; j++) {
				System.out.print(matrizA[i][j] + " | ");
			}
			System.out.println();
		}

		System.out.println("\nMATRIZ B\n");
		for(i=0; i<matrizB.length; i++) {
			for(k=0; k<matrizB[i].length; k++) {
				System.out.print(matrizB[i][k] + " | ");
			}
			System.out.println();
		}
		
	
		if(matrizA.length == matrizB[0].length) {
			System.out.println("\nMULTIPLICAÇÃO DAS MATRIZES A E B\n");
			for(i=0; i<multi.length; i++) {
				for(j=0; j<matrizA.length; j++) {
					for(k=0; k<matrizB.length; k++) {
						multi[i][j] += matrizA[i][k] * matrizB[k][j];	
					}
					System.out.print(multi[i][j] + " | ");
			}
			System.out.println();
			}
		}
		else {
			System.out.println("A QUANTIDADE DE ELEMENTOS NA COLUNA DA MATRIZ A É DIFERENTE DA QUANTIDADE DE LINHAS DA MATRIZ B, LOGO ELAS NÃO PODEM SER MULTIPLICADAS.");
		}
		
	}
}
