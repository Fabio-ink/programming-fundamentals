package RepetitionStructure;

import java.util.Scanner;

public class RepeatOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Número ímpares até:");
        int x = sc.nextInt();
        
        for (int i = 1; i <= x; i++){
            if (i == 1 || i % 2 != 0){
                System.out.println(i);
            }
        }
        sc.close();
    }
}
