# ; Задача 18: Требуется найти в массиве A[0..N-1] самый близкий по величине элемент к заданному числу X.
# ; Пользователь в первой строке вводит натуральное число N – количество элементов в массиве. В последующих строках записаны N целых чисел A[i].
# ;  Последняя строка содержит число X
# ; 5
# ; 1 2 3 4 5
# ; 6

# ; -> 5

N = int(input("Введите размер массива"))
l = [0]*N
min_distance = 1
print("Введите значения массива")
for i in range(len(l)):
    l[i] = int(input())
print(l)

x = int(input("Введите значение числа Х: "))
min = l[0]

for element in l:
    if abs(element-x) < abs(element-min):
        min = element

print(min)
