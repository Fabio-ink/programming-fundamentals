package basics.scanner.files.syntax;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterAndBufferedWriter {
    public static void main(String[] args) {
        
        String[] lines = new String[] {"Good Evening", "Good Afternoon", "Good Night"};

        String path = "/home/fluxyfp/Área de trabalho/out.txt";

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){ 
            //Com o parametro true ele não recria/sobreescreve o arquivo e adiciona ao final do arquivo 
            
            for (String line : lines){
                bw.write(line);
                bw.newLine();
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }

    }

}
