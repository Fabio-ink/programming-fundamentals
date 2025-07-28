package basics.operators.arithmetic.application;

import java.util.Scanner;

import basics.operators.arithmetic.util.operators.Addition;
import basics.operators.arithmetic.util.operators.Division;
import basics.operators.arithmetic.util.operators.Multiplication;
import basics.operators.arithmetic.util.operators.Operation;
import basics.operators.arithmetic.util.operators.Subtraction;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n==== CALCULADORA ====");
            System.out.println("1 - Adição");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            if (opcao >= 1 && opcao <= 4) {
                System.out.print("Digite o primeiro número: ");
                double num1 = sc.nextDouble();
                System.out.print("Digite o segundo número: ");
                double num2 = sc.nextDouble();

                Operation op;

                switch (opcao) {
                    case 1 -> op = new Addition();
                    case 2 -> op = new Subtraction();
                    case 3 -> op = new Multiplication();
                    case 4 -> op = new Division();
                    default -> throw new IllegalStateException("Opção inválida.");
                }

                try {
                    double resultado = op.calculate(num1, num2);
                    System.out.println("Resultado: " + resultado);
                } catch (ArithmeticException e) {
                    System.out.println("Erro: " + e.getMessage());
                }

            } else if (opcao != 0) {
                System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 0);

        System.out.println("Calculadora encerrada.");
        sc.close();
    }
}