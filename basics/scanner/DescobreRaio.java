package basics.scanner;

import java.util.Scanner;

public class DescobreRaio {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite o raio do seu circulo:");
    Double raio = sc.nextDouble();

    Double area = 3.14159 * (raio * raio);

    System.out.printf("A area do seu circulo é: %.4f \n", area);

    sc.close();
}
}