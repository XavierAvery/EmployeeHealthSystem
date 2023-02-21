
public abstract class Employee {
	// variables  
	  public String name;
	  public String hireDate;
	  public String email;

	  // constructor
	  public Employee(String name, String hireDate, String email){
	    this.name = name;
	    this.hireDate = hireDate;
	    this.email = email;
	  }

	  // behaviors
	  public abstract String toString();

	  public abstract String speak();
}
