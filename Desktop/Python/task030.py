# Задача 30: Заполните массив элементами арифметической прогрессии.
# Её первый элемент, разность и количество элементов нужно ввести с клавиатуры.
# Формула для получения n-го члена прогрессии: an = a1 + (n-1) * d.
# Каждое число вводится с новой строки.

result = list()
a1 = int(input('Введите первое число  '))
n = int(input('Введите количество элементов прогрессии  '))
d = int(input('Введите разность'))

for i in range(n):
    print(a1+d*i)
