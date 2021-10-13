package Day4;

import java.util.ArrayList;
import java.util.List;

public class SalaryCalculator {

    public static void main(String[] args) {

        // Create 1 CEO, 2 Manager , 2 Employees

        //CEO
        CEO ceo = new CEO(10);

        //Manger
        Manager manager1 = new Manager();
        manager1.setSalary(8);

        Manager manager2 = new Manager();
        manager2.setSalary(7);

        List<Manager> managers = new ArrayList<>();
        managers.add(manager1);
        managers.add(manager2);

        double salaryM = 0;
        for (Manager tmp1 : managers) {
            salaryM += tmp1.getSalary();
        }

        //NormalEmployee
        NormalEmployee employee1 = new NormalEmployee();
        employee1.setSalary(5);

        NormalEmployee employee2 = new NormalEmployee();
        employee2.setSalary(4);

        List<NormalEmployee> normalEmployees = new ArrayList<>();
        normalEmployees.add(employee1);
        normalEmployees.add(employee2);

        double salaryNE = 0;
        for (NormalEmployee tmp2 : normalEmployees) {
            salaryNE += tmp2.getSalary();
        }

        double totalSalary = ceo.getSalary() + salaryM + salaryNE;
        System.out.println("Total salary: " + totalSalary);

    }
}
