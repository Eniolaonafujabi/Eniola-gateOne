public class TaskFour{
	public static int[] elementOfEvenIndex(int[] arrayPassedIn){
		int[] evenIndex = new int[arrayPassedIn/2];
		int counter = 0;
		for(int count = 0; count<10;count++){
			if(count%2==0)
				evenIndex[counter] = arrayPassedIn[count];
				counter++;
		}
	}
}