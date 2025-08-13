package oop.composition.worker.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import oop.composition.worker.entities.Department;
import oop.composition.worker.entities.HourContract;
import oop.composition.worker.entities.Worker;
import oop.composition.worker.entities.enums.WorkerLevel;

public class Program {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("A qual departamento você faz parte: ");
        String dep = sc.nextLine();
        System.out.println("-----Digite as informações do trabalhador-----");
        System.out.print("Nome: ");
        String workerName = sc.nextLine();
        System.out.print("Level: ");
        String workerLevel = sc.nextLine();
        System.out.print("Salário base: ");
        Double baseSalary = sc.nextDouble();
        sc.nextLine();
        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel.toUpperCase()), baseSalary, new Department(dep));
        System.out.print("Quantos contratos tem este trabalhador: ");
        Integer n = sc.nextInt();
        sc.nextLine();

        for (int i=0; i<n; i++){
            System.out.println("-----Digite os dados do #" + (i + 1) + " Contrato-----");
            System.out.print("Data (DD/MM/YYYY): ");
            Date contractDate = sdf.parse(sc.next());
            System.out.print("Valor por hora: ");
            Double valuePerHour = sc.nextDouble();
            sc.nextLine();
            System.out.print("Duração (Em horas): ");
            Double hour = sc.nextDouble();
            sc.nextLine();
            HourContract contract = new HourContract(contractDate, valuePerHour, hour);
            worker.addContract(contract);
        }

        System.out.println("---------------");
        System.out.print("Digite o mês e ano que deseja calcular o salário (MM/YYYY): ");
        String monthAndYear = sc.next();
        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));

        System.out.println("Nome: " + worker.getName());
        System.out.println("Departamento: " + worker.getDepartament().getName());
        System.out.println("Sário correspondente à " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));

        sc.close();
    }

}
