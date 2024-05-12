import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class TestForCheckingAge{

	@Test
	public void testToGetAgeFromDateOfBirth(){
	String dateOfBirth = TaskOne.knowYourAge("01-02-2005");
	int expectedSum = 19;
	assertEquals(dateOfBirth,expectedSum);
	}

}