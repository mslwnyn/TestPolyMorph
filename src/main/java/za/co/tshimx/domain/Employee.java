package za.co.tshimx.domain;

import za.co.tshimx.interfaces.EmployeeDetails;
import za.co.tshimx.interfaces.Remumerable;

/**
 *
 * @author tshimologo
 */
public class Employee implements Comparable,EmployeeDetails,Remumerable{  
    
    private int employeeId;
    private String firstName;
    private String lastName;
    private Address Address;
    private String emailAddress;
    
    
    public Employee (int employeeId,String firstName,String lastName  ){
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;        
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Address getAddress() {
        return Address;
    }

    public void setAddress(Address Address) {
        this.Address = Address;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
    
    
    
     public void ComputePay(){
         
     }
  

    @Override
    public int compareTo(Object o) {
        
       Employee  emp = (Employee)o;
       if (this.employeeId> emp.getEmployeeId()){
           return 1;
       }else if(this.employeeId> emp.getEmployeeId() ){
           return 1;
       }else{
           return 0;
       }
           
    }
    
}
