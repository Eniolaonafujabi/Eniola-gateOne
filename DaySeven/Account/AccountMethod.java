import java.util.Scanner;
import java.util.ArrayList;
public class AccountMethod{
	private Scanner collector = new Scanner(System.in);
	ArrayList<String> firstName = new ArrayList<String>();
	ArrayList<String> lastName = new ArrayList<String>();
	ArrayList<String> pin = new ArrayList<String>();
	public void createAccount(){
		System.out.println("Enter Account first name: ");
		firstName.add(collector.next());
		System.out.println("Enter Account last name: ");
		lastName.add(collector.next());
		createPin();
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
			}	
		}
	}
}