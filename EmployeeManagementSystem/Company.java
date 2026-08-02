package EmployeeManagementSystem;

import java.util.Scanner;
import java.util.ArrayList;

public class Company {

    private ArrayList<Employee> employees = new ArrayList<>();

    public void addEmployee(String name, int id, int salary, boolean active){

        Employee employee = new Employee(name, id, salary, active);
        employees.add(employee);

        System.out.println("Employee successfully added.");
    }

    public void removeEmployee(int id){

        boolean found = false;

        if(employees.isEmpty()){
            System.out.println("No employees present");
        } else{

            for(int i=0; i<employees.size(); i++){
                Employee employee = employees.get(i);
                if(id == employee.getId()){
                    found = true;

                    System.out.println("Successfully removed employee with name: " + employee.getName() );
                    employees.remove(i);

                    break;
                }
            }

            if(!found){
                System.out.println("Employee with id no " + id + " not found.");
            }

        }

    }

    public void searchEmployee(int id){

        if(employees.isEmpty()){
            System.out.println("There are no employees present.");
        } else {
            boolean found = false;

        }

    }

    public void displayEmployees(){

        for(Employee employee: employees){
            System.out.println(employee);
        }

    }

}
