/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package employeehospital;

/**
 *
 * @author xavier
 */
public class EmployeeHospital {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EmployeeManager em = new EmployeeManager();
        Employee kidneyDoctor = em.getEmployee("doctor", "Xavier", 1, "xavier@xavierhospital.com");
        Employee jan1 = em.getEmployee("Janitor", "Tom", 2, "tom@xavierhospital.com");
        Employee nurse1 = em.getEmployee("NURSE", "Trey", 3, "Trey@xavierhospital.com");
        Employee admin1 = em.getEmployee("AdMiN", "Elisha",4 , "elisha@xavierhospital.com");
        
        System.out.println("Doctor on site: " + kidneyDoctor.getName());
        kidneyDoctor.slogan();
        
        System.out.println();
        
        System.out.println("Email for " + jan1.getName() + " is " + jan1.getEmail());
        
        System.out.println();
        
        System.out.println(nurse1.getName() + " is a nurse that helps Doctors.");
        
        System.out.println();
        
        System.out.println(admin1.getName() + " ID number is " + admin1.getID());
        
        System.out.println();
        
    }
    
}
