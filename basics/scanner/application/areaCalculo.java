package basics.scanner.application;
import java.util.Scanner;

public class areaCalculo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número (A):");
        Double a = sc.nextDouble();

        System.out.println("Digite o segundo número (B):");
        Double b = sc.nextDouble();

        System.out.println("Digite o terceito número (C):");
        Double c = sc.nextDouble();

        Double areaTriangulo = (a * c) / 2;
        Double areaCirculo = 3.14159 * (c * c);
        Double areaTrapezio = ((a + b) * c) / 2;
        Double areaQuadrado = b * b;
        Double areaRetangulo = a * b;

        System.out.println("Baseado nos números informados é possivel definir:");
        System.out.printf("A area de um triangulo, sendo A pela base e C pela altura: %.3f \n", areaTriangulo);
        System.out.printf("A area de um circulo, sendo C o valor do raio: %.3f \n", areaCirculo);
        System.out.printf("A area de um trapézio, sendo A e B pela base e C pela altura: %.3f \n", areaTrapezio);
        System.out.printf("A area de um quadrado, sendo B como valor dos lados: %.3f \n", areaQuadrado);
        System.out.printf("A area de um retangulo, sendo A e B os valores dos lados: %.3f \n", areaRetangulo);

        sc.close();
    }

}
