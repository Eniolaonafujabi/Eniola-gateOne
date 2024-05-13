import java.util.Scanner;
public class PhoneBookDriverClass{
	public static void main(String[] args){
		Scanner collector = new Scanner(System.in);
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
		case 1: addContact();
		case 2: removeContact();
		case 3: findContactByPhoneNumber();
		case 4: findContactByFirstName();
		case 5: findContactByLastName();
		case 6: System.out.println("Exit");
		}
	}
}