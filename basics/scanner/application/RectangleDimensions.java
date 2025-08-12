package basics.scanner.application;

import java.util.Scanner;

import basics.scanner.entities.Rectangle;

public class RectangleDimensions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Rectangle rectangle = new Rectangle();

        System.out.println("Digite as medidas do retângulo: ");
        System.out.print("Largura: ");
        rectangle.largura = sc.nextDouble();
        System.out.print("Altura: ");
        rectangle.altura = sc.nextDouble();

        Double area = rectangle.Area();
        Double perimetro = rectangle.Perimetro();
        Double diagonal = rectangle.Diagonal();

        System.out.printf("As medidas deste retângulo são: %n Area: %.2f%n Perimetro: %.2f%n Diagonal: %.2f%n ", area, perimetro, diagonal);

        sc.close();
    }

}
