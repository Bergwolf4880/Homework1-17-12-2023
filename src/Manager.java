public class Manager extends Employee {


    public Manager(String name, int salary, int bonus) {
        super(name, salary, bonus);

    }


    public String toString() {
        return "Manager:" + getName() + " (" + getSalary() + ") ";
    }

    public void work() {
        System.out.println(getName() + ": I am a Manager. I manage stuff.");
    }


}
