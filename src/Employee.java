public class Employee {
    private String name;
    private int salary;
    private int bonus;

    public Employee(String name, int salary, int bonus) {
        this.name = name;
        this.salary = salary;
        this.bonus = bonus;
    }

    private int salaryBonus() {
        int payment = getSalary();
        int paymentWithBonus = payment + bonus;
        return paymentWithBonus;
    }


    public void paySalary() {
        System.out.println("earns " + salaryBonus() + " Euro ");
    }

    public void work() {
    }

    ;

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }
}