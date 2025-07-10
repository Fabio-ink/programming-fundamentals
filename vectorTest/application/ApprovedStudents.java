package vectorTest.application;

import java.util.Scanner;

import vectorTest.entities.Students;

public class ApprovedStudents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas alunos você irá digitar: ");
        Integer n = sc.nextInt();
        System.out.println();

        Students[] vect = new Students[n];
        for (int i=0; i<vect.length; i++){
            System.out.println("---Dados do " + (i + 1) + "a aluno---");
            System.out.print("Qual o nome do aluno: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Quanto ele tirou na primeira prova: ");
            Double grade1 = sc.nextDouble();
            System.out.print("Quanto ele tirou na segunda prova: ");
            Double grade2 = sc.nextDouble();
            vect[i] = new Students(name, grade1, grade2);
        }
        System.out.println("---Alunos aprovados---");
        for (int i = 0; i < vect.length; i++){
            if (((vect[i].getGrade1() + vect[i].getGrade2()) / 2) >= 7){
                System.out.println(vect[i].getName());
            }
        }


        sc.close();
    }
}
