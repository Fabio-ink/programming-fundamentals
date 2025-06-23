package RepetitionStructure;

import java.util.Scanner;

public class InOut {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos valores serão lidos:");
        int n = sc.nextInt();
        int in = 0;
        int out = 0;

        for (int i = 0; i < n; i++){
            System.out.println("Digite um número:");
            int number = sc.nextInt();
            if (number >= 10 && number <= 20){
                in++;
            } else{
                out++;
            }
        }
        System.out.printf("Dos números que digitou: %s estão dentro%n", in);
        System.out.printf("Dos números que digitou: %s estão fora%n", out);
        sc.close();
    }

}
