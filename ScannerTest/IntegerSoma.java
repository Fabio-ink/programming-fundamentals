package ScannerTest;
import java.util.Scanner;

public class IntegerSoma {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Digite um número:");
    Integer n1 = sc.nextInt();

    System.out.println("Digite um segundo número:");
    Integer n2 = sc.nextInt();

    Integer soma = n1 + n2;

    System.out.printf("SOMA = %s \n", soma);

    sc.close();

  }
}