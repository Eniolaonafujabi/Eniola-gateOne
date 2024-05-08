import random
countForSuccess = 0
countForFailure = 0
countForQuestion = 1
count = 0
TEN = 10
while(count<10):
	numbers = random.randint(1,50)
	number2 = random.randint(1,20)
	answertoupcomingquestion = numbers * number2
	answedReceived = int(input(f"Question Number{countForQuestion} is  {numbers} x {number2}: "))
	countForQuestion+=1
	if(answedReceived == answertoupcomingquestion):
		countForSuccess+=1
		print("Correct")
	else:
		print("Incorrect")
		countForFailure+=1
	count+=1

print(f"Your success is {countForSuccess}")
print(f"Your failure is {countForFailure}")
