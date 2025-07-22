package collections.lists.application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class IntroList {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Fabio");//adiciona um novo elemento a lista.
        list.add("Joao");
        list.add("Renata");
        list.add("Lucas");
        list.add(2, "Luana"); //adiciona um elemento no indice designado previamente.

        System.out.println("Tamanho da lista: " + list.size());
        System.out.println();

        for (String x : list){
            System.out.println(x);
        }
        System.out.println("----------------");

        list.remove("Renata"); //remove um elemento da lista, buscando pelo valor.
        list.remove(1); //remove um elemento da lista, pelo indice.
        list.removeIf(x -> x.charAt(0) == 'L'); //remove todos os itens cujo correspondam ao if/lambda proposto.

        for (String x : list){
            System.out.println(x);
        }
        System.out.println("----------------");

        System.out.println("index of Fabio: " + list.indexOf("Fabio")); //informa qual o indice do valor solicitado.
        System.out.println("index of Fabio: " + list.indexOf("Joao")); // Quando o indexOf não encontra o elemento, ele retorna -1.
        System.out.println();

        System.out.println("----------------");

        list.add("Marcos");
        list.add("Alex");
        list.add("Anna");

        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList()); 
        /* cria uma nova lista chamada "result", que filtra a lista "list" utilizando Stream 
        e transforma o stram em uma lista novamente utilizando o collectors.toList().*/

        for (String x : result){
            System.out.println(x);
        }

        System.out.println("----------------");
        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null); //localiza na lista o primeio elemento que começa com a letra A.
        System.out.println(name); //se não tiver um elemento que se encaixe no if, ele ira retornar nulo.

    }

}
