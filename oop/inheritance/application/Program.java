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
        List<BusinessAccount>  businessAccounts = new ArrayList<>();

        System.out.println("Bem vindo ao banco X");
        Integer option = 0;
        do {
            System.out.println("-----Que tipo de operação deseja realizar-----");
            System.out.println(" 1 - cadastro de conta (Pessoa física)\n 2 - Cadastro de conta (Pessoa jurídica)\n 3 - Saque\n 4 - Depósito\n 5 - Empréstimo\n 6 - Revisar conta\n 7 - Sair");
            option = sc.nextInt();
    
            switch (option) {
                case 1:
                    System.out.println();
                    System.out.println("-----Inciando o cadastro da conta-----");
                    System.out.print("Qual o número da conta: ");
                    Integer number = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Quem será o proprietário da conta: ");
                    String holder = sc.nextLine();

                    Account account = new Account(number, holder, 0.0);

                    System.out.println("A conta terá um depósito inicial (s/n):");
                    char response = sc.next().charAt(0);
                    sc.nextLine();
                    if (response == 's'){
                        System.out.print("De quanto será o depósito inicial: ");
                        Double depIni = sc.nextDouble();
                        sc.nextLine();
                        account.deposit(depIni);
                    }
                    accounts.add(account);
                    break;
                case 2:
                    System.out.println();
                    System.out.println("-----Inciando o cadastro da conta-----");
                    System.out.print("Qual o número da conta: ");
                    number = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Quem será o proprietário da conta: ");
                    holder = sc.nextLine();
                    System.out.print("Qual deseja que seja o limite da sua conta: ");
                    Double loanLimit = sc.nextDouble();
                    sc.nextLine();

                    BusinessAccount businessAccount = new BusinessAccount(number, holder, 0.0, loanLimit);

                    System.out.println("A conta terá um depósito inicial (s/n):");
                    response = sc.next().charAt(0);
                    sc.nextLine();
                    if (response == 's'){
                        System.out.print("De quanto será o depósito inicial: ");
                        Double depIni = sc.nextDouble();
                        sc.nextLine();
                        businessAccount.deposit(depIni);
                    }
                    businessAccounts.add(businessAccount);
                    break;
                case 3:
                    boolean encontrada = false;
                    System.out.print("Qual o número da sua conta: ");
                    Integer nAccount = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Qual o tipo da sua conta (F/J): ");
                    char tipoConta = sc.next().charAt(0);
                    sc.nextLine();
                    if (tipoConta == 'F' || tipoConta == 'f'){
                        for (Account ac : accounts){
                            if(ac.getNumber() == nAccount){
                                encontrada = true;
                                System.out.print("Qual será o valor que deseja sacar: ");
                                Double ammount = sc.nextDouble();
                                ac.withdraw(ammount);
                                System.out.println("Saque realizado com sucesso");
                                System.out.println();
                            } else if (!encontrada){
                                System.out.println("O número da conta que digitou não exite");
                            }
                        }
                    } else if (tipoConta == 'J' || tipoConta == 'j'){
                        for (BusinessAccount ba : businessAccounts){
                            if(ba.getNumber() == nAccount){
                                encontrada = true;
                                System.out.print("Qual será o valor que deseja sacar: ");
                                Double ammount = sc.nextDouble();
                                ba.withdraw(ammount);
                                System.out.println("Saque realizado com sucesso");
                                System.out.println();
                            } else if (!encontrada){
                                System.out.println("O número da conta que digitou não exite");
                            }
                        }
                    } else {
                        System.out.println("O caracter que digitou está incorreto");
                    }
                    break;
                case 4:
                    encontrada = false;
                    System.out.print("Qual o número da sua conta: ");
                    nAccount = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Qual o tipo da sua conta (F/J): ");
                    tipoConta = sc.next().charAt(0);
                    sc.nextLine();
                    if (tipoConta == 'F' || tipoConta == 'f'){
                        for (Account ac : accounts){
                            if(ac.getNumber() == nAccount){
                                encontrada = true;
                                System.out.print("Qual será o valor que deseja depositar: ");
                                Double ammount = sc.nextDouble();
                                ac.deposit(ammount);
                                System.out.println("Depósito realizado com sucesso");
                                System.out.println();
                            } else if (!encontrada){
                                System.out.println("O número da conta que digitou não exite");
                            }
                        }
                    } else if (tipoConta == 'J' || tipoConta == 'j'){
                        for (BusinessAccount ba : businessAccounts){
                            if(ba.getNumber() == nAccount){
                                encontrada = true;
                                System.out.print("Qual será o valor que deseja depositar: ");
                                Double ammount = sc.nextDouble();
                                ba.deposit(ammount);
                                System.out.println("Depósito realizado com sucesso");
                                System.out.println();
                            } else if (!encontrada){
                                System.out.println("O número da conta que digitou não exite");
                            }
                        }
                    } else {
                        System.out.println("O caracter que digitou está incorreto");
                    }
                    break;
                case 5:
                    encontrada = false;
                    System.out.print("Qual o número da sua conta corporativa: ");
                    nAccount = sc.nextInt();
                    sc.nextLine();

                    for (BusinessAccount ba : businessAccounts){
                        if(ba.getNumber() == nAccount){
                            encontrada = true;
                            System.out.print("Qual será o valor que deseja de empréstimo: ");
                            Double ammount = sc.nextDouble();
                            ba.loan(ammount);
                            System.out.println("Empréstimo realizado com sucesso");
                            System.out.println();
                        } else if (!encontrada){
                            System.out.println("O número da conta que digitou não exite ou é uma conta normal(Pessoa Fisíca)");
                        }
                    }
                    break;
                case 6:
                    encontrada = false;
                    System.out.print("Qual o número da sua conta: ");
                    nAccount = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Qual o tipo da sua conta (F/J): ");
                    tipoConta = sc.next().charAt(0);
                    sc.nextLine();
                    if (tipoConta == 'F' || tipoConta == 'f'){
                        for (Account ac : accounts){
                            if(ac.getNumber() == nAccount){
                                encontrada = true;
                                System.out.println();
                                System.out.println("-----Dados da conta-----");
                                System.out.println(ac);
                            } else if (!encontrada){
                                System.out.println("O número da conta que digitou não exite");
                            }
                        }
                    } else if (tipoConta == 'J' || tipoConta == 'j'){
                        for (BusinessAccount ba : businessAccounts){
                            if(ba.getNumber() == nAccount){
                                encontrada = true;
                                System.out.println();
                                System.out.println("-----Dados da conta-----");
                                System.out.println(ba);
                            } else if (!encontrada){
                                System.out.println("O número da conta que digitou não exite");
                            }
                        }
                    } else {
                        System.out.println("O caracter que digitou está incorreto");
                    }
                    break;
                case 7:
                    System.out.println("Encerrando operações...");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }

        } while (option != 7);

        sc.close();
    }

}