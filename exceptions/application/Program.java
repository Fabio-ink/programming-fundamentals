package exceptions.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import exceptions.model.entities.Reservation;

public class Program {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Room Number: ");
        int number = sc.nextInt();sc.nextLine();
        System.out.println("Check-In Date (dd/mm/yyyy): ");
        Date checkIn = sdf.parse(sc.nextLine());
        System.out.println("Check-Out Date (dd/mm/yyyy): ");
        Date checkOut = sdf.parse(sc.nextLine());

        if(!checkOut.after(checkIn)){
            System.out.println("Error in reservation: Check-out date must be after check-in date");
        } else{
            Reservation reservation = new Reservation(number, checkIn, checkOut);
            System.out.println("Reservation: " + reservation);

            System.out.println();
            System.out.println("-----Enter data to update the reservation-----");
            System.out.println("Check-In Date (dd/mm/yyyy): ");
            checkIn = sdf.parse(sc.nextLine());
            System.out.println("Check-Out Date (dd/mm/yyyy): ");
            checkOut = sdf.parse(sc.nextLine());

            String error = reservation.updateDates(checkIn, checkOut);
            if (error != null){
                System.out.println("Error in reservation: " + error);
            } else{
            System.out.println("Reservation: " + reservation);
            }
        }
        sc.close();
    }

}
