public class SupportEngineer extends Employee {

    public SupportEngineer(String name, int salary, int bonus) {
        super(name, salary, bonus);
    }

    public String toString() {
        return "SupportEngineer:" + getName() + " (" + getSalary() + ") ";
    }

    public void work() {
        System.out.println(getName() + ": I am SupportEngineer. I trobleshoot issues. ");
    }


}
