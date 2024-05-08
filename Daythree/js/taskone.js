const prompt = require("prompt-sync")();
let countForSuccess = 0;
let countForFailure = 0;
let countForQuestion = 1;
for(count = 0; count<10;count++){
let numbers = Math.floor(Math.random()*50);
let number2 = Math.floor(Math.random()*20);
let answerToUpComingQuestion = numbers * number2;
let answedReceived = prompt("Question Number " + countForQuestion + " is " + numbers + " x " + number2+":"+ " ");
countForQuestion++;
if(answedReceived == answerToUpComingQuestion){
countForSuccess++;
console.log("Correct");
}
else{
console.log("Incorrect");
countForFailure++;
}
}
console.log("Your success is " + countForSuccess);
console.log("Your failure is " + countForFailure);
