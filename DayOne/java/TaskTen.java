import java.util.Scanner;
public class TaskTen{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int adding = 0;
		int counter = 1;
		for(int count = 0; count<10;count++){
			System.out.println("Enter score: ");
			int score = input.nextInt();
			if(score>0 && score<100){
				adding += score;
				counter++	
			}
		}
		int average = adding/counter;
		System.out.print(average);
	}
}