package basics.staticMembers.application;

import java.util.Scanner;

import basics.staticMembers.util.Calculator;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do raio: ");
        Double radius = sc.nextDouble();

        Double c = Calculator.circumference(radius);

        Double v = Calculator.volume(radius);

        System.out.printf("Circumference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI Value: %.2f%n", Calculator.PI);

        sc.close();
    }
}
