# Сдвинуть последовательность из N челых чисел на k вправо
numbers = [1, 2, 3, 4, 5, 6, 7]
#new_numbers = []
k = 3
#for i in range(k, len(numbers)):
 #   new_numbers.append(numbers[i])
#for i in range(k):
 #   new_numbers.append(numbers[i])
#print(new_numbers)

print(numbers[-k-1:]+numbers[:k]) #использование срезов
