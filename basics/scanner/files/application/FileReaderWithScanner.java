package basics.scanner.files.application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileReaderWithScanner {
    public static void main(String[] args) {

        String path = "/home/fluxyfp/Área de trabalho/in.txt";
        File file = new File(path);
        Scanner sc = null;
        try{
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        }
        catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
        finally{
            if(sc != null){
                sc.close();
            }
        }

        
    }

}
