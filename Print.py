
total = 0
counter = 0
grade = int(input('enter grade, -1 to end: '))

while grade != -1:
	
	total += grade
	counter += 1
	grade = int(input('enter grade, -1 to end: '))
if counter != 0:
	average = total/counter
	print(f'total is {total}')
	print(f'Class average is {average:.4f}')
else:
	print('no grades were entered')

grades = [85, 93, 45, 89, 85]

result = sum(grades)/len(grades)
print(result)


