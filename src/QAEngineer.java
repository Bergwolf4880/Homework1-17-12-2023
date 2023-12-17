public class QAEngineer extends Employee {


    public QAEngineer(String name, int salary, int bonus) {
        super(name, salary, bonus);
    }


    public String toString() {
        return "QAEngineer:" + getName() + " (" + getSalary() + ") ";
    }

    public void work() {
        System.out.println(getName() + ": I am QAEngineer. I check software ");
    }


}