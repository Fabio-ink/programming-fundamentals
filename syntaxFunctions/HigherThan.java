package syntaxFunctions;

import java.util.Scanner;

public class HigherThan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite 3 números:");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        //chamando a função:

        int higher = higherNumber(a, b, c);
        showResult(higher);

        sc.close();
    }

    //syntax = modificador de aceesso (Não obrigatório) + tipo da função (int, str, etc) + nome da função + parametros entre () + código da função entre {}  

    public static int higherNumber(int x, int y, int z){
        int aux;

        if (x > y && x > z){
            aux = x;
        } else if (y > z){
            aux = y;
        } else{
            aux = z;
        }
        return aux;
    }

    public static void showResult(int value){
        System.out.println("o maior número é: " + value);
    }
}
