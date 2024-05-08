public class TaskSix{
	public static int elementOfEvenIndex(int[] arrayPassedIn){
		int sum = 0;
		for(int count = 0; count<10;count++){
			if(count%2==0){
				sum += arrayPassedIn[count];
			}
		}
	return sum;
	}
}