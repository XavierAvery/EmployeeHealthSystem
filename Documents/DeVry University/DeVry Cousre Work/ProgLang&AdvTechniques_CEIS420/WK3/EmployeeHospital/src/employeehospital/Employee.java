package employeehospital;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author xavier
 */
public abstract class Employee {
    public abstract String getName();
    public abstract int getID();
    public abstract String getEmail();
    public abstract void slogan();
    //public abstract DateTime getBirthday();
    //public abstract DateTime getHireDate();
    
    @Override
    public String toString(){
        return "Employee Name: " + this.getName() + "\nID: " + this.getID() + "\nEmail: " + this.getEmail(); 
               // + "\nBirthday: " + this.getBirthday() + "\nHireDate: " + this.getHireDate();
    }
}
