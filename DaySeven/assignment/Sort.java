import java.util.Arrays;
public class Sort{
	public static int[] sorting(int[] numbers){	
		int check = 0;
		int checking = 0;
		//int [] sorted = new int[numbers.length];
		for(int row = 0; row<numbers.length;row++){
			for(int column = row+1; column<numbers.length;column++){
				check = numbers[row];
				checking = numbers[column];	
				if(check<checking){
					//sorted[row] = checking;
					numbers[row] = checking;
					numbers[column] = check;
				}			
			}
		}
	return numbers;
	}
	public static int[] postioning(int[]number){
		int[] sorted = sorting(number);
		int[] position = new int[number.length];
		int grades = 0;
		int count2 = -1;
		for(int count = 0; count<number.length;count++){
			for(int count1 = count2+1; count1<number.length;count1++){
				if(sorted[count] == number[count1]){
					position[count1] = grades+=1;
					count2++;			
				}
			}
		}
	return position;
	}


	public static void main(String[] args){
		int[] numbers = {34,34,67};  
			int[] newaa = sorting(numbers);
		System.out.print(Arrays.toString(newaa));
		System.out.print(Arrays.toString(postioning(numbers)));
	}
}