import org.w3c.dom.ls.LSOutput;

public class Employee extends Person{
    double daySalary;

    public Employee(String name, int age, boolean isMan, double daySalary) {
        super(name, age, isMan);
        this.daySalary = daySalary;
    }

    void showEmployeeInfo() {
        showPersonInfo();
        System.out.println("Employee day salary: " + daySalary);
    }

    double calculateOvertime(double hours) {
        if (age < 18) {
            return 0;
        } else {
            double overTimeSalary = ((daySalary/8) * 1.5) * hours;
            System.out.println(name + " Overtime salary: " + overTimeSalary);
            return overTimeSalary;
        }
    }

}
