import java.util.Scanner;
public class TaskFour{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int adding = 0;
		int count = 1;
		for(; count<=10;count++){
			System.out.println("Enter score: ");
			int score = input.nextInt();
			if(count%2==0){
			adding += score;
			}
		}
		System.out.print(adding);
	}
}