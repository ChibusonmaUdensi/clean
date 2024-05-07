counter = 0
score =int(input('enter score'))

while counter in range(1, 15, 1):
	counter += 1
	score =int(input('enter score'))

if score > 45:
	print('pass')
if score < 45:
	print('fail')