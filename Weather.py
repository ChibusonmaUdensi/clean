""" This code determines the weather condition"""

temperature = float(input("Enter the temperature: "))

if temperature >= 70:

	print("the weather is extremely hot")
elif temperature > 40 and temperature < 70:
	print("The weather is hot")
elif temperature > 20 and temperature <= 40:
	print("the weather is average")
elif temperature > 1 and temperature <= 20:
	print("The weather is cold")
	print("Go out with your sweater")

else:
	print("the weather is extremely cold, stay home")


