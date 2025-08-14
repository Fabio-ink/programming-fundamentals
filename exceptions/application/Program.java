package exceptions.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import exceptions.model.entities.Reservation;
import exceptions.model.exceptions.DomainException;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try{
            System.out.print("Room Number: ");
            int number = sc.nextInt();sc.nextLine();
            System.out.println("Check-In Date (dd/mm/yyyy): ");
            Date checkIn = sdf.parse(sc.nextLine());
            System.out.println("Check-Out Date (dd/mm/yyyy): ");
            Date checkOut = sdf.parse(sc.nextLine());

            
            Reservation reservation = new Reservation(number, checkIn, checkOut);
            System.out.println("Reservation: " + reservation);

            System.out.println();
            System.out.println("-----Enter data to update the reservation-----");
            System.out.println("Check-In Date (dd/mm/yyyy): ");
            checkIn = sdf.parse(sc.nextLine());
            System.out.println("Check-Out Date (dd/mm/yyyy): ");
            checkOut = sdf.parse(sc.nextLine());

            reservation.updateDates(checkIn, checkOut);
            System.out.println("Reservation: " + reservation);
        }
        catch (ParseException e){
            System.out.println("Invalid date format");
        }
        catch (DomainException e){
            System.out.println("Error in reservation: " + e.getMessage());
        }
        catch (RuntimeException e){
            System.out.println("Unexpected error");
        }

        sc.close();
    }

}
