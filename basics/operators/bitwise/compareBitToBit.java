package basics.operators.bitwise;

import java.util.Scanner;

public class compareBitToBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int mask = 0b00100000; // <-- em binario ou o número mask em decimal, no caso do 32.
        int n = sc.nextInt();

        if ((n & mask) != 0){
            System.out.println("O sexto(6th) bit é verdadeiro");
        } else {
            System.out.println("O sexto(6th) bit é falso");
        }
        sc.close();
    }

}
