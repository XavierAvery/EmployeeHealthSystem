package employeehospital;


import employeehospital.Employee;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


//import Employee;

/**
 *
 * @author xavier
 */
public class Nurse extends Employee {
    // Attributes
    private String name;
    private int id;
    private String email;
    
    // Constructor
    public Nurse(String name, int id, String e){
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
        System.out.println("Nurses help Doctors save lives!");
    }
}
