package RepetitionStructure;

import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char response;
        do {
            System.out.println("Quantos graus estão? (Celsius)");
            Double c = sc.nextDouble();
            Double f = (9 * c) / 5 + 32;
            System.out.printf("A temperatura em questão em Fahrenheit é: %.1f%n", f);
            System.out.println("Se repetir (s/n)?");
            response = sc.next().charAt(0);
        } while (response != 'n');
        

        sc.close();
    }

}
