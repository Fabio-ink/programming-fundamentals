package oop.inheritance.entities;

import java.util.List;
import java.util.Scanner;

import exceptions.model.exceptions.DomainException;

public class Account {

    protected Integer number;
    protected String holder;
    protected Double balance;

    public Account(){
    }

    public Account(Integer number, String holder, Double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public void deposit(Double amount) {
        this.balance += amount;
    }

    public void withdraw(Double amount) {
        this.balance -= amount + 5.0;
    }

    private static Account registerAccount(Scanner sc, boolean isBusiness, boolean isSaving) {
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

        if (isSaving){
            System.out.print("Taxa de juros (aa): ");
            Double interestRate = sc.nextDouble(); sc.nextLine();
            SavingsAccount acc = new SavingsAccount(number, holder, initialDeposit, interestRate);
            return acc;
        }

        return new Account(number, holder, initialDeposit);
    }

    public static Account findAccount(Scanner sc, List<Account> accounts) throws DomainException {
        System.out.print("Número da conta: ");
        int numero = sc.nextInt(); sc.nextLine();

        for (Account account : accounts) {
            if (account.getNumber() == numero) {
                return account;
            }
        }

        throw new DomainException("Conta não encontrada");
    }

    public static void withdrawOperation(Scanner sc, List<Account> accounts) throws DomainException {
        Account account = findAccount(sc, accounts);
        if (account != null) {
            System.out.print("Valor do saque: ");
            double value = sc.nextDouble(); sc.nextLine();
            if (value > account.getBalance()){
                throw new DomainException("Saldo indisponivel para saque");
            } else{
                account.withdraw(value);
                System.out.println("Saque realizado com sucesso.");
                System.out.println();
            }
        }
    }

     public static void depositOperation(Scanner sc, List<Account> accounts) throws DomainException {
        Account account = findAccount(sc, accounts);
        if (account != null) {
            System.out.print("Valor do depósito: ");
            double value = sc.nextDouble(); sc.nextLine();
            account.deposit(value);
            System.out.println("Depósito realizado com sucesso.");
            System.out.println();
        }
    }

    public static void loanOperation(Scanner sc, List<Account> accounts) throws DomainException {
        Account account = findAccount(sc, accounts);
        if (account instanceof BusinessAccount business) {
            System.out.print("Valor do empréstimo: ");
            double value = sc.nextDouble(); sc.nextLine();
            if (value > ((BusinessAccount) account).getLoanLimit()){
                throw new DomainException("limite de crédito ultrapassado");
            } else{
                business.loan(value);
                System.out.println("Empréstimo concedido com sucesso.");
                System.out.println();
            }
        } else {
            throw new DomainException("A conta não é do tipo corporativa");
        }
    }

    public static void accountReview(Scanner sc, List<Account> accounts) throws DomainException {
        Account account = findAccount(sc, accounts);
        if (account != null) {
            System.out.println("----- Dados da conta -----");
            System.out.println(account);
            System.out.println();
        }
    }
    public static Account selectTipAccount(Scanner sc) throws DomainException {
        System.out.println("----- Qual tipo de conta deseja abrir -----");
        System.out.println("""
            1 - Abrir uma conta Fisica
            2 - Abrir uma conta Jurídica
            3 - Abrir uma conta Poupança
            4 - Cancelar
        """);
        int option = sc.nextInt();
        sc.nextLine();

        return switch (option) {
            case 1 -> registerAccount(sc, false, false);
            case 2 -> registerAccount(sc, true, false);
            case 3 -> registerAccount(sc, false, true);
            default -> throw new DomainException("Opção invalida");
        };
    }

    public static void updateSavingsBalance(Scanner sc, List<Account> accounts) throws DomainException {
        Account account = findAccount(sc, accounts);
        if (account instanceof SavingsAccount savings) {
            savings.updateBalance();
            System.out.println("Saldo atualizado com juros.");
        } else {
            throw new DomainException("A conta não é poupança");
        }
    }

    @Override
    public String toString() {
        return "Account [number = " + number + ", holder = " + holder + ", balance = " + balance + "]";
    }
}
    

