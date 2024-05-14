import java.util.Scanner;
public class PhoneBookDriverClass{
	public static void main(String[] args){
		Scanner collector = new Scanner(System.in);
		PhoneBookFunction phoneBook = new PhoneBookFunction();
		phoneBook.phoneBookOption();
	}
}