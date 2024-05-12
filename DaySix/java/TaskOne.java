import java.time.LocalDate;
public class TaskOne{
	public static int knowYourAge(String dateOfBirth){ 
		//LocalDate currentDate = new LocalDate();
		int currentYear = LocalDate.getYear();
		int currentMonth = LocalDate.getMonth();
		String yearInputed = dateOfBirth.substring(6,9);
		String monthInputed = dateOfBirth.substring(3,4);
		int yearGotten = Integer.parseInt(yearInputed);
		int monthGotten = Integer.parseInt(monthInputed);
		int counter = 0;
		for(; yearGotten!= currentYear;counter++){
		}
		if(currentMonth<monthGotten)counter--;
	return counter;	
	}
	
}
