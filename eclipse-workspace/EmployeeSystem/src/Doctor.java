
public class Doctor extends Employee{
	// variables
	  public double annSalary;

	  // constructors
	  public Doctor(String name, String hireDate, String email, double annSalary){
	    super(name, hireDate, email);
	    this.annSalary = annSalary;
	  }

	  // behaviors
	  @Override
	  public String toString(){
	    return "Doctor " + this.name + " was hired on " + this.hireDate + " making $" + this.annSalary + " a year." ;
	  }

	  @Override
	  public String speak(){
	    return "Hello I'm doctor " + this.name + ", are you feeling sick today or have any symptoms that are similar? YES or NO?\n";
	  }

	  public void prescribeMeds(){
	    System.out.println("I sent you medicine for your symptoms to your local pharmacy address.");
	    System.out.println("Get better!");
	  }

	  public void performCheckUp(){
	    System.out.println("Doctor " + this.name + " performs a routine check up.\nHave a nice day and stay healthy!");
	  }

}
