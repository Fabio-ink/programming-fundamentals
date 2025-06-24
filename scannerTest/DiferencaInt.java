package scannerTest;

import java.util.Scanner;

public class DiferencaInt {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o Primeiro número inteiro (A):");
        Integer a = sc.nextInt();

        System.out.println("Digite o Segundo número inteiro (B):");
        Integer b = sc.nextInt();

        System.out.println("Digite o Terceiro número inteiro (C):");
        Integer c = sc.nextInt();

        System.out.println("Digite o Quarto número inteiro (D):");
        Integer d = sc.nextInt();

        Integer difere = (a * b - c * d);
        System.out.printf("A diferença de (A x B - C x D) é igual á %s \n", difere);

        sc.close();
    }
}
