import java.util.Scanner;
public class TaskEight{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int adding = 0;
		for(int count = 0; count<10;){
			System.out.println("Enter score: ");
			int score = input.nextInt();
			if(score>0 && score<100){
				adding += score;
				count++;	
			}
		}
		System.out.print(adding);
	}
}