package repetitionStructure;

import java.util.Scanner;

public class DivideFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        for (int i = 1; i <= x; i++){
            if (x % i == 0 || i % x == 0){
                System.out.println("O número " + i + " é divisivel por " + x);
            }
        }
        sc.close();
    }
    

}
