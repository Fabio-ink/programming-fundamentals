package controlStructures.conditionals;

import java.util.Scanner;

public class IsNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        if (number > 0) {
            System.out.printf("O número %s é Positivo \n", number);
        } else {
            System.out.printf("O número %s é Negativo \n", number);
        }
        sc.close();
    }
    
}

