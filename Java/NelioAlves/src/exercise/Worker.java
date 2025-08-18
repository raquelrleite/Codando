/*
import java.util.ArrayList;
import java.util.List;

public class Worker {
    private String name;
    private WorkerLevel level;
    private Double baseSalary;

    private Department department;
    private List<HourContract> contracts = new ArrayList<>();

    void addContract(HourContract contract){
        contracts.add(contract);

        System.out.print("Date (DD//MM/YYYY): ");

        System.out.print("Value per hour: ");

        System.out.print("Duration (hours): ");

    }

    void removeContract(HourContract contract){
        contracts.remove(contract);
    }

    Double income(int year, int month){
        double sum = baseSalary;
        for(HourContract contract : contracts){
            sum += contract.totalValue();
        }
        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
    }


    public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }
}
*/
