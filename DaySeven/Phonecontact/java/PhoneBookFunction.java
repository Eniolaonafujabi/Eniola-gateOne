import java.util.Scanner;
public class PhoneBookFunction{
	private Scanner collector = new Scanner();
	ArrayList<String> firstName = new ArrayList<String>();
	ArrayList<String> lastName = new ArrayList<String>();
	ArrayList<String> email = new ArrayList<String>();
	ArrayList<Interger> phoneBook = new ArrayList<Interger>();
	public void addContact(){
		System.out.println("How many contact do you want to store: ");
		int numberOfcontactToBeStored = collector.nextInt();
		for(int count = 0; count<numberOfcontactToBeStored;count++){
			System.out.println("Enter first name: ");
			firstName[count] = collector.nextLine();
			System.out.println("Enter last name: ");
			lastName[count] = collector.nextLine();
			System.out.println("Enter email: ");
			email[count] = collector.nextLine();
			System.out.println("Enter phoneNumber: ");
			lastName[count] = collector.nextInt();
		}
	}
	public void removeContact(){
		System.out.println("Enter the first name of the contact: ");
		String firstNameOfContactToBeDeleted = collector.next();
		System.out.println("Enter the last name of the contact: ");
		String lastNameOfContactToBeDeleted = collector.next();
		int counter = 0;
		for(int count = 0; count<firstName.size();count++){
			if(firstName[count].equals(firstNameOfContactToBeDeleted) && lastName[count].equals(lastNameOfContactToBeDeleted)){
				firstName[count] = "";
				lastName[count] = "";
				phoneBook[count] = 0;
				email[count] = "";
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
			if(firstName[count].equals(firstNameOfContactToBeDeleted)){
				System.out.printf("First Name: %s%nLast Name: %s%nPhone Number: %d%nEmail: %s%n",firstName[count],lastName[count],phoneBook[count],email[count]);
				counter++;
			}
			if(counter == firstName.size()-1)System.out.print("Contact Not found");
		}
	}
	public void findContactByLastName(){
		System.out.println("Enter the last name of the contact: ");
		String lastNameOfContactToSearchfor = collector.next();
		int counter = 0;
		for(int count = 0; count<lastName.size();count++){
			if(lastName[count].equals(lastNameOfContactToBeDeleted)){
				System.out.printf("First Name: %s%nLast Name: %s%nPhone Number: %d%nEmail: %s%n",firstName[count],lastName[count],phoneBook[count],email[count]);
				counter++;
			}
			if(counter == firstName.size()-1)System.out.print("Contact Not found");
		}
	}
}	