package oop.polymorphism.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import oop.polymorphism.entities.Employee;
import oop.polymorphism.entities.OutsourceEmployee;

public class IncomeCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Employee> employees = new ArrayList<>();

        System.out.print("Digite o número de empregados que serão cadastrados: ");
        int n = sc.nextInt(); sc.nextLine();

        for (int i = 0; i < n; i++){
            System.out.println();
            System.out.println("-----Dados do #" + (i + 1) + " funcionário-----");
            System.out.print("O empregado é terceirizado (s/n): ");
            char isOutsource = sc.nextLine().charAt(0);
            System.out.print("Nome: ");
            String name = sc.nextLine();
            System.out.print("Horas trabalhadas: ");
            Double hours = sc.nextDouble();sc.nextLine();
            System.out.print("Valor por hora trabalhada: ");
            Double valuePerHour = sc.nextDouble();sc.nextLine();
            if (isOutsource == 's' || isOutsource == 'S'){
                System.out.print("Valor adicional: ");
                Double addicionalCharge = sc.nextDouble();sc.nextLine();
                Employee OutsourceEmployee = new OutsourceEmployee(name, hours, valuePerHour, addicionalCharge);
                employees.add(OutsourceEmployee);
                //employees.add(new OutsourceEmployee(name, hours, valuePerHour, addicionalCharge)); Possivel fazer desta forma também.
            } else if (isOutsource == 'n' || isOutsource == 'N'){
                Employee employee = new Employee(name, hours, valuePerHour);
                employees.add(employee);
            }
        }

        System.out.println();
        System.out.println("-----Pagamentos-----");
        for(Employee e : employees){
            System.out.println(e);
        }

        sc.close();
    }

}
