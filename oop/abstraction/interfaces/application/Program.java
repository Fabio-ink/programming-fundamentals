import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

import oop.abstraction.interfaces.model.entities.CarRental;
import oop.abstraction.interfaces.model.entities.Vehicle;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter sdf = DateTimeFormatter.ofPattern(("dd/MM/yyyy HH:mm"));

        System.out.println("Enter rental data");
		System.out.print("Car model: ");
		String carModel = sc.nextLine();
		System.out.print("Pickup (dd/MM/yyyy HH:mm): ");
		LocalDateTime start = LocalDateTime.parse(sc.nextLine(), sdf);
		System.out.print("Return (dd/MM/yyyy HH:mm): ");
		LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), sdf);
		
		CarRental cr = new CarRental(start, finish, new Vehicle(carModel));

		System.out.print("Enter price per hour: ");
		double pricePerHour = sc.nextDouble();
		System.out.print("Enter price per day: ");
		double pricePerDay = sc.nextDouble();

        sc.close();
    }

}
