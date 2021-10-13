package Day5;

public class CEO extends Employee {

    private double supportSalary;

    public double getSupportSalary() {
        return supportSalary;
    }

    public void setSupportSalary(double supportSalary) {
        this.supportSalary = supportSalary;
    }

    @Override
    public void setPosition(String position) {
        super.setPosition("CEO");
    }
}
