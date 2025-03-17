package jwfhdjl;

import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Department department = new Department();
        Worker worker= new Worker();
        WorkerLevel level = WorkerLevel.MID_LEVEL;

        System.out.print("Enter department's name: ");
        department.name = sc.nextLine(); sc.next();

        System.out.println("Enter worker data: ");
        System.out.print("Name: ");
        worker.name = sc.nextLine(); sc.next();
        System.out.println("Level: " + worker.level);
        System.out.println("Base salary: ");
        worker.baseSalary = sc.nextDouble();

        System.out.print("How many contracts to this worker? ");
        int contracts = sc.nextInt();

        for (int i = 0; i < contracts; i++) {
            System.out.println("Enter contract #" + (i +1));
            HourContract hourContract = new HourContract();
            System.out.print("Date (DD/MM/YYYY): ");
            String data = sc.nextLine();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            hourContract.date = LocalDate.parse(data, formatter);
            System.out.print("Value per hour: ");
            hourContract.valuePerHour = sc.nextDouble();
            System.out.print("Duration: ");
            hourContract.hours = sc.nextInt();
        }

        System.out.println();
        System.out.print("Enter month and year to calculate income (MM/YYYY):  ");
        String data = sc.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/yyyy");
        YearMonth data1 = YearMonth.parse(data, formatter);

        System.out.println(worker.name);
        System.out.println(department.name);
        System.out.print("Income for " + data + ": ");
        System.out.println(income);







    }
}
