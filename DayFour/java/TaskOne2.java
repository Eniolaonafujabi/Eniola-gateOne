import java.util.Scanner;
public class TaskOne2{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);	
		char temp = '\0';
		char one = 'x';
		char two = 'o';
		char[] answer = new char[9];
		for(int counter = 0; counter<9;){
			System.out.println("Enter x and o: ");
			char userInput = input.next().charAt(0);
			System.out.println("Enter where you want to place your input between 1 to 9: ");
			int userInputforsport = input.nextInt();
			if(userInput == 'x'  || userInput == 'o'){
				if(userInput != temp){
					if(userInputforsport > 0 || userInputforsport < 100){
						temp = userInput;
						answer[userInputforsport-1] = userInput;
						counter++;
					}
				}
			}
		}
		for(int count = 0; count<=2;count++){
			System.out.printf("%5s",answer[count]);
		}
			System.out.println();
		for(int count = 3; count<=5;count++){
			System.out.printf("%5s",answer[count]);
		}
			System.out.println();
		for(int count = 6; count<=8;count++){
			System.out.printf("%5s",answer[count]);
		}
			System.out.println();

	}
}