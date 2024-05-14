import java.util.Scanner;
public class PhoneBookDriverClass{
	public static void main(String[] args){
		Scanner collector = new Scanner(System.in);
		PhoneBookFunction phoneBook = new PhoneBookFunction();
		String phoneBookOption = """
			1 -> Add contact
			2 -> Remove contact
			3 -> Find Contact By phone number
			4 -> Find Contact By first name
			5 -> Find Contact By last name
			6 -> Exit  
		""";
		System.out.println(phoneBookOption);
			int userinput = collector.nextInt();
		switch(userinput){
		case 1: phoneBook.addContact();
		break;
		case 2: phoneBook.removeContact();
		break;
		case 3: phoneBook.findContactByPhoneNumber();
		break;
		case 4: phoneBook.findContactByFirstName();
		break;
		case 5: phoneBook.findContactByLastName();
		break;
		case 6: System.out.println("Exit");
		}
	}
}