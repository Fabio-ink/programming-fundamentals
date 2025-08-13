package exceptions;

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
        
        method1();

        System.out.println("Finalizando o programa");
    }

    public static void method1(){
        System.out.println("***METHOD1 START***");
        method2();
        System.out.println("***METHOD1 END***");
    }

    public static void method2(){
        System.out.println("***METHOD2 START***");
        Scanner sc = new Scanner(System.in);

        //define um vetor que cria um elemento a cada espaço inserido, por exemplo a entrada dos dados: Alex Maria Bob

        /*
        Bloco TRY - Contém o código que representa a execução normal do trecho de código que pode acarretar em uma exceção
        */

        try{
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();sc.nextLine();
            System.out.println(vect[position]);
        } 
        /*
        Bloco CATCH - * Contém o código a ser executado caso uma exceção ocorra.
                      * Deve ser especificado o tipo da exceção a ser tratada (upcasting é permitido), 
                        no caso utilizar uma exceção que seja pai/tenha a exceção que se enquadre nessa situação herdada dela.
        */
        
        catch (ArrayIndexOutOfBoundsException e){ //caso o usuário digite uma posição que não existe no vetor acarretará nesta exceção e o código abaixo será executado
            System.out.println("Posicao invalida");
            e.printStackTrace(); // Ele mostra toda a chamada de métodos que acarretou nesta exceção

        } catch (InputMismatchException e){ //caso o usuário digite um caracter diferente de um número que é o esperado como uma letra por exemplo o sistema exibirá a mensagem abaixo
            System.out.println("Erro de imput");
        }
        /*
        Bloco FINALLY - * É um bloco que contém código a ser executado independentemente de ter ocorrido ou não uma exceção.
                        * Exemplo clássico: fechar um arquivo, conexão de banco de dados, 
                          ou outro recurso específico que deva ser executado ao final do processamento.
        */
        finally{ // O bloco Finally irá ser executado indempendente de ter havido ou não uma exceção
            sc.close();
        }
                
        System.out.println("***METHOD2 END***");
    }
}
