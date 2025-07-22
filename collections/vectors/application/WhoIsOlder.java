package collections.vectors.application;

import java.util.Scanner;

import collections.vectors.entities.Person;

public class WhoIsOlder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas você irá digitar: ");
        Integer n = sc.nextInt();
        System.out.println();

        Person[] vect = new Person[n];
        for (int i=0; i<vect.length; i++){
            System.out.println("---Dados da " + (i + 1) + "a pessoa---");
            System.out.print("Qual o nome desta pessoa: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Quantos anos ela tem: ");
            int age = sc.nextInt();
            vect[i] = new Person(name, age);
        }

        int older = vect[0].getAge();
	    int olderIndex= 0;

	    for (int i=1; i<n; i++) {
	        if (vect[i].getAge() > older) {
	            older = vect[i].getAge();
	            olderIndex = i;
	        }
        }

        System.out.println("Pessoa mais velha: " + vect[olderIndex].getName());

        sc.close();
    }

}
