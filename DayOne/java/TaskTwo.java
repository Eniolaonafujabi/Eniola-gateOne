import java.util.Scanner;
public class TaskTwo{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int adding = 0;
		int count = 1;
		for(; count<11;count++){
			System.out.println("Enter score: ");
			int score = input.nextInt();
			adding += score;
		}
		int average = adding/count;
		System.out.print(average);
	}
}