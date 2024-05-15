import java.util.Scanner;
public class CardCalculator4{
	public static void main(String[] args){
		Scanner collector = new Scanner(System.in);
		System.out.println("Please kindly enter account number: ");
		String accountNumberInputed = collector.nextLine();
		char[] digitAccountNo = new char[accountNumberInputed.length()];
		int[] digitIntAccountNo = new int[digitAccountNo.length];
		int num1 = 0;
		int sum = 0;
		int total = 0;
		int mutiple1 = 0;
		int add = 0;
		int odd = 0;
		int sumOfAddAndOdd = 0;	
		for(int count = 0; count<accountNumberInputed.length(); count++){
			digitAccountNo[count] = accountNumberInputed.charAt(count);
		}
		for(int counter = 0; counter<accountNumberInputed.length();counter++){
			digitIntAccountNo[counter] =  digitAccountNo[counter] - '0';
		}
		for(int counter1 = 0; counter1<digitIntAccountNo.length; counter1+=2){	
			int multiple1 = digitIntAccountNo[counter1] * 2;
				if(multiple1<=9){
					add = add + multiple1;
					if(multiple1 % 2 == 0){
						odd = odd + multiple1;
					}
				}
				else{
					if(total >= 10){
						while(total != 0){
							int hold = total % 10;
							sum = sum + hold;
							total /= 10;
						}
					}
					add = add + total;
					if(total % 2 == 1){
						odd = odd + multiple1;
					}
				}				
		}

		sumOfAddAndOdd = add + odd;
		if(accountNumberInputed.length()>=13 && accountNumberInputed.length()<=16 || accountNumberInputed.length()<=13 && accountNumberInputed.length()>=16){
			if(accountNumberInputed.charAt(0) != '4' || accountNumberInputed.charAt(0) != '5' || accountNumberInputed.charAt(0) != '6' || accountNumberInputed.charAt(0) != '3' && accountNumberInputed.charAt(1) !='7'){
				System.out.println("** Credit card type:  invailid ");
				System.out.println("** Credit card number:  "  + accountNumberInputed);
				System.out.println("** Credit card digit length:  "  + accountNumberInputed.length());
				System.out.println("** Credit card number:  "  + accountNumberInputed);
				System.out.println("** Credit card validity status:  invailid ");

			}		
			

		}
		else{
			if(sumOfAddAndOdd % 10==0 && accountNumberInputed.length()>=13 && accountNumberInputed.length()<=16 && accountNumberInputed.charAt(0) == '4'){
				System.out.println("** Credit card type:  Visa Card");
				System.out.println("** Credit card number:  "  + accountNumberInputed);
				System.out.println("** Credit card digit length:  "  + accountNumberInputed.length());
				System.out.println("** Credit card number:  "  + accountNumberInputed);
				System.out.println("** Credit card validity status:  vailid ");
			}
			else{
				if(sumOfAddAndOdd%10==0 && accountNumberInputed.length()>=13 && accountNumberInputed.length()<=16 && accountNumberInputed.charAt(0) == '5'){
					System.out.println("** Credit card type:  Master Card");
					System.out.println("** Credit card number:  "  + accountNumberInputed);
					System.out.println("** Credit card digit length:  "  + accountNumberInputed.length());
					System.out.println("** Credit card number:  "  + accountNumberInputed);
					System.out.println("** Credit card validity status:  vailid ");	

				}
			//}
			else{
				if(sumOfAddAndOdd%10 == 0 && accountNumberInputed.length()>=13 && accountNumberInputed.length()<=16 && accountNumberInputed.charAt(0) == '3'&& accountNumberInputed.charAt(1) == '7'){
					System.out.println("** Credit card type:  American Express card");
					System.out.println("** Credit card number:  "  + accountNumberInputed);
					System.out.println("** Credit card digit length:  "  + accountNumberInputed.length());
					System.out.println("** Credit card number:  "  + accountNumberInputed);
					System.out.println("** Credit card validity status:  vailid ");	

				}
			//}
			else{
				if(sumOfAddAndOdd % 10 == 0 && accountNumberInputed.length()>=13 && accountNumberInputed.length()<=16 && accountNumberInputed.charAt(0) == '6'){
					System.out.println("** Credit card type:  Discover Card");
					System.out.println("** Credit card number:  "  + accountNumberInputed);
					System.out.println("** Credit card digit length:  "  + accountNumberInputed.length());
					System.out.println("** Credit card number:  "  + accountNumberInputed);
					System.out.println("** Credit card validity status:  vailid ");	

				}
			
			}
			}
			}
		}
	
	
	}
}