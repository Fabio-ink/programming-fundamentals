package ConditionalStructure;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        if (number % 2 == 0) {
            System.out.printf("Seu número %s é par \n", number);
        } else {
            System.out.printf("Seu número %s é impar \n", number);
        }
        sc.close();
    }

}
