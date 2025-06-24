package repetitionStructure;

import java.util.Scanner;

public class CorrectPassword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int password = 2201;
        System.out.println("Digite a sua senha:");
        int x = sc.nextInt();

        while (x != password) {
            System.out.println("Senha incorreta");
            System.out.println("Digite outra senha:");
            x = sc.nextInt();
        }
        System.out.println("Acesso permitido");
        sc.close();
    }

}
