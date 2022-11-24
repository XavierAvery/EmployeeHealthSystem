package employeehospital;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import employeehospital.Employee;

/**
 *public abstract String getName();
    public abstract int getID();
    public abstract String getEmail();
    public abstract DateTime getBirthday();
    public abstract DateTime getHireDate();
 * @author xavier
 */
public class Doctor extends Employee {
    // Attributes
    private String name;
    private int id;
    private String email;
    
    // Constructor
    public Doctor(String name, int id, String e){
        this.name=name;
        this.id=id;
        email=e;  // check the difference 
    }
    
    // Methods
    @Override
    public String getName(){
        return this.name;
    }
    
    @Override
    public int getID(){
        return this.id;
    }
    
    @Override
    public String getEmail(){
        return this.email;
    }
    
    public void slogan(){
        System.out.println("Doctors Save Lives!");
    }
    
}
