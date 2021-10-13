package Day5;

import java.util.ArrayList;
import java.util.List;

public class SalaryCalculator {

    public static void main(String[] args) {

        //1 CEO; 2 Managers; 2 Accountants; 4 NormalEmployees;

        CEO ceo = new CEO();
        ceo.setName("Nguyen Van A");
        System.out.println(ceo.showInfo());

        Manager manager01 = new Manager();
        manager01.setSalary(20);
        manager01.setName("Le Thi B");
        System.out.println(manager01.showInfo());

        Manager manager02 = new Manager();
        manager02.setSalary(22);
        manager02.setName("Tran Van C");
        System.out.println(manager02.showInfo());

        Accountant accountant1 = new Accountant();
        accountant1.setSalary(18);
        accountant1.setName("Cao Van D");
        System.out.println(accountant1.showInfo());

        Accountant accountant2 = new Accountant();
        accountant2.setSalary(19);
        accountant2.setName("Huynh Van E");
        System.out.println(accountant2.showInfo());

        NormalEmployee Nemployee1 = new Day5.NormalEmployee();
        Nemployee1.setSalary(10);
        Nemployee1.setName("Nguyen Thi F");
        System.out.println(Nemployee1.showInfo());

        NormalEmployee Nemployee2 = new Day5.NormalEmployee();
        Nemployee2.setSalary(9);
        Nemployee2.setName("Nguyen Thi G");
        System.out.println(Nemployee2.showInfo());


        NormalEmployee Nemployee3 = new Day5.NormalEmployee();
        Nemployee3.setSalary(8);
        Nemployee3.setName("Nguyen Thi H");
        System.out.println(Nemployee3.showInfo());

        NormalEmployee Nemployee4 = new Day5.NormalEmployee();
        Nemployee4.setSalary(8);
        Nemployee4.setName("Tran Van L");
        System.out.println(Nemployee4.showInfo());

        List<Employee> employees = new ArrayList<>();
        employees.add(ceo);
        employees.add(manager01);
        employees.add(manager02);
        employees.add(accountant1);
        employees.add(accountant2);
        employees.add(Nemployee1);
        employees.add(Nemployee2);
        employees.add(Nemployee3);
        employees.add(Nemployee4);

        double totalSalaries = 0;
        for (Employee employee : employees) {
            totalSalaries += employee.getSalary();
        }
        System.out.println("Total salaries: " + totalSalaries);


    }
}

