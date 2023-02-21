import java.util.*;

public class EmployeeSystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// employees
		Doctor brayli = new Doctor("Brayli", "01/02/23", "brayli@healthhub.com", 100_000.00);
		HeartDoctor xavier = new HeartDoctor("Xavier", "01/01/23", "xavier@healthhub.com", 200_000.00, 20);
		Nurse elisha = new Nurse("Elisha", "01/03/23", "elisha@healthhub.com", 40.00);

		// collections structures - List of heart problem
		LinkedList<String> heartProblems = new LinkedList<>();
		heartProblems.add("High blood pressure");
		heartProblems.add("Arrhythmia (abnormal heart rhythms)");
		heartProblems.add("Heart failure");
		heartProblems.add("Stroke");

		// Ask patient name and greet them
		System.out.println("Please enter your name.");
		String name = sc.nextLine();
		greet(name);

		System.out.println("\nThe avaliable staff today are:\nDoctor " + brayli.name + "\nDoctor " + xavier.name
				+ "\nNurse " + elisha.name + "\n");

		boolean needResponse = true;
		do {
			System.out.println(
					"Would you like to see a Doctor or Nurse today?(Please enter 'yes' or 'no') \n1. YES \n2. NO\n");

			try {
				String input = sc.nextLine().toUpperCase(); // change toUpperCase for if else statement

				if (input.equals("YES")) {
					do {
						System.out.println(
								"Choose who you think you need to see today out of the options with '1', '2', or '3'.\n1) General Doctor \n2) Heart Doctor \n3) Nurse \n");

						int choice = sc.nextInt();
						switch (choice) {
						// case for Doctor class
						case 1:
							System.out.println(brayli.speak());
							String helpResponse = sc.next().toUpperCase(); // NOTE: check difference b/w next() and
																			// nextLine() here
							if (helpResponse.equals("YES")) { 
								brayli.prescribeMeds();
								needResponse = false;
								break;
							} else {
								System.out.println("Glad you are not sick. I will give you a normal check up.");
								brayli.performCheckUp();
								needResponse = false;
								break;
							}

							// case for HeartDoctor class
						case 2:
							System.out.println("\nDoctor " + xavier.name
									+ " will check your heart for common heart problems.\n\nCommon heart problems are: ");

							// loop through heartProblems for patient
							for (String problem : heartProblems) {
								System.out.println(problem);
							}

							System.out.println();
							System.out.println(xavier.speak());
							System.out.println();
							xavier.performHeartCheck();

							needResponse = false;
							break;
						// case for Nurse class
						case 3:
							System.out.println(elisha.speak());
							System.out.println();
							elisha.takeBloodPressure();
							System.out.println("\nWould you like more information about nurse " + elisha.name
									+ "? (Please enter YES or NO)\n");
							String infoResponse = sc.next().toUpperCase();
							if (infoResponse.equals("YES")) {
								System.out.println(elisha.toString());
								System.out.println("Thanks for coming in and have a blessed day.");
								needResponse = false;
								break;
							} else {
								System.out.println("Thanks for coming in and have a blessed day.");
								needResponse = false;
								break;
							}

						default:
							System.out.println("Invalid input. Please use 1, 2, or 3.");
							needResponse = true;
							// break;
						}
					} while (needResponse);

				} else if (input.equals("NO")) {
					System.out.println("Have a good day and stay updated with your yearly checkups!");
					needResponse = false;
				} else {
					System.out.println("Wrong input! Please use 'YES' or 'NO'.");
				}

			} catch (Exception e) {
				System.out.println("Dodge a bullet!");
			}
		} while (needResponse);

		sc.close();
	} // end main()

	public static void greet(String name) {
		System.out.println("\nWelcome to our health center " + name + "!\nHow can we help you today?");
	} // end greet()

} // end EmployeeSystem class
