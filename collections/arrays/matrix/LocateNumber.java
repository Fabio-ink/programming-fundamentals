package collections.arrays.matrix;

import java.util.Scanner;

public class LocateNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Supondo uma matriz de L x C");
        System.out.print("Qual o valor de L (linhas): ");
        int l = sc.nextInt();
        System.out.print("Qual o valor de C (colunas): ");
        int c = sc.nextInt();

        int [][] mat = new int[l][c];
        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat[i].length; j++){
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.print("Qual número está procurando: ");
        int x = sc.nextInt();

        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat[i].length; j++){
                if (mat[i][j] == x){
                    System.out.println();
                   System.out.println("Position " + i + "," + j + ":");
					if (j > 0) {
						System.out.println("Left: " + mat[i][j-1]);
					}
					if (i > 0) {
						System.out.println("Up: " + mat[i-1][j]);
					}
					if (j < mat[i].length-1) {
						System.out.println("Right: " + mat[i][j+1]);
					}
					if (i < mat.length-1) {
						System.out.println("Down: " + mat[i+1][j]);
					}
                    System.out.println();
                    System.out.println("----------");
                }
            }
        }
        

        sc.close();
    }

}
