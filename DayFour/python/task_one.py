temp = '';
answer = [];
counter = 0;
while(counter<9):
	userInput = input("Enter x and o: ");
	userInputforsport = int(input("Enter where you want to place your input between 1 to 9: "));
	if(userInput == 'x'  or userInput == 'o'):
		if(userInput != temp):
			if(userInputforsport > 0 or userInputforsport < 100):
				temp = userInput;
				answer[userInputforsport-1].append(userInput)
				counter+=1;
count = 0
while(count<=2):
	print(f"   {answer[count]},end=''");
	count+=1

print("\n");
count = 3
while(count<=5):
	print(f"   {answer[count]},end=''");
	count+=1
print("\n");
count = 6
while(count<=8):
	print(f"    {answer[count]},end=''");
	count+=1
print("\n");
