package excecoes.ex1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Room number: ");
        int numeroQuarto = sc.nextInt(); sc.nextLine();

        System.out.print("Check-in date (dd/MM/yyyy: ");
        String checkInDate = sc.nextLine();
        System.out.print("Check-out date (dd//MM/yyyy: ");
        String checkOutDate = sc.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate checkOut = LocalDate.parse(checkOutDate);

        LocalDate checkIn = LocalDate.parse(checkInDate);

        Reservation reservation = new Reservation(checkIn, checkOut);
        reservation.roomNumber = numeroQuarto;











        System.out.print("Enter data to update the reservation: ");
        System.out.print("Check-in date (dd//MM/yyyy: ");
        System.out.print("Check-out date (dd//MM/yyyy:");
        System.out.print("Reservation: ");

    }

}
