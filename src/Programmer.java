public class Programmer extends Employee {

    public Programmer(String name, int salary, int bonus) {
        super(name, salary, bonus);

    }

    @Override
    public String toString() {
        return "Programmer:" + getName() + " (" + getSalary() + ") ";
    }

    public void  work(){
        System.out.println(getName() + ": I am programmer. I write code ");
    }

}