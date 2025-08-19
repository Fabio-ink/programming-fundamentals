package basics.scanner.files.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderBufferedReader {
    public static void main(String[] args) {
        
        String path = "/home/fluxyfp/Área de trabalho/in.txt";
        FileReader fr = null;
        BufferedReader br = null;

        try{
            fr = new FileReader(path);
            br = new BufferedReader(fr); 
            //Primeiro instancia FileReader para ler o arquivo em path e depois instancia um BufferedReader para acelerar o processo
            //É possivel fazer tudo em uma unica linha também se quiser "br = new BufferedReader(new FileReader(path));"

            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        }
        catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
        finally{
            try{
                if(br != null){
                br.close();
            }
            if(fr != null){
                br.close();
            }
            }
            catch (IOException e){
                e.printStackTrace();
            }
        }

    }

}
