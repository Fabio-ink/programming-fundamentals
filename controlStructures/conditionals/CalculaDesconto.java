package controlStructures.conditionals;

import java.util.Scanner;

//Expressão ternária (Sintaxe: (Condição) ? Valor_se_VErdadeiro : Valor_se_Falso)

public class CalculaDesconto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Double preco = sc.nextDouble();
        Double desconto = (preco <= 20.0) ? preco * 0.1 : preco * 0.05;

        System.out.printf("Devido ao valor do seu produto ser de R$ %.2f, o desconto aplicado é de R$ %.2f%n", preco, desconto);
        sc.close();
    }
}
