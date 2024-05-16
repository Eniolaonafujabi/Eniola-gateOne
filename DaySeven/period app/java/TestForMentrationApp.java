import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class TestForMentrationApp{

	@Test
	public void testThatPeriodDateIsCorrect(){
		int periodDate = MenstrationFunction.menstration(2024,12,05,28);
		int expectedDate = 2024,10,6;
		AssertEquals(periodDate,expectedDate);
	} 


	@Test
	public void testThatOvulationDateIsCorrect(){
		int periodDate = MenstrationFunction.menstration(2024,12,05,28);
		int expectedDate = 2024,26,05;
		AssertEquals(periodDate,expectedDate);
	} 
}