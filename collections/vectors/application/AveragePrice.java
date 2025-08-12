package collections.vectors.application;

import java.util.Scanner;

import collections.vectors.entities.Products;

public class AveragePrice {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Digite o número de produtos: ");
    int n = sc.nextInt();

    Products[] vect = new Products[n];
    for (int i=0; i<vect.length; i++){
        System.out.print("Qual o nome do produto: ");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.print("Qual o preço deste produto: ");
        double price = sc.nextDouble();
        vect[i] = new Products(name, price);
    }

    Double sum = 0.0;
    for (int i=0; i<vect.length; i++){
        sum += vect[i].getPrice();
    }

    Double avg = sum / vect.length;

    System.out.printf("Preço médio: %.2f%n", avg);

        
    sc.close();
        
    }
}