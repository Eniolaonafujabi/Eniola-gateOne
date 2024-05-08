count = 0;
TEN = 10
add = 0;
counter = 0;
while count<TEN:
	score = int(input('Enter score: ')
	if(score>0 and score<100):
		add+=score
		counter+=1
	count+=1
average = add/counter
print(add)
print(average)