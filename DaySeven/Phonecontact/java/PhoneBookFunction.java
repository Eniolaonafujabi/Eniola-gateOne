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
	}
	public void removeContact(){
		System.out.println("Enter the first name of the contact: ");
		String firstNameOfContactToBeDeleted = collector.next();
		System.out.println("Enter the last name of the contact: ");
		String lastNameOfContactToBeDeleted = collector.next();
		int counter = 0;
		for(int count = 0; count<firstName.size();count++){
			if(firstName.get(count).equals(firstNameOfContactToBeDeleted) && lastName.get(count).equals(lastNameOfContactToBeDeleted)){
				firstName.remove(count);
				lastName.remove(count);
				phoneBook.remove(count);
				email.remove(count);
				counter++;
			}
			if(counter<firstName.size()-1)System.out.println("Can,t delete a contact that is not in the phone book input correct names next time");
		}
	}
	public void findContactByFirstName(){
		System.out.println("Enter the first name of the contact: ");
		String firstNameOfContactToSearchfor = collector.next();
		int counter = 0;
		for(int count = 0; count<firstName.size();count++){
			if(firstName.get(count).equals(firstNameOfContactToSearchfor)){
				System.out.printf("First Name: %s%nLast Name: %s%nPhone Number: %d%nEmail: %s%n",firstName.get(count),lastName.get(count),phoneBook.get(count),email.get(count));
				counter++;
			}
			if(counter == firstName.size()-1)System.out.print("Contact Not found");
		}
	}
	public void findContactByLastName(){
		System.out.println("Enter the last name of the contact: ");
		String lastNameOfContactToSearchFor = collector.next();
		int counter = 0;
		for(int count = 0; count<lastName.size();count++){
			if(lastName.get(count).equals(lastNameOfContactToSearchFor)){
				System.out.printf("First Name: %s%nLast Name: %s%nPhone Number: %d%nEmail: %s%n",firstName.get(count),lastName.get(count),phoneBook.get(count),email.get(count));
				counter++;
			}
			if(counter == firstName.size()-1)System.out.print("Contact Not found");
		}
	}
	public void findContactByPhoneNumber(){
		System.out.println("Enter phone number: ");
		String  phoneNumberCheacking = collector.next();
		int counter = 0;
		for(int count = 0; count<lastName.size();count++){
			if(phoneBook.get(count).equals(phoneNumberCheacking)){
				System.out.printf("First Name: %s%nLast Name: %s%nPhone Number: %d%nEmail: %s%n",firstName.get(count),lastName.get(count),phoneBook.get(count),email.get(count));
				counter++;
			}
			if(counter == firstName.size()-1)System.out.print("Contact Not found");
		}
	}
	public void editContact(){
		System.out.println("Enter the first name of the contact: ");
		String firstNameOfContactToBeEdited = collector.next();
		System.out.println("Enter the last name of the contact: ");
		String lastNameOfContactToBeEdited = collector.next();
		int counter = 0;
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
			}	
		}	
	}
}	