count = 0;
TEN = 10
add = 0;
while count<TEN:
	score = int(input('Enter score: '))
	if score%2 == 0:
		add+=score
	count+=1
print(add)