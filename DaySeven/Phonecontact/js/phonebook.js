const prompt = require("prompt-sync")();
let firstName = [];
let lastName = [];
let email = [];
phoneBook = [];
function addContact(){
let numberOfcontactToBeStored = prompt("How many contact do you want to store: ");
for(let count = 0; count<numberOfcontactToBeStored;count++){
firstName = prompt("Enter first name: ");
lastName = prompt("Enter last name: ");
email = prompt("Enter email: ");
phoneBook = prompt("Enter phoneNumber: ");
}
let ifUserWantToContinue = prompt("Do you want to continue");
if(ifUserWantToContinue.equals("yes"))phoneBookOption();
if(ifUserWantToContinue.equals("no"))System.out.println("EXIT");
}
functiom removeContact(){
let firstNameOfContactToBeDeleted = prompt("Enter the first name of the contact: ");
let lastNameOfContactToBeDeleted = prompt("Enter the last name of the contact: ");
let counter = firstName.size()-1;
for(let count = 0; count<firstName.size();count++){
if(firstName.get(count).equals(firstNameOfContactToBeDeleted) && lastName.get(count).equals(lastNameOfContactToBeDeleted)){
firstName.remove(count);
lastName.splice(count,count);
phoneBook.splice(count,count);
email.splice(count,count);
counter--;
}
}
if(counter==firstName.size()-1)System.out.println("Can,t delete a contact that is not in the phone book input correct names next time");
System.out.println("Do you want to continue");
String ifUserWantToContinue = collector.next();
if(ifUserWantToContinue.equals("yes"))phoneBookOption();
if(ifUserWantToContinue.equals("no"))System.out.println("EXIT");
}
function findContactByFirstName(){
let firstNameOfContactToSearchfor = prompt("Enter the first name of the contact: ");
let counter = firstName.size()-1;
if(firstName.size() == 0)System.out.println("Can,t delete a contact that is not in the phone book input correct names next time");
for(let count = 0; count<firstName.size();count++){
if(firstName.get(count).equals(firstNameOfContactToSearchfor)){
System.out.printf("First Name: %s%nLast Name: %s%nPhone Number: %s%nEmail: %s%n",firstName.get(count),lastName.get(count),phoneBook.get(count),email.get(count));
counter--;
}
}
if(counter == firstName.size()-1)System.out.println("Contact Not found");
let ifUserWantToContinue = prompt("Do you want to continue");
if(ifUserWantToContinue.equals("yes"))phoneBookOption();
if(ifUserWantToContinue.equals("no"))System.out.println("EXIT");
}
function findContactByLastName(){
let lastNameOfContactToSearchFor = prompt("Enter the last name of the contact: ");
let counter = firstName.size()-1;
if(firstName.size() == 0)System.out.println("Can,t delete a contact that is not in the phone book input correct names next time");
for(let count = 0; count<lastName.size();count++){
if(lastName.get(count).equals(lastNameOfContactToSearchFor)){
System.out.printf("First Name: %s%nLast Name: %s%nPhone Number: %s%nEmail: %s%n",firstName.get(count),lastName.get(count),phoneBook.get(count),email.get(count));
counter--;
}
if(counter == firstName.size()-1)System.out.println("Contact Not found");
let ifUserWantToContinue = prompt("Do you want to continue");
if(ifUserWantToContinue.equals("yes"))phoneBookOption();
if(ifUserWantToContinue.equals("no"))System.out.println("EXIT");
}
function findContactByPhoneNumber(){
let phoneNumberCheacking = prompt("Enter phone number: ");
let counter = firstName.size()-1;
if(firstName.size() == 0)System.out.println("Can,t delete a contact that is not in the phone book input correct names next time");
for(let count = 0; count<lastName.size();count++){
if(phoneBook.get(count).equals(phoneNumberCheacking)){
System.out.printf("First Name: %s%nLast Name: %s%nPhone Number: %s%nEmail: %s%n",firstName.get(count),lastName.get(count),phoneBook.get(count),email.get(count));
counter--;
}
}
if(counter == firstName.size()-1)System.out.println("Contact Not found");
let ifUserWantToContinue = prompt("Do you want to continue");
if(ifUserWantToContinue.equals("yes"))phoneBookOption();
if(ifUserWantToContinue.equals("no"))System.out.println("EXIT");
}
function editContact(){
let firstNameOfContactToBeEdited = prompt("Enter the first name of the contact: ");
let lastNameOfContactToBeEdited = prompt("Enter the last name of the contact: ");
let counter = firstName.size();
if(firstName.size() == 0)System.out.println("Can,t delete a contact that is not in the phone book input correct names next time");
for(let count = 0; count<firstName.size();count++){
if(firstName.get(count).equals(firstNameOfContactToBeEdited) && lastName.get(count).equals(lastNameOfContactToBeEdited)){
let newFirstName = prompt("Enter first name: ");
firstName.splice(count,count,newFirstName);
let newLastName = prompt("Enter last name: ");
lastName.splice(count,count,newLastName);
let newPhoneBook = prompt("Enter last name: ");
phoneBook.splice(count,count,newPhoneBook);
let newEmail = prompt("Enter email: ");
email.set(count,count,newEmail);
counter--;
}	
}
if(counter == firstName.size()-1)System.out.println("Contact Not found");
let ifUserWantToContinue = prompt("Do you want to continue");
if(ifUserWantToContinue.equals("yes"))phoneBookOption();	
if(ifUserWantToContinue.equals("no"))System.out.println("EXIT");
}


function phoneBookOption(){
		let phoneBookOption = """
			1 -> Add contact
			2 -> Remove contact
			3 -> Find Contact By phone number
			4 -> Find Contact By first name
			5 -> Find Contact By last name
			6 -> Exit  
		""";
			let userinput = prompt(phoneBookOption);

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
			case 6: System.out.println("Exit");
		}
	}

	
}