package Day5;

public class Employee {

    private double salary;
    private String name;
    private String position = "Normal Employee";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    //Show info
    public char showInfo(){
        System.out.println("Employees Info:");
        System.out.println("- Name \t\t\n" + this.getName());
        System.out.println("- Position \t\t" + this.getPosition());
        return 0;
    }
}
