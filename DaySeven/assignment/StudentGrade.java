import java.util.*;
public class StudentGrade{
	public static void main(String[] args){
		Scanner collector = new Scanner(System.in);
		System.out.println("How many student do you have: ");
			int numberOfStudent = collector.nextInt();
		System.out.println("How many subject do they offer: ");
			int numberOfSubject = collector.nextInt();
		System.out.printf("Saving >>>>>>>>>>>>>>>>>>>>>>>%nSaved Successfully%n%n");
		int[][] nameAndGradeOfStudent = new int[numberOfStudent][numberOfSubject];
		int number = 0;
		for(int row = 0; row<numberOfStudent;row++){
			number++;
			int number1 = 1;
			for(int column = 0; column<numberOfSubject;){
				System.out.printf("Entering score for Student%d:%n",number);
				System.out.printf("Enter score for Subject%d:%n ",number1);
				int score = collector.nextInt();
				if(score>0 && score<=100){
					nameAndGradeOfStudent[row][column] = score;
					System.out.printf("Saving >>>>>>>>>>>>>>>>>>>>>>>%nSaved Successfully%n%n");
					number1++;
					column++;
				}
				else{System.out.printf("Wrong Score >>>>>>>>>>>>>>>>>>>>>>>%nUnSaved%n%n");}; 
			}	
		}

		int[] total = new int[numberOfStudent];	
		int[] average = new int[numberOfStudent];
		for(int row = 0; row<numberOfStudent;){
		int total1 = 0;
			for(int column = 0; column<numberOfSubject;column++){
				total1 += nameAndGradeOfStudent[row][column];
				total[row] = total1;				
			}
			row++;
		}
		for(int count = 0; count<total.length;count++){
			average[count] = total[count] / numberOfSubject;					
		}
		int[] position = Sort.postioning(total);

		System.out.printf("======================================================================================%n");

		System.out.printf("%s","Student");
		for(int count = 1; count<=numberOfSubject;count++){
			System.out.printf("%10s%d","sub",count);
		}
		System.out.printf("%10s%10s%10s%n","Total","Average","Position");	
		System.out.printf("======================================================================================%n");
		int count1 = 1;
		int count2 = 1;
		int count = 0;
		for(int row = 0; row<numberOfStudent;row++){
			System.out.printf("%n%s%1d","Student",count1);
			count1++;
			for(int column = 0; column<numberOfSubject;column++){
				System.out.printf("%10d",nameAndGradeOfStudent[row][column]);
			} 
			for(; count<count2; count++){
				if(count2 == numberOfStudent+1) break;
				System.out.printf("%10d",total[count]);
				System.out.printf("%10d",average[count]);
				System.out.printf("%10d%n",position[count]);
			}
			count2++;
		}
		System.out.printf("======================================================================================%n%n");
		System.out.printf("======================================================================================%n%n");

		int[] highestStudentInASubject = new int[numberOfStudent];
		int[] lowestStudentInASubject = new int[numberOfStudent];
		int[] highestScoreInASubject = new int[numberOfSubject];
		int[] lowestScoreInASubject = new int[numberOfSubject];
		int[] averageScoreForEachSubject = new int[numberOfSubject];
		int[] totalScoreForEachSubject = new int[numberOfSubject];
		int[] numberOfPassesInSubject = new int[numberOfSubject];
		int[] numberOfFailsInASubject = new int[numberOfSubject];
		int counter1 = -1;
		for(int count5 = 0; count5<numberOfSubject;count++){
			int max = nameAndGradeOfStudent[0][count5];
			int min = nameAndGradeOfStudent[0][count5];
			counter1++;
			int numberOfPeoplePassed = 0;
			int numberOfPeopleFailed = 0;
			int totalScoreForEachSubjectForStudent = 0;
			for(int counter = 0; counter<numberOfStudent;counter++){
				if(nameAndGradeOfStudent[counter][count5]>max){
					max = nameAndGradeOfStudent[counter][count5];
					highestScoreInASubject[counter1] = max;
					highestStudentInASubject[counter1] = counter+=1;
					counter-=1;
				}
				if(nameAndGradeOfStudent[counter][count5]<min){
					min = nameAndGradeOfStudent[counter][count5];
					lowestScoreInASubject[counter1] = min;
					lowestStudentInASubject[counter1] = counter+=1;
					counter-=1;
				}
				if(nameAndGradeOfStudent[counter][count5]>=50)numberOfPeoplePassed++;
				if(nameAndGradeOfStudent[counter][count5]<50)numberOfPeopleFailed++;
				totalScoreForEachSubjectForStudent+=nameAndGradeOfStudent[counter][count5];
			}	
			numberOfPassesInSubject[counter1] = numberOfPeoplePassed;
			numberOfPassesInSubject[counter1] = numberOfPeopleFailed;
			totalScoreForEachSubject[counter1] = totalScoreForEachSubjectForStudent;
			averageScoreForEachSubject[counter1] = totalScoreForEachSubjectForStudent/numberOfStudent;
		}
		System.out.println(Arrays.toString(highestStudentInASubject));
		System.out.println(Arrays.toString(lowestStudentInASubject));
		System.out.println(Arrays.toString(highestScoreInASubject));
		System.out.println(Arrays.toString(lowestScoreInASubject));
		System.out.println(Arrays.toString(averageScoreForEachSubject));
		System.out.println(Arrays.toString(totalScoreForEachSubject));
		System.out.println(Arrays.toString(numberOfPassesInSubject));
		System.out.println(Arrays.toString(numberOfFailsInASubject));
	}
}