package employeehospital;


import employeehospital.Employee;
import employeehospital.Doctor;
import employeehospital.Admin;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author xavier
 */
public class EmployeeManager {
    public Employee getEmployee(String EmployeeType, String name, int id, String email){
        // Create Object
        if(EmployeeType.equalsIgnoreCase("DOCTOR"))
            return new Doctor(name, id, email);
        else if(EmployeeType.equalsIgnoreCase("ADMIN"))
            return new Admin(name, id, email);
        else if(EmployeeType.equalsIgnoreCase("NURSE"))
            return new Nurse(name, id, email);
        else if(EmployeeType.equalsIgnoreCase("JANITOR"))
            return new Janitor(name, id, email);
        else
            return null;
    }
}
