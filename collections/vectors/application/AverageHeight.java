package collections.vectors.application;

import java.util.Scanner;

public class AverageHeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o tamanho do array: ");
        int n = sc.nextInt();
        System.out.println("Criando array...");

        Double[] vect = new Double[n];
        for (int i=0; i<n; i++) {
            System.out.print("Digite uma altura: ");
            vect[i] = sc.nextDouble();
        }

        Double sum = 0.0;
        for (int i=0; i<n; i++){
            sum += vect[i];
        }

        Double avg = sum / n;

        System.out.printf("Altura média: %.2f%n", avg);

        sc.close();
    }
}
