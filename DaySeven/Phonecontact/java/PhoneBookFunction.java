import java.util.Scanner;
import java.util.ArrayList;
public class PhoneBookFunction{
	private Scanner collector = new Scanner(System.in);
	ArrayList<String> firstName = new ArrayList<String>();
	ArrayList<String> lastName = new ArrayList<String>();
	ArrayList<String> email = new ArrayList<String>();
	ArrayList<String> phoneBook = new ArrayList<String>();
	public void addContact(){
		System.out.println("How many contact do you want to store: ");
		int numberOfcontactToBeStored = collector.nextInt();
		for(int count = 0; count<numberOfcontactToBeStored;count++){
			System.out.println("Enter first name: ");
			firstName.add(collector.next());
			System.out.println("Enter last name: ");
			lastName.add(collector.next());
			System.out.println("Enter email: ");
			email.add(collector.next());
			System.out.println("Enter phoneNumber: ");
			phoneBook.add(collector.next());
		}
			System.out.println("Do you want to continue");
			String ifUserWantToContinue = collector.next();
			if(ifUserWantToContinue.equalsIgnoreCase("yes"))phoneBookOption();
			if(ifUserWantToContinue.equalsIgnoreCase("no"))System.out.println("EXIT");
	}
	public void removeContact(){
		System.out.println("Enter the first name of the contact: ");
		String firstNameOfContactToBeDeleted = collector.next();
		System.out.println("Enter the last name of the contact: ");
		String lastNameOfContactToBeDeleted = collector.next();
		System.out.println("Enter the  contact: ");
		String contactInputed = collector.next();
		int counter = firstName.size()-1;
		if(firstName.size() == 0)System.out.println("Can,t delete a contact that is not in the phone book input correct names next time");
		for(int count = 0; count<firstName.size();count++){
			if(phoneBook.get(count).equals(contactInputed)){
				firstName.remove(count);
				lastName.remove(count);
				phoneBook.remove(count);
				email.remove(count);
				counter--;
			}
		}
			if(counter==firstName.size()-1)System.out.println("Can,t delete a contact that is not in the phone book input correct names next time");
			System.out.println("Do you want to continue");
			String ifUserWantToContinue = collector.next();
			if(ifUserWantToContinue.equalsIgnoreCase("yes"))phoneBookOption();
			if(ifUserWantToContinue.equalsIgnoreCase("no"))System.out.println("EXIT");
	}
	public void findContactByFirstName(){
		System.out.println("Enter the first name of the contact: ");
		String firstNameOfContactToSearchfor = collector.next();
		int counter = firstName.size()-1;
		if(firstName.size() == 0)System.out.println("Can,t delete a contact that is not in the phone book input correct names next time");
		for(int count = 0; count<firstName.size();count++){
			if(firstName.get(count).equals(firstNameOfContactToSearchfor)){
				System.out.printf("First Name: %s%nLast Name: %s%nPhone Number: %s%nEmail: %s%n",firstName.get(count),lastName.get(count),phoneBook.get(count),email.get(count));
				counter--;
			}
		}
			if(counter == firstName.size()-1)System.out.println("Contact Not found");
			System.out.println("Do you want to continue");
			String ifUserWantToContinue = collector.next();
			if(ifUserWantToContinue.equalsIgnoreCase("yes"))phoneBookOption();
			if(ifUserWantToContinue.equalsIgnoreCase("no"))System.out.println("EXIT");
	}
	public void findContactByLastName(){
		System.out.println("Enter the last name of the contact: ");
		String lastNameOfContactToSearchFor = collector.next();
		int counter = firstName.size()-1;
		if(firstName.size() == 0)System.out.println("Can,t delete a contact that is not in the phone book input correct names next time");
		for(int count = 0; count<lastName.size();count++){
			if(lastName.get(count).equals(lastNameOfContactToSearchFor)){
				System.out.printf("First Name: %s%nLast Name: %s%nPhone Number: %s%nEmail: %s%n",firstName.get(count),lastName.get(count),phoneBook.get(count),email.get(count));
				counter--;
			}
		}
			if(counter == firstName.size()-1)System.out.println("Contact Not found");
			System.out.println("Do you want to continue");
			String ifUserWantToContinue = collector.next();
			if(ifUserWantToContinue.equalsIgnoreCase("yes"))phoneBookOption();
			if(ifUserWantToContinue.equalsIgnoreCase("no"))System.out.println("EXIT");
	}
	public void findContactByPhoneNumber(){
		System.out.println("Enter phone number: ");
		String  phoneNumberCheacking = collector.next();
		int counter = firstName.size()-1;
		if(firstName.size() == 0)System.out.println("Can,t delete a contact that is not in the phone book input correct names next time");
		for(int count = 0; count<lastName.size();count++){
			if(phoneBook.get(count).equals(phoneNumberCheacking)){
				System.out.printf("First Name: %s%nLast Name: %s%nPhone Number: %s%nEmail: %s%n",firstName.get(count),lastName.get(count),phoneBook.get(count),email.get(count));
				counter--;
			}
		}
			if(counter == firstName.size()-1)System.out.println("Contact Not found");
			System.out.println("Do you want to continue");
			String ifUserWantToContinue = collector.next();
			if(ifUserWantToContinue.equalsIgnoreCase("yes"))phoneBookOption();
			if(ifUserWantToContinue.equalsIgnoreCase("no"))System.out.println("EXIT");
	}
	public void editContact(){
		System.out.println("Enter the first name of the contact: ");
		String firstNameOfContactToBeEdited = collector.next();
		System.out.println("Enter the last name of the contact: ");
		String lastNameOfContactToBeEdited = collector.next();
		int counter = firstName.size();
		if(firstName.size() == 0)System.out.println("Can,t delete a contact that is not in the phone book input correct names next time");
		for(int count = 0; count<firstName.size();count++){
			if(firstName.get(count).equals(firstNameOfContactToBeEdited) && lastName.get(count).equals(lastNameOfContactToBeEdited)){
				System.out.println("Enter first name: ");
				String newFirstName = collector.next();
				firstName.set(count,newFirstName);
				System.out.println("Enter last name: ");
				String newLastName = collector.next();
				lastName.set(count,newLastName);
				String newPhoneBook = collector.next();
				phoneBook.set(count,newPhoneBook);
				System.out.println("Enter email: ");
				String newEmail = collector.next();
				email.set(count,newEmail);
				counter--;
			}	
		}
			if(counter == firstName.size()-1)System.out.println("Contact Not found");
			System.out.println("Do you want to continue");
			String ifUserWantToContinue = collector.next();
			if(ifUserWantToContinue.equalsIgnoreCase("yes"))phoneBookOption();	
			if(ifUserWantToContinue.equalsIgnoreCase("no"))System.out.println("EXIT");
	}

	public void searchAllContact(){
		for(int count = 0; count<firstName.size();count++){
		System.out.println(firstName.get(count));
		System.out.println(lastName.get(count));
		System.out.println(email.get(count));
		System.out.println(phoneBook.get(count));
		}
			System.out.println("Do you want to continue");
			String ifUserWantToContinue = collector.next();
			if(ifUserWantToContinue.equalsIgnoreCase("yes"))phoneBookOption();	
			if(ifUserWantToContinue.equalsIgnoreCase("no"))System.out.println("EXIT");
	}

	public void phoneBookOption(){
		String phoneBookOption = """
			1 -> Add contact
			2 -> Remove contact
			3 -> Find Contact By phone number
			4 -> Find Contact By first name
			5 -> Find Contact By last name
			6 -> Show all contact 			
			7 -> Exit  
		""";
			System.out.println(phoneBookOption);
			int userinput = collector.nextInt();
		switch(userinput){
			case 1: addContact();
			break;
			case 2: removeContact();
			break;
			case 3: findContactByPhoneNumber();
			break;
			case 4: findContactByFirstName();
			break;
			case 5: findContactByLastName();
			break;
			case 6: searchAllContact();
			break;
			case 7: System.out.println("Exit");
		}
	}

	
}	