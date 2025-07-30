package oop.orders.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import oop.orders.entities.Client;
import oop.orders.entities.enums.OrderStatus;

public class Program {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("-----Informe os dados do cliente-----");
        System.out.print("nome: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Data de nascimento (DD/MM/YYYY): ");
        Date birthDate = sdf.parse(sc.nextLine());
        Client client = new Client(name, email, birthDate);
        System.out.println();
        System.out.println("-----Informe os dados do pedido-----");
        System.out.print("Qual o status do pedido: ");
        String status = sc.nextLine();
        System.out.print("Quantos produtos diferentes teram neste pedido: ");
        Integer n = sc.nextInt();
        sc.nextLine();

        String nameProduct;
        for(int i =0; i < n; i++){
            System.out.println("-----Dados do #" + (i + 1) + " produto-----");
            System.out.print("Nome do produto: ");
            nameProduct = sc.nextLine();

        }

        System.out.println(client);

        sc.close();
    }
}
