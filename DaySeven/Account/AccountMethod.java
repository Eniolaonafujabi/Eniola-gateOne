import java.util.Scanner;
import java.util.ArrayList;
public class AccountMethod{
	private Scanner collector = new Scanner(System.in);
	ArrayList<String> firstName = new ArrayList<String>();
	ArrayList<String> lastName = new ArrayList<String>();
	ArrayList<String> pin = new ArrayList<String>();
	ArrayList<Double> balance = new ArrayList<Double>();
 	public void createAccount(){
		System.out.println("Enter Account first name: ");
		firstName.add(collector.next());
		System.out.println("Enter Account last name: ");
		lastName.add(collector.next());
		createPin();
		balance.add(0.0);
	}

	public void createPin(){
		do{
		System.out.println("Create new pin Enter only 4 digit: ");
		String newPin = collector.next();
		if(newpin.length()==4)pin.add(newPin);
		while(newpin.length()==4);
	}

	public void closeAccount(){
		System.out.println("Enter your account first name: ");
		String accountFirstName = collector.next();
		System.out.println("Enter your account last name: ");
		String accountLastName = collector.next();
		int counter = firstName.size();
		for(int count = 0; count<firstName.size();count){
			if(firstName.get(count).equals(accountFirstName)){
				System.out.println("Enter pin");
				String pinInputed = collector.next();
				for(int counter = 0; counter<pin.size();counter++){
					if(pin.get(counter).equals(pinInputed)){
						firstName.remove(counter)
						lastName.remove(counter)
						pin.remove(counter);	
					}
				}
			}	
		}
	}

	public void depositMoney(){
		System.out.println("Enter your account first name: ");
		String accountFirstName = collector.next();
		System.out.println("Enter your pin: ");
		String pinInputed = collector.next();
		for(int count = 0; count<firstName.size();count++){
			if(firstName.get(count).equals(accountFirstName)&&pin.get(counter).equals(pinInputed)){
				System.out.println("How much do you want to deposit: ");
				double moneyDeposited = collector.nextDouble();
				if(moneyDeposited>0)balance.set(counter,moneyDeposited+balance.get(count));		
			}	
		}		
	}

	public void withdrawMoney(){
		System.out.println("Enter your account first name: ");
		String accountFirstName = collector.next();
		System.out.println("Enter your pin: ");
		String pinInputed = collector.next();
		for(int count = 0; count<firstName.size();count++){
			if(firstName.get(count).equals(accountFirstName)&&pin.get(counter).equals(pinInputed)){
				System.out.println("How much do you want to withdraw: ");
				double moneywithdraw = collector.nextDouble();
				if(moneydraw<=balance.get(count))balance.set(counter,moneywithdraw-balance.get(count));		
			}	
		}		
	}
}