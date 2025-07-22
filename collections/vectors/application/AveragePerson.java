package collections.vectors.application;

import java.util.Scanner;

import collections.vectors.entities.Person;

public class AveragePerson {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("quantas pessoas você irá informar: ");
        Integer n = sc.nextInt();

        Person[] vect = new Person[n];
        for (int i=0; i<vect.length; i++){
            System.out.println("Dados da " + (i + 1) + "a pessoa:");
            System.out.print("Qual o nome desta pessoa: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Quantos anos esta pessoa tem: ");
            Integer age = sc.nextInt();
            System.out.print("Qual a altura desta pessoa: ");
            Double height = sc.nextDouble();
            vect[i] = new Person(name, height, age);
        }
        Double sumHeight = 0.0;
        for (int i=0; i < vect.length; i++){
            sumHeight += vect[i].getHeight();
        }
        Double avgHeight = sumHeight / vect.length;
        System.out.printf("Altura média: %.2f%n", avgHeight);

        int countUnder16 = 0;
        for (int i = 0; i < vect.length; i++) {
            if (vect[i].getAge() < 16) {
            countUnder16++;
            }
        }
    double percentAge = ((double) countUnder16 / vect.length) * 100;
    System.out.printf("Pessoas com menos de 16 anos: %.2f%%%n", percentAge);

        for (int i=0; i<vect.length; i++){
            if (vect[i].getAge() < 16){
                System.out.println(vect[i].getName());
            }
        }
        
        sc.close();
    }

}
