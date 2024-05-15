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

	public void changePin(){
		System.out.println("Enter your account first name: ");
		String accountFirstName = collector.next();
		System.out.println("Enter your pin: ");
		String pinInputed = collector.next();
		for(int count = 0; count<firstName.size();count++){
			if(firstName.get(count).equals(accountFirstName)&&pin.get(count).equals(pinInputed)){
				do{
					System.out.println("Create new pin Enter only 4 digit: ");
					String newPin = collector.next();
					if(newpin.length()==4)pin.set(count,newPin);
				while(newpin.length()==4);
			}
		}
	}

	public void closeAccount(){
		System.out.println("Enter your account first name: ");
		String accountFirstName = collector.next();
		System.out.println("Enter your account last name: ");
		String accountLastName = collector.next();
		for(int count = 0; count<firstName.size();count){
			if(firstName.get(count).equals(accountFirstName)){
				System.out.println("Enter pin");
				String pinInputed = collector.next();
				for(int counter = 0; counter<pin.size();counter++){
					if(pin.get(count).equals(pinInputed)){
						firstName.remove(count)
						lastName.remove(count)
						pin.remove(count);	
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
			if(firstName.get(count).equals(accountFirstName)&&pin.get(count).equals(pinInputed)){
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
			if(firstName.get(count).equals(accountFirstName)&&pin.get(count).equals(pinInputed)){
				System.out.println("How much do you want to withdraw: ");
				double moneywithdraw = collector.nextDouble();
				if(moneydraw<=balance.get(count))balance.set(counter,moneywithdraw-balance.get(count));		
			}	
		}		
	}

	public void checkBalance(){
		System.out.println("Enter your account first name: ");
		String accountFirstName = collector.next();
		System.out.println("Enter your pin: ");
		String pinInputed = collector.next();
		for(int count = 0; count<firstName.size();count++){
			if(firstName.get(count).equals(accountFirstName)&&pin.get(count).equals(pinInputed)){
				System.out.println(balance.get(count));
			}
		}
	}

	public void transfer(){
		System.out.println("Enter your account first name: ");
		String accountFirstName = collector.next();
		System.out.println("Enter your pin: ");
		String pinInputed = collector.next();
		int counter1 = firstName.size();
		for(int count = 0; count<firstName.size();count++){
			if(firstName.get(count).equals(accountFirstName)&&pin.get(count).equals(pinInputed)){
				System.out.println("Enter first name of the person you want to transfer to");
				String firstNameTransfer = collector.next();
				System.out.println("Enter second name of the person you want to transfer to");
				String secondNameTransfer = collector.next();
				System.out.println("How much do you want to transfer: ");
				double transfer = collector.nextDouble();
				if(transfer>balance.get(count))System.out.println("Balance not enough ");
				if(transfer<=balance.get(count)){
					balance.set(count,balance.get(count)-transfer)
					for(int counter = 0; counter<firstName.size();counter++){
						if(firstName.get(counter).equals(firstNameTransfer)&&lastName.get(counter).equals(secondNameTransfer)){
							balance.set(counter,balance.get(counter)+transfer);
							counter1--;	
						}
					}
					if(counter1<firstName.size()){
					System.out.println("Account not found");
					balance.set(count,balance.get(count)+transfer);
					}
				}		
			}	
		}		
	}
s
}