package controlStructures.loops;

import java.util.Scanner;

public class GasStationCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int gasolina = 0;
        int alcool = 0;
        int dizel = 0;

        System.out.printf("Bem vindo ao posto de gasolina, você quer abastecer com quais das opções abaixo:%n (Opção 1): Gasolina%n (Opção 2): Alcool%n (Opção 3): Dizel%n (Opção 4): Sair%n");

        int x = sc.nextInt();

        while (x != 4) {
            if (x == 1){
                gasolina += 1;
                x = sc.nextInt();
            } else if (x == 2){
                alcool += 1;
                x = sc.nextInt();
            } else if (x == 3) {
                dizel += 1;
                x = sc.nextInt();
            }
        }
        
        System.out.println("Muito obrigado, volte sempre");
        System.out.printf("Fim do dia:%n Quantidade de vezes que abasteceram com Gasolina: %s%n Quantidade de vezes que abasteceram com Alcool: %s%n Quantidade de vezes que abasteceram com Dizel: %s%n", gasolina, alcool, dizel);
        sc.close();
    }

}
