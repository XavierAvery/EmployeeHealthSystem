
public class Nurse extends Employee{
	  // variables
	  private double hourlyRate; 
	
	  // constructor
	  public Nurse(String name, String hireDate, String email, double hourlyRate){
	    super(name, hireDate, email);
	    this.hourlyRate = hourlyRate;
	  }
	
	  // behaviors
	  public void takeBloodPressure(){
	    System.out.println("Nurse " + this.name + " took the patients blood pressure.");
	  }
	
	  @Override
	  public String toString(){
	    return "Nurse " + this.name + " was hired on " + this.hireDate + " making $"+ this.hourlyRate + " an hour.\n";
	  }
	
	  @Override
	  public String speak(){
	    return "Hello I'm nurse " + this.name + ", I came to check your blood pressure first.";
	  }
	
	  // getter and setter - Encapsulation
	  public double getHourlyRate(){
	    return hourlyRate;
	  }
	
	  public void setHourlyRate(double hourlyRate){
	    this.hourlyRate = hourlyRate;
	  }

}