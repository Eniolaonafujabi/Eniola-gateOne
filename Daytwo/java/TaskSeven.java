public class TaskSeven{
	public static int sumOfElementOfOddIndex(int[] arrayPassedIn){
		int sum = 0;
		for(int count = 0; count<10;count++){
			if(count%2==1){
				sum += arrayPassedIn[count];
			}
		}
	return sum;
	}
}