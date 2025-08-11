package oop.polymorphism.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import oop.polymorphism.entities.ImportedProduct;
import oop.polymorphism.entities.Product;
import oop.polymorphism.entities.UsedProduct;

public class ProductPriceTags {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        List<Product> order = new ArrayList<>();

        System.out.println();
        System.out.print("Digite a quantidade de produtos: ");
        int n = sc.nextInt(); sc.nextLine();

        for (int i = 0; i < n; i++){
            System.out.println("-----Dados do produto #" + (i + 1) + "-----");
            System.out.print("O seu produto se enquadra em qual das categorias abaixo:\n 1- Usado\n 2- Comum\n 3- Importado\n Sua opção (Selecione digitando o número): ");
            int opt = sc.nextInt(); sc.nextLine();
            System.out.print("Nome: ");
            String name = sc.nextLine();
            System.out.print("Preço: ");
            Double price = sc.nextDouble(); sc.nextLine();
            switch (opt) {
                case 1 -> {
                    System.out.print("Data de fabricação (dd/mm/yyyy): ");
                    Date manufactoredDate = sdf.parse(sc.nextLine());
                    order.add(new UsedProduct(name, price, manufactoredDate));
                }
                case 2 -> {
                    order.add(new Product(name, price));
                }
                case 3 -> {
                    System.out.print("Taxa de importação: ");
                    Double customFee = sc.nextDouble(); sc.nextLine();
                    order.add(new ImportedProduct(name, price, customFee));
                }
            }
            System.out.println();
            System.out.println("-----Etiquetas de preço-----");
            for(Product p : order){
                System.out.println(p);
            }
        }

        sc.close();
    }

}
