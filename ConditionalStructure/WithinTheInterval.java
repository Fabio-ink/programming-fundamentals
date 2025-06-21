package ConditionalStructure;

import java.util.Scanner;

public class WithinTheInterval {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Double number = sc.nextDouble();

        if (number > 0 && number <= 25){
            System.out.println("Está no intervalo de (0,25)");
        } else if (number <= 50){
            System.out.println("Está no intervalo de (25,50)");
        } else if (number <= 75){
            System.out.println("Está no intervalo de (50,75)");
        } else if (number <= 100){
            System.out.println("Está no intervalo de (75,100)");
        } else {
            System.out.println("Seu número não se encaixa em nenhum intervalo");
        }
        sc.close();
    }

}
