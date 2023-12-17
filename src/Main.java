public class Main {
    public static void main(String[] args) {

        Programmer p1 = new Programmer("Jack", 4000,0);
        Programmer p2 = new Programmer("Lena", 5000,0);
        QAEngineer q1 = new QAEngineer("John", 5500, 0);
        QAEngineer q2 = new QAEngineer("Ira", 4500, 0);
        SupportEngineer s1 = new SupportEngineer("Valera", 3500, 0);
        Manager m1 = new Manager("Joshua", 5000, 500);

        /*
        Programmer[] programmerArray = {p1,p2};
        QAEngineer[] qaEngineerArray = {q1,q2};

        for (Programmer programmer: programmerArray){
            programmer.work();
            programmer.paySalary();

        }

        for (QAEngineer qaEngineer:qaEngineerArray){
            qaEngineer.work();
            qaEngineer.paySalary();
        }

         */

        Employee[] employees = {p1, p2, q1, q2,s1,m1};
        for (Employee employee : employees) {
            //System.out.println(employee);
            employee.work();
            employee.paySalary();

        }
    }
}