import java.util.Scanner;
public class TaskThree{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int[] score = new int[10];
		for(int count = 0; count<10;count++){
			System.out.println("Enter score: ");
			score[count] = input.nextInt;
		} 
		for(int count = 0; count<10;count++){
			System.out.println(score[count]);
		}
	}
}