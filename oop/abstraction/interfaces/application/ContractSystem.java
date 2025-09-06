import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import oop.abstraction.interfaces.model.entities.Contract;
import oop.abstraction.interfaces.model.entities.Installment;
import oop.abstraction.interfaces.model.services.ContractService;
import oop.abstraction.interfaces.model.services.PaypalService;

public class ContractSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        try{
            System.out.println("-----Enter contract info-----");
            System.out.print("Contract number: ");
            Integer n = sc.nextInt();sc.nextLine();
            System.out.print("Date (dd/mm/yyyy): ");
            LocalDate date = LocalDate.parse(sc.nextLine(), fmt);
            System.out.print("Contract Value: ");
            Double totalValue = sc.nextDouble();sc.nextLine();
            System.out.print("Number of installments: ");
            Integer months = sc.nextInt();sc.nextLine();

            
            Contract c = new Contract(n, date, totalValue);
            System.out.println("\nGenerating contract...");
            System.out.println("Contract #" + c.getNumber() + " generated.");

            ContractService contractService = new ContractService(new PaypalService());

            contractService.processContract(c, months);

            System.out.println("\n-----Installment-----");
            for (Installment installment : c.getInstallments()){
                System.out.println(installment);
            }
            System.out.println();
        }
        catch (RuntimeException e2){
            System.out.println("Unexpected Error");
        }
        finally {
            if(sc != null){
                sc.close();
            }
        }
    }
}

