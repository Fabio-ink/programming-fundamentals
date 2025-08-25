package oop.abstraction.abstractClasses.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import oop.abstraction.abstractClasses.entities.LegalPerson;
import oop.abstraction.abstractClasses.entities.NaturalPerson;
import oop.abstraction.abstractClasses.entities.Person;

public class TaxManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Person> list = new ArrayList<>();

        System.out.print("Digite o numero de individuos pagantes de impostos: ");
        int n = sc.nextInt();sc.nextLine();

        for (int i = 0; i < n; i++){
            System.out.println();
            System.out.println("-----Dados do individuo numero " + (i + 1) + "-----");
            System.out.print("O individuo se enquadra em pessoa fisica ou juridica (f/j): ");
            char response = sc.nextLine().charAt(0);
            System.out.print("Nome: ");
            String name = sc.nextLine();
            System.out.print("Renda anual: ");
            Double yearIncome = sc.nextDouble();sc.nextLine();
            if (response == 'f' || response == 'F'){
                System.out.print("Gastos com saude: ");
                Double healthcareExpenses = sc.nextDouble(); sc.nextLine();
                list.add(new NaturalPerson(name, yearIncome, healthcareExpenses));
            } else if (response == 'j' || response == 'J'){
                System.out.print("Numero de empregados: ");
                int employees = sc.nextInt();sc.nextLine();
                list.add(new LegalPerson(name, yearIncome, employees));
            }else{
                System.out.println();
                System.out.println("ERRO: Opcao invalida");
            }
        }
        Double sumTax = 0.0;
        System.out.println();
        System.out.println("-----Taxas pagas-----");
        for (Person p : list){
            System.out.println(p);
            sumTax += p.taxRates();
        }
        
        System.out.println();
        System.out.println("Total de taxas pagas " + sumTax);

        sc.close();
    }

}
