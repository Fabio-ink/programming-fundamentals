package exceptions.tryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

 /* 
    SYNTAX TRY-CATCH

    try { 
        //No campo try é colocado o que pode acabar ocasionando em um erro
    } 
    catch (ExceptionType e){ //Um try pode ter um ou mais catchs 

        //Dentro do campo catch vocẽ pode colocar alguma lógica que deve ser executada caso a excessão ocorra
    } 
    catch (ExceptionType e){
        
    } catch (ExceptionType e){
        
    }
*/

public class Syntax {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //define um vetor que cria um elemento a cada espaço inserido, por exemplo a entrada dos dados: Alex Maria Bob
        try{
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();sc.nextLine();
            System.out.println(vect[position]);
        } catch (ArrayIndexOutOfBoundsException e){ //caso o usuário digite uma posição que não existe o sistema exibirá a mensagem abaixo
            System.out.println("Posicao invalida");
        } catch (InputMismatchException e){ //caso o usuário digite um caracter diferente de um número que é o esperado como uma letra por exemplo o sistema exibirá a mensagem abaixo
            System.out.println("Erro de imput");
        }

        System.out.println("Finalizando o programa");
        sc.close();
    }
}
