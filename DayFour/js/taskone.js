const prompt = require("prompt-sync")();
let temp = '\0';
let one = 'x';
let two = 'o';
let answer = [];
for(let counter = 0; counter<9;){
let userInput = prompt("Enter x and o: ");
let userInputforsport = prompt("Enter where you want to place your input between 1 to 9: ");
if(userInput == 'x'  || userInput == 'o'){
if(userInput != temp){
if(userInputforsport > 0 || userInputforsport < 100){
temp = userInput;
answer[userInputforsport-1] = userInput;
counter++;
}
}
}
}

for(let count = 0; count<=2;count++){
console.log("    "+answer[count]);
}
console.log("\n");
for(let count = 3; count<=5;count++){
console.log("    "+answer[count]);
}
console.log("\n");
for(let count = 6; count<=8;count++){
console.log("    "+answer[count]);
}
console.log("\n");
