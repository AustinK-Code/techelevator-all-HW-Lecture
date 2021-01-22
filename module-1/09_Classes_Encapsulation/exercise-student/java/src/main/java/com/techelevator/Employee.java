package com.techelevator;

public class Employee {

    private int employeeId;
    private String firstName;
    private String lastName;
    private double salary;
    private String department;

    //constructor
    public Employee(int employeeId, String firstName, String lastName, double salary){
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }
    public int getEmployeeId(){
        return employeeId;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    //derived, do some operations
    public String getFullName(){
        String fullName = lastName + ", " + firstName;
        return fullName;
    }
    public String getDepartment(){
        return department;
    }
    public void setDepartment(String department){
        this.department = department;
    }
    public double getAnnualSalary(){
        return salary;
    }
    public void raiseSalary(double percent){
        salary = salary + (salary) * (percent / 100);
    }







}
