package com.java.lambda;

public class ConstructorReferenceUsingEmployeeClass {
    public static void main(String[] args) {
    EmployeeGenerator generator=Employee::new;
    Employee emp=generator.createEmployee("Narender");
    System.out.println(
            emp.getFirstName()
    );
    }
}
class Employee{
    String firstName;
    public Employee() {
        System.out.println("No arg constructor");
    }

    public  Employee(String firstName){
        System.out.println("Argumented contructor");
        this.firstName=firstName;
    }

    public String getFirstName() {
        return firstName;
    }
}

@FunctionalInterface
interface EmployeeGenerator{
    Employee createEmployee(String firstName);
}