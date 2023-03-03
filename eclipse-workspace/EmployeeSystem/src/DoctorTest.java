import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.io.*;

public class DoctorTest {

  @Test
  public void testToString() {
    Doctor doctor = new Doctor("John Doe", "01/01/2022", "johndoe@example.com", 100000.0);
    String expected = "Doctor John Doe was hired on 01/01/2022 making $100000.0 a year.";
    String actual = doctor.toString();
    assertEquals(expected, actual);
  }

  @Test
  public void testSpeak() {
    Doctor doctor = new Doctor("Jane Smith", "01/01/2022", "janesmith@example.com", 120000.0);
    String expected = "Hello I'm doctor Jane Smith, are you feeling sick today or have any symptoms that are similar? YES or NO?\n";
    String actual = doctor.speak();
    assertEquals(expected, actual);
  }

  @Test
  public void testPrescribeMeds() {
    Doctor doctor = new Doctor("David Lee", "01/01/2022", "davidlee@example.com", 90000.0);
    // Use a ByteArrayOutputStream to capture the output of System.out.println() to the console
    // JUnit tests run in a separate process and do not have access to the console output with 'System.out.println()'
    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outContent));
    doctor.prescribeMeds();
    String expected = "I sent you medicine for your symptoms to your local pharmacy address.\nGet better!\n";
    String actual = outContent.toString();
    assertEquals(expected, actual);
    // Reset System.out to its original state
    System.setOut(System.out);
  }

  @Test
  public void testPerformCheckUp() {
    Doctor doctor = new Doctor("Sarah Kim", "01/01/2022", "sarahkim@example.com", 110000.0);
    // Use a ByteArrayOutputStream to capture the output of System.out.println()
    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outContent));
    doctor.performCheckUp();
    String expected = "Doctor Sarah Kim performs a routine check up.\nHave a nice day and stay healthy!\n";
    String actual = outContent.toString();
    assertEquals(expected, actual);
    // Reset System.out to its original state
    System.setOut(System.out);
  }

}

