import java.util.Scanner;
public class TaskOne{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int adding = 0;
		for(int count = 0; count<10;count++){
			System.out.println("Enter score: ");
			int score = input.nextInt();
			adding += score;
		}
		System.out.print(adding);
	}
}