package vectorTest.application;

import java.util.Scanner;

public class AverageOfEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos terá o vetor: ");
        Integer n = sc.nextInt();

        Double[] vect = new Double[n];
        for (int i=0; i<vect.length; i++){
            System.out.print("Digite o " + (i + 1) + "a elemento: ");
            vect[i] = sc.nextDouble();
        }

        int isEven = 0;
        Double sumEven = 0.0;
        for (int i=0; i<vect.length; i++){
            if (vect[i] % 2 == 0){
                isEven += 1;
                sumEven += vect[i];
            }
        }

        Double avgEven = sumEven / isEven;
        
        System.out.println();
        if (isEven == 0){
            System.out.println("Nenhum número par foi digitado.");
        } else{
            System.out.printf("Media dos números pares: %.2f%n", avgEven);
        }

        sc.close();
    }
}
