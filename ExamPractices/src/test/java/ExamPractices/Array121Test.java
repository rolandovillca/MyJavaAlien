package ExamPractices;

import org.junit.Test;
import static org.junit.Assert.*;

public class Array121Test {
	@Test
	public void testArray121() {
		App classUnderTest = new App();
        assertNotNull("app should have a greeting", classUnderTest.getGreeting());
	}
}

