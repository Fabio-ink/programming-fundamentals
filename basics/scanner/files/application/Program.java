package basics.scanner.files.application;

import java.io.File;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o caminho de uma pasta: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);
        File[] folders = path.listFiles(File::isDirectory);
        System.out.println("-----Pastas-----");
        for(File folder : folders){
            System.out.println(folder);
        }

        File[] files = path.listFiles(File::isFile);
        System.out.println("-----Arquivos-----");
        for(File file : files){
            System.out.println(file);
        }

        boolean success = new File(strPath + "\\subdir").mkdir();
        System.out.println("Diretótio criado com sucesso" + success);

        sc.close();
    }

}
