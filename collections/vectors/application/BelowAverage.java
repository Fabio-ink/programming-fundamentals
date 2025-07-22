package collections.vectors.application;

import java.util.Scanner;

public class BelowAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos terá o vetor: ");
        Integer n = sc.nextInt();

        Double[] vect = new Double[n];
        for (int i=0; i<vect.length; i++){
            System.out.print("Digite o " + (i + 1) + "a elemento: ");
            vect[i] = sc.nextDouble();
        }

        Double sum = 0.0;
        for (int i=0; i<vect.length; i++){
            sum += vect[i];
        }

        Double avg = sum / vect.length;
        System.out.printf("Média do vetor: %.2f%n", avg);

        for (int i=0; i<vect.length; i++){
            if (vect[i] < avg){
                System.out.println(vect[i]);
            }
        }

        sc.close();
    }

}
