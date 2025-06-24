package conditionalStructure;

import java.util.Scanner;

//Faixa salarial	        Alíquota	     Cálculo aplicado sobre a parte excedente
//Até R$ 2000,00	         Isento	         Não paga nada
//De R$ 2000,01 a 3000,00	 8%	             Paga 8% sobre o que passar de 2000
//De R$ 3000,01 a 4500,00	 18%	         Paga 18% sobre o que passar de 3000
//Acima de R$ 4500,00	     28%	         Paga 28% sobre o que passar de 4500

public class Taxalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Double salario = sc.nextDouble();

        Double tax;

        if (salario > 0 && salario <= 2000){
            System.out.println("Você é isento de imposto");
        } else if (salario <= 3000){
            tax = (salario - 2000.0) * 0.08;
            System.out.printf("Vocẽ precisa pagar %.2f de imposto \n", tax);
        } else if (salario <= 4500){
            tax = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;
            System.out.printf("Você precisa pagar %.2f de imposto \n", tax);
        } else {
            tax = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
            System.out.printf("Você precisa pagar %.2f de imposto \n", tax);
        }
        sc.close();
    }

}
