package listTest.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import listTest.entities.Employees;

public class BoostSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Employees> list = new ArrayList<Employees>();

        System.out.print("Quantos funcionários serão registrados: ");
        int n = sc.nextInt();

        for (int i=0; i < n; i++){
            System.out.println("----- Informações do empregado número " + (i + 1) + " -----");
            System.out.print("Qual o ID do funcionário: ");
            Integer id = sc.nextInt();
            while (hasId(list, id)) {
				System.out.print("Id já existente, tente novamente: ");
				id = sc.nextInt();
			}
            sc.nextLine();
            System.out.print("Qual o nome do funcionário: ");
            String name = sc.nextLine();
            System.out.print("Quanto será o salário deste funcionário: ");
            Double wave = sc.nextDouble();
            Employees emp = new Employees(id, name, wave);
            list.add(emp);
            System.out.println();
        }

        System.out.print("Digite o ID do funcionário cujo terá um aumento no salário: ");
        int idWave = sc.nextInt();
        Employees emp = list.stream().filter(x -> x.getId() == idWave).findFirst().orElse(null);
        if (emp == null){
            System.out.println("Id digitado não existe");
        } else {
            System.out.print("Digite a percentagem do aumento: ");
            Double percent = sc.nextDouble();
            emp.IncomeUp(percent);
        }


        System.out.println("-----Lista dos funcionários-----");
        for (Employees x : list){
            System.out.println(x);
        }
    

        sc.close();
    }

    public static boolean hasId(List<Employees> list, int id) {
		Employees emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}

}
