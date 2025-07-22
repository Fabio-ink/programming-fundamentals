package collections.vectors.application;

import java.util.Scanner;

public class NegativeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você irá digitar: ");
        Integer n = sc.nextInt();

        while (n > 11) {
            System.out.println("==Seu número deve ser positivo e menor ou igual a 10--");
            System.out.print("Quantos números você irá digitar: ");
            n = sc.nextInt();
        }

        Integer[] vect = new Integer[n];
        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um número: ");
            sc.nextLine();
            Integer number = sc.nextInt();
            vect[i] = number;
        }

        System.out.println();
        System.out.println("Números negativos: ");
        for (int i =0; i < vect.length; i++){
            if (vect[i] < 0 ){
                System.out.println(vect[i]);
            }
        }


        sc.close();
    }

}
