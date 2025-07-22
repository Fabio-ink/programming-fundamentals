package basics.scanner;
import java.util.Scanner;

public class SistemaCompra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //System.out.println("Qual o primeiro produto que irá comprar?");
        //String produto1 = sc.next();

        System.out.println("Qual o valor deste produto?");
        double vlrProduto1 = sc.nextDouble();

        System.out.println("Quantas unidades irá comprar deste produto?");
        Integer qtcProduto1 = sc.nextInt();

        //System.out.println("Qual o Segundo produto que irá comprar?");
        //String produto2 = sc.next();

        System.out.println("Qual o valor deste produto?");
        double vlrProduto2 = sc.nextDouble();

        System.out.println("Quantas unidades irá comprar deste produto?");
        Integer qtcProduto2 = sc.nextInt();

        Double valorFinal = (vlrProduto1 * qtcProduto1 + vlrProduto2 * qtcProduto2);

        System.out.printf("A sua compra deu no total R$ %.2f \n", valorFinal);

        sc.close();
        
    }

}
