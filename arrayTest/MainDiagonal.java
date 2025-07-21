package arrayTest;

import java.util.Scanner;

public class MainDiagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Supondo uma matriz N x N, qual o valor de N: ");
        int n = sc.nextInt();
        int[][] mat = new int[n][n];

        for (int i = 0; i < mat.length; i++ ){
            for (int j = 0; j < mat[i].length; j++){
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println("Diagonal principal: ");
        for (int i = 0; i < mat.length; i++){
            System.out.print(mat[i][i] + " ");
        }
        System.out.println();
        

        int count = 0;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < mat[i].length; j++){
                if (mat[i][j] < 0){
                    count++;
                }
            }
        }

        System.out.print("Número de negativos: " + count);
        System.out.println();

        sc.close();
    }

}
