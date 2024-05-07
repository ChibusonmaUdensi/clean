
def sum_of_multiples_of_10(start, end):
    total_sum = 0
    for num in range(10, 20000 + 1):
        if num % 10 == 0:
            total_sum += num
    return total_sum
start = 1
end = 20000
result = sum_of_multiples_of_10(start, end)
print("Sum of multiples of 10 between", start, "and", end, "is:", result)

print(sum)