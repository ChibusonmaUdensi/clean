number1 =int(input('Enter first integer'))
number2 = int(input('Enter second integer'))
number3 = int(input('Enter third integer'))


sum_of_numbers = number1 + number2 + number3
average_of_numbers= sum_of_numbers / 3
product_of_numbers = number1 * number2 * number3

minimum = number1
maximum = number1


if number2  <  minimum:
	minimum = number2
        print('The smallest is' , minimum)


if number3 < minimum:
	minimum = number3
	print('The smallest is', minimum)

else :
	number1 < minimum
	print('The smallest is', minimum)

if number2 > maximum:
	maximum = number2
	print('The largest is', maximum)

if number3 > maximum
	maximum = number3
	print('The largest is', maximum)

else
	number1 > maximum
	maximum = number1
	print('The largest is', maximum)