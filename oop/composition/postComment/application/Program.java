package oop.composition.postComment.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import oop.composition.postComment.entities.Comments;
import oop.composition.postComment.entities.Post;

public class Program {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Comments c1 = new Comments("Tenha uma ótima viajem!");
        Comments c2 = new Comments("Se divirta muito!");

        Post p1 = new Post(
            sdf1.parse("29/07/2025 20:50:14"), 
            "Viajando para Nova York", 
            "Vou conhecer as maravilhas de NY", 
            12);

        p1.addComment(c1);
        p1.addComment(c2);

        System.out.println(p1);
        System.out.println("--------------");

        Comments c3 = new Comments("Não se machuquem");
        Comments c4 = new Comments("Cuidado com as trilhas de noite");

        Post p2 = new Post(
            sdf1.parse("23/05/2025 15:45:51"), 
            "Acampamento na montanha", 
            "Acampando em uma montanha proxima!", 
            5);

        p2.addComment(c3);
        p2.addComment(c4);

        System.out.println(p2);
    }

}
