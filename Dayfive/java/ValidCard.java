import java.util.Scanner;
public class ValidCard{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter account number: ");
		String accountNumber = input.next();

		if(accountNumber.length() != 19)System.out.print("False");

		int counter = 0;
		for(int count = 4; count<18;count+=5){
			if(accountNumber.charAt(count) == '-'){
				counter++;
			}
		}
		
		if(accountNumber.length() == 19){
			if(accountNumber.charAt(0) == '4'||accountNumber.charAt(0) == '5'||accountNumber.charAt(0) == '6'){
				if(counter == 3){
					System.out.print("True");
				}
				else{System.out.print("False");}
			}
			else{System.out.print("False");}
		}
		else{System.out.print("False");
		}	
	}
}
