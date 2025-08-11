package oop.abstraction.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import oop.abstraction.entities.Circle;
import oop.abstraction.entities.Color;
import oop.abstraction.entities.Rectangle;
import oop.abstraction.entities.Shape;

public class AreaCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Shape> shapes = new ArrayList<>();

        System.out.print("Digite a quantidade de formas que serão informadas: ");
        int n = sc.nextInt(); sc.nextLine();

        for (int i = 0; i < n; i++){
            System.out.println("-----Dados da forma #" + (i + 1) + "-----");
            System.out.print("Sua forma é um Circulo ou um Retângulo (c/r): ");
            char tip = sc.nextLine().charAt(0);
            if(tip == 'c' || tip == 'C'){
                System.out.print("Qual a cor do seu circulo (Black, Blue, Red): ");
                String color = sc.nextLine();
                System.out.print("Raio de: ");
                Double radius = sc.nextDouble(); sc.nextLine();
                shapes.add(new Circle(Color.valueOf(color.toUpperCase()), radius));
            } else if (tip == 'r' || tip == 'R'){
                System.out.print("Qual a cor do seu retângulo (Black, Blue, Red): ");
                String color = sc.nextLine();
                System.out.print("Largura: ");
                Double width = sc.nextDouble(); sc.nextLine();
                System.out.print("Altura: ");
                Double height = sc.nextDouble(); sc.nextLine();
                shapes.add(new Rectangle(Color.valueOf(color.toUpperCase()), width, height));
            }
        }

        System.out.println("-----Valor da area das formas-----");
        for (Shape sp : shapes){
            System.out.println(String.format("%.2f", sp.getArea()));
        }

        sc.close();
    }

}
