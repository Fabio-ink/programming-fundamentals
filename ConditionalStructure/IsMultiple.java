package ConditionalStructure;

import java.util.Scanner;

public class IsMultiple {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a % b == 0 || b % a == 0){
            System.out.printf("Os números %s e %s são multiplos \n", a, b);
        } else {
            System.out.printf(" Os números %s e %s não são multiplos \n", a, b);
        }
        sc.close();
    }

}
