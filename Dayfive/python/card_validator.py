acccount_number = input("Enter account number")
count = 0
if len(acccount_number) != 19:
	print("false")
if acccount_number[4]:
	count+=1
if acccount_number[9]:
	count+=1
if acccount_number[14]:
	count+=1
if len(acccount_number) == 19:
	if acccount_number[0] == '4' or acccount_number[0] == '5' or acccount_number[0] == '6':
		if count == 3:
			print("True")
		else:
			print("false")