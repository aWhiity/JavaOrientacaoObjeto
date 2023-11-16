package listas;

public class Employee {
    private int id;
    private double salary;
    private String name;
    
    public Employee(int id, double salary, String name) {
        this.id = id;
        this.salary = salary;
        this.name = name;
        
    }

    public int getId() {
        return id;
    }
    public double getSalary() {
        return salary;
    }
    public String getName() {
        return name;
    }

    public void modifySalary(double percentage) {
        this.salary += percentage / 100 * this.salary;
    }
    
}
