import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

class HeartDoctorTest {
	
	@Test
	void testToString() {
		HeartDoctor hDoc = new HeartDoctor("Xavier", "", "x....@gmail.com", 200000.00, 30);
		String expected = "Doctor Xavier has had 30 successful open heart surgeries!";
		String actual = hDoc.toString();
		assertEquals(expected, actual);
	}

	@Test
	void testSpeak() {
		HeartDoctor hDoc = new HeartDoctor("Elisha", "", "x....@gmail.com", 200000.00, 30);
		String expected = "Hello I'm doctor Elisha, I will be performing a heart check up for common heart problems and proceeding as necessary.";
		String actual = hDoc.speak();
		assertEquals(expected, actual);
	}

	@Test
	void testPerformHeartCheck() {
		HeartDoctor hDoc = new HeartDoctor("Elisha", "", "x....@gmail.com", 200000.00, 30);
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		hDoc.performHeartCheck();
		String expected = "Your heart is all better after the different heart checks I just ran. \nHave a great day!\n";
		String actual = outContent.toString();
		assertEquals(expected, actual);
		
		// Reset System.out to its original state
	    System.setOut(System.out);
	}

}
