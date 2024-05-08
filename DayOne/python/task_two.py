count = 0;
TEN = 10
add = 0;
while count<TEN:
	score = int(input('Enter score: '))
	add+=score
	count+=1
average = add/count
print(average)