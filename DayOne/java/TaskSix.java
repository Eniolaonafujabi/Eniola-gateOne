import java.util.Scanner;
public class TaskSix{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int adding = 0;
		int counter = 1;
		for(int count = 0; count<10;count++){
			System.out.println("Enter score: ");
			int score = input.nextInt();
			if(score%2==0){
			adding += score;
			counter++;
			}
		}
		int average = adding/counter;
		System.out.print(average);
	}
}