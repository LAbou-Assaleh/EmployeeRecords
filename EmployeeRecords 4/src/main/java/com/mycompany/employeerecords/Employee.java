/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeerecords;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 *
 * @author leo
 */
public class Employee {
    // Create class variables.
    private int employeeID;
    private String firstName, lastName, startDate;
    private double annualSalary;
    // Intalize class variables;
    public Employee(int employeeID, String firstName, String lastName, String startDate, double annualSalary) {
        this.employeeID = employeeID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.startDate = startDate;
        this.annualSalary = annualSalary;
    }

    // Setters Getters and toString methods.
    public int getEmployeeID() {
        return employeeID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    
    public double getAnnualSalary() {
        return annualSalary;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
}
