package collections.vectors.application;

import java.util.Scanner;

import collections.vectors.entities.Rent;

public class BookingService {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Rent[] vect = new Rent[10];

        System.out.print("Quantos quartos serão alugados: ");
        Integer n = sc.nextInt();
        
        for (int i=0; i < n; i++){
            System.out.println();
            System.out.println("Rent #" + (i + 1) + ":");
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.next();
            System.out.print("Qual o número do quarto que deseja reservar (Quartos de 0 à 9): ");
            Integer roomNumber = sc.nextInt();
            vect[roomNumber] = new Rent(name, email);
        }
        System.out.println();
        System.out.println("Quartos reservados: ");
        for (int i =0; i < vect.length; i++){
            if (vect[i] != null){
                System.out.println("Quarto número " + i + " - " + vect[i]);
            }
        }
        

        sc.close();
    }
}
