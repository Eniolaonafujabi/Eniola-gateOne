const prompt = require("prompt-sync")();
let score = [];
for(let count = 0; count<10;count++){
	score[count] = prompt("Enter score: ");
} 
for(let count = 0; count<10;count++){
	console.log(score[count]);
}
