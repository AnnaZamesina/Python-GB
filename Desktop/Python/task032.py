# ; Задача 32: Определить индексы элементов массива (списка), значения которых
# ; принадлежат заданному диапазону (т.е. не меньше заданного минимума и не
# ; больше заданного максимума)

print('Введите числа')
list1 = list(map(int, input().split()))
res = list()
lowest_border = int(input('Минимальное число  '))
highest_border = int(input('Максимальное число  '))
for i in range(len(list1)):
    if lowest_border < list1[i] < highest_border:
        res.append(i)
print(res)
