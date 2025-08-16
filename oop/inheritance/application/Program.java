package oop.inheritance.application;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import exceptions.model.exceptions.DomainException;
import oop.inheritance.entities.Account;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       List<Account> accounts = new ArrayList<>();

        System.out.println("Bem-vindo ao banco X");
        int option;

        try{
            do {
                System.out.println("----- Que tipo de operação deseja realizar -----");
                System.out.println("""
                    1 - Abrir uma conta
                    2 - Saque
                    3 - Depósito
                    4 - Empréstimo
                    5 - Aplicar taxa de juros
                    6 - Revisar conta
                    7 - Sair
                """);
                option = sc.nextInt(); sc.nextLine();

                switch (option) {
                    case 1 -> {
                        Account newAccount = Account.selectTipAccount(sc);
                        if (newAccount != null) {
                            accounts.add(newAccount);
                            System.out.println("Conta criada com sucesso!");
                            System.out.println();
                        }
                    }
                    case 2 -> Account.withdrawOperation(sc, accounts);
                    case 3 -> Account.depositOperation(sc, accounts);
                    case 4 -> Account.loanOperation(sc, accounts);
                    case 5 -> Account.updateSavingsBalance(sc, accounts);
                    case 6 -> Account.accountReview(sc, accounts);
                    case 7 -> System.out.println("Encerrando operações...");
                }

            } while (option != 7    );
        }
        catch(DomainException e){
            System.out.println("Erro na operação: " + e.getMessage());
        }
        catch(InputMismatchException e){
            System.out.println("Erro: Caracter invalido com as opções solicitadas");
        }
        finally{
            sc.close();
        }
    }
}