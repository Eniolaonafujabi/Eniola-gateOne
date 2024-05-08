public class TaskSixteen{
	public static void main(String[] args){
		for(int counter = 1; counter<=10;counter++){
			if(counter%4==0){
				System.out.print(counter);
				for(int count = 0; count<4; count++){
					System.out.print(counter);
				}
			}
		}
	}
}
