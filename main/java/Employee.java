/**
 * Created by user on 01/03/2018.
 */
public abstract class Employee {
    public String name;
    public String niNumber;
    public double salary;

    public Employee(String name, String niNumber, double salary ){
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getNiNumber() {
        return niNumber;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double amount){
        this.salary += amount;
    }

    public double payBonus(){
        return this.salary / 100;
    }
}
