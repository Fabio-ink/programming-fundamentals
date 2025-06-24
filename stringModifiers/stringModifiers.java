package stringModifiers;

import java.util.Scanner;

public class stringModifiers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String original = "Teste de FOrmaTAção de STRINGS   ";
        String s01 = original.toLowerCase(); //tudo para maiúsculo
        String s02 = original.toUpperCase(); //tudo para minúsculo 
        String s03 = original.trim(); //retira espaços em branco
        String s04 = original.substring(2); //cria uma sub string começando a partir do caracter determinado, no caso o "2"
        String s05 = original.substring(2, 13); //determina de quando até quando deve ser este sub string
        String s06 = original.replace('e', 'x'); //troca sempre que achar o primeiro caracter igual ao informado pela informação a direita
        String s07 = original.replace("de", "YZ"); //funciona com string também
        int i = original.indexOf("de"); //Localiza a primeira ocorrencia do "de"
        int l = original.lastIndexOf("de"); //localiza a ultima ocorrencia do "de"

        String s = "potato lemon apple";
        String[] vect = s.split(" "); // funçao split separa o String em vetores apartir de determinado parametro, neste caso o espaço entre as palavras

        System.out.println("Original: -" + original + "-");
        System.out.println("ToLowerCase: -" + s01 + "-");
        System.out.println("ToUpperCase: -" + s02 + "-");
        System.out.println("Trim: -" + s03 + "-");
        System.out.println("SubString(2): -" + s04 + "-");
        System.out.println("SubString(2, 13): -" + s05 + "-");
        System.out.println("Replace('e', 'x'): -" + s06 + "-");
        System.out.println("Replace('de', 'YZ'): -" + s07 + "-");
        System.out.println("IndexOf (de): " + i);
        System.out.println("LastIndexOf (de): " + l);
        System.out.println("Primeiro Vetor: " + vect[0]);
        System.out.println("Segundo Vetor: " + vect[1]);
        System.out.println("Terceiro Vetor: " + vect[2]);

        sc.close();
    }
}
