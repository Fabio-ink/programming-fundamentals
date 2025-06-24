package repetitionStructure;

import java.util.Scanner;

public class NumberPowerTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int c = sc.nextInt();
        
         for (int i = 1; i <= c; i++) {
            int a = i * i;
            int b = i * i * i;
            System.out.printf("%d %d %d%n", i, a, b);
        }
        sc.close();
    }

}
