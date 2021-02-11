package java_calisma;
class Employee{
    public int salary;

    public void name1(){
        System.out.println("Employee");
    }

}
public class Manager extends Employee {
public int budget;
    public void name2(){
        System.out.println("Manager");
    }

}

class Director extends Manager {
    public int stockOptions;
    public void name3(){
       System.out.println("Director");
    }

    public static void main(String[] args) {
        Employee employee=new Employee();
        Employee manager=new Manager();
        Employee director=new Director();
        Director director2=new Director();
        Manager manager2=new Manager();




    }





}
