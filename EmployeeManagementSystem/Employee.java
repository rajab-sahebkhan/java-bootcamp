package EmployeeManagementSystem;

public class Employee {

    private String name;
    private int id;
    private int salary;
    private boolean active;

    public Employee(String name, int id, int salary, boolean active){
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.active = active;
    }

    public String getName(){
        return name;
    }

    public int getId(){
        return id;
    }

    public int getSalary(){
        return salary;
    }

    public boolean isActive(){
        return active;
    }

    @Override
    public String toString() {
        return "Id: " + id + "\nName: " + name + "\nSalary: " + salary + "\nActive: " + active;
    }
}
