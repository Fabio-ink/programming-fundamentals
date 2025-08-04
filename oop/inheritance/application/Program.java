package oop.inheritance.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import oop.inheritance.entities.Account;
import oop.inheritance.entities.BusinessAccount;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       List<Account> accounts = new ArrayList<>();

        System.out.println("Bem-vindo ao banco X");
        int option;

        do {
            System.out.println("----- Que tipo de operação deseja realizar -----");
            System.out.println("""
                1 - Cadastro de conta (Pessoa Física)
                2 - Cadastro de conta (Pessoa Jurídica)
                3 - Saque
                4 - Depósito
                5 - Empréstimo
                6 - Revisar conta
                7 - Sair
            """);
            option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1 -> accounts.add(registerAccount(sc, false));
                case 2 -> accounts.add(registerAccount(sc, true));
                case 3 -> withdrawOperation(sc, accounts);
                case 4 -> depositOperation(sc, accounts);
                case 5 -> loanOperation(sc, accounts);
                case 6 -> accountReview(sc, accounts);
                case 7 -> System.out.println("Encerrando operações...");
                default -> System.out.println("Opção inválida.");
            }

        } while (option != 7);

        sc.close();
    }

 private static Account registerAccount(Scanner sc, boolean isBusiness) {
        System.out.println("----- Iniciando o cadastro da conta -----");
        System.out.print("Número da conta: ");
        int number = sc.nextInt(); sc.nextLine();

        System.out.print("Nome do titular: ");
        String holder = sc.nextLine();

        double initialDeposit = 0.0;
        System.out.print("Deseja fazer um depósito inicial? (s/n): ");
        char resp = sc.next().charAt(0); sc.nextLine();
        if (resp == 's') {
            System.out.print("Valor do depósito: ");
            initialDeposit = sc.nextDouble(); sc.nextLine();
        }

        if (isBusiness) {
            System.out.print("Limite de empréstimo: ");
            double loanLimit = sc.nextDouble(); sc.nextLine();
            BusinessAccount acc = new BusinessAccount(number, holder, initialDeposit, loanLimit);
            return acc;
        }

        return new Account(number, holder, initialDeposit);
    }

    private static Account findAccount(Scanner sc, List<Account> accounts) {
        System.out.print("Número da conta: ");
        int numero = sc.nextInt(); sc.nextLine();

        for (Account account : accounts) {
            if (account.getNumber() == numero) {
                return account;
            }
        }

        System.out.println("Conta não encontrada.");
        return null;
    }

    private static void withdrawOperation(Scanner sc, List<Account> accounts) {
        Account account = findAccount(sc, accounts);
        if (account != null) {
            System.out.print("Valor do saque: ");
            double value = sc.nextDouble(); sc.nextLine();
            if (value > account.getBalance()){
                System.out.println("Não é possivel completar a transação, saldo indisponivel!");
                System.out.println();
            } else{
                account.withdraw(value);
                System.out.println("Saque realizado com sucesso.");
                System.out.println();
            }
        }
    }

     private static void depositOperation(Scanner sc, List<Account> accounts) {
        Account account = findAccount(sc, accounts);
        if (account != null) {
            System.out.print("Valor do depósito: ");
            double value = sc.nextDouble(); sc.nextLine();
            account.deposit(value);
            System.out.println("Depósito realizado com sucesso.");
            System.out.println();
        }
    }

    private static void loanOperation(Scanner sc, List<Account> accounts) {
        Account account = findAccount(sc, accounts);
        if (account instanceof BusinessAccount business) {
            System.out.print("Valor do empréstimo: ");
            double value = sc.nextDouble(); sc.nextLine();
            if (value > ((BusinessAccount) account).getLoanLimit()){
                System.out.println("Não foi possivel completar o empréstimo, limite de crédito ultrapassado");
                System.out.println();
            } else{
                business.loan(value);
                System.out.println("Empréstimo concedido com sucesso.");
                System.out.println();
            }
        } else {
            System.out.println("A conta não é do tipo corporativa.");
            System.out.println();
        }
    }

    private static void accountReview(Scanner sc, List<Account> accounts) {
        Account account = findAccount(sc, accounts);
        if (account != null) {
            System.out.println("----- Dados da conta -----");
            System.out.println(account);
            System.out.println();
        }
    }
}