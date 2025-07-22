package basics.scanner;
import java.util.Scanner;

public class SalarioFunc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o seu nome?");
        String nome = sc.nextLine();

        System.out.println("Quantas horas você trabalha por mês?");
        Integer horasTrabalhadas = sc.nextInt();

        System.out.println("E quanto vocẽ ganha por cada hora trabalhada?");
        Double salarioHora = sc.nextDouble();

        Double salario = horasTrabalhadas * salarioHora;

        System.out.printf("Prazer %s, você trabalha por %s horas ao mês e ganha %s por cada hora trabalhada, logo seu salário é de: R$ %.2f \n", nome, horasTrabalhadas, salarioHora, salario);

        sc.close();
    }

}
