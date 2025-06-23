package RepetitionStructure;

import java.util.Scanner;

public class RepeatXNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de números que deseja somar:");
        int N = sc.nextInt();
        int soma = 0;

        for(int i = 0; i < N; i++){
            int x = sc.nextInt();
            soma = soma + x;
        }
        System.out.printf("A soma dos números que colocou é: %s%n",soma);
        sc.close();
    }

}
