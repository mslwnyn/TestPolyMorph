/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.tshimx.domain;

/**
 *
 * @author tshimologo
 */
public class HourlyEmployee extends Employee{
    
    private int hoursWorked;
    
    public HourlyEmployee(int employeeId, String firstName, String lastName) {
        super(employeeId, firstName, lastName);
    }
    
}
