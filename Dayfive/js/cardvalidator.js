const prompt = require("prompt-sync")();
accountNumber = prompt("Enter account number: ");
if(accountNumber.length != 19)console.log("False");
let counter = 0;
for(let count = 4; count<18;count+=5){
	if(accountNumber.charAt(count) == '-'){
		counter++;
	}
}
if(accountNumber.length == 19){
if(accountNumber.charAt(0) == '4'||accountNumber.charAt(0) == '5'||accountNumber.charAt(0) == '6'){
	if(counter == 3){
		console.log("True");
			}
		else{console.log("False");}
		}
	else{console.log("False");}
		}
else{console.log("False");}	
