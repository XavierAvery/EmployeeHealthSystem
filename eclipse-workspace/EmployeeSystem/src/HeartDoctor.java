
public class HeartDoctor extends Doctor{
	  public int numHeartSugery;

	  // constructor
	  public HeartDoctor(String name, String hireDate, String email, double annSalary,int numHeartSugery){
	    super(name, hireDate, email, annSalary);
	    this.numHeartSugery = numHeartSugery;
	  }

	  // behaviors
	  @Override
	  public String toString(){
	    return "Doctor " + this.name + " has had " + this.numHeartSugery + " successful open heart surgeries!";
	  }

	  @Override
	  public String speak(){
	    return "Hello I'm doctor " + this.name + ", I will be performing a heart check up for common heart problems and proceeding as necessary.";
	  }

	  public void performHeartCheck(){
	    System.out.println("Your heart is all better after the different heart checks I just ran. \nHave a great day!");
	  }
	  
}
