import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
public class MenstrationFunction{
	public static int menstration(int yearAndFirstDayOfYourLastMenstration,int monthAndFirstDayOfYourLastMenstration,int dayAndFirstDayOfYourLastMenstration,int yearAndLastDayOfYourLastMenstration,int monthAndLastDayOfYourLastMenstration,int dayAndLastDayOfYourLastMenstration,long averageCycle){
		LocalDate lastMenstrationDayFirstDay = LocalDate.of(yearAndFirstDayOfYourLastMenstration,monthAndFirstDayOfYourLastMenstration,dayAndFirstDayOfYourLastMenstration);
		LocalDate lastMenstrationDayLastDay = LocalDate.of(yearAndLastDayOfYourLastMenstration,monthAndLastDayOfYourLastMenstration,dayAndLastDayOfYourLastMenstration);
		LocalDate nextPeriod = lastMenstrationDayFirstDay.plusDay(averageCycle);
	return nextPeriod;
	}

	public static int menstration(int yearAndFirstDayOfYourLastMenstration,int monthAndFirstDayOfYourLastMenstration,int dayAndFirstDayOfYourLastMenstration,int yearAndLastDayOfYourLastMenstration,int monthAndLastDayOfYourLastMenstration,int dayAndLastDayOfYourLastMenstration,long averageCycle){
		LocalDate lastMenstrationDayFirstDay = LocalDate.of(yearAndFirstDayOfYourLastMenstration,monthAndFirstDayOfYourLastMenstration,dayAndFirstDayOfYourLastMenstration);
		LocalDate lastMenstrationDayLastDay = LocalDate.of(yearAndLastDayOfYourLastMenstration,monthAndLastDayOfYourLastMenstration,dayAndLastDayOfYourLastMenstration);
		long consLengthToGetOvulation = 14;
		long ovulation = averageCycle - consLengthToGetOvulation;
		LocalDate ovulationPerion = lastMenstrationDayFirstDay.plusDay(ovulation);
	return ovulationPerion;
	}
}