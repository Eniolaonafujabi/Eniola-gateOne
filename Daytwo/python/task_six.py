def sum_element_of_even_index(arrayPassedIn):
	evenIndex = [];
	sum = 0;
	int counter = 0;
	for number in range 10:
		if(number%2==0):
			evenIndex[counter] = arrayPassedIn[number]
			sum+=evenIndex[counter]
			counter+=1
	return sum
