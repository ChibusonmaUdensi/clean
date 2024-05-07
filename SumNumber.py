def sum_of_digits(n):
    total = 0
    while n > 0:
        total += n % 10
        n //= 10
    return total

num = int(input("Enter an integer between 0 and 1000: "))
if 0 <= num <= 1000:
    digit_sum = sum_of_digits(num)
    print("The sum of all digits in the integer is:", digit_sum)
else:
    print("Invalid input. Please enter an integer between 0 and 1000.")