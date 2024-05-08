import java.util.Scanner;
import java.util.Random;
public class TaskOne{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		Random randomNumber = new Random();
		int countForSuccess = 0;
		int countForFailure = 0;
		int countForQuestion = 1;
		for(int count = 0; count<10;count++){
			int numbers = randomNumber.nextInt(50);
			int number2 = randomNumber.nextInt(20);
			int answerToUpComingQuestion = numbers * number2;
			System.out.printf("Question Number%d is   %d*%d%n",countForQuestion,numbers,number2);
			int answedReceived = input.nextInt();
			countForQuestion++;
			if(answedReceived == answerToUpComingQuestion){
				countForSuccess++;
				System.out.println("Correct");
			}
			else{
				System.out.println("Incorrect");
				countForFailure++;
			}
		}
		System.out.printf("Your Success is %d%n",countForSuccess);
		System.out.printf("Your failure is %d%n",countForFailure);
	}
}