# Дано натуральное число N и
# последовательность из N элементов.
# Требуется вывести эту последовательность в
# обратном порядке.
# Примечание. В программе запрещается
# объявлять массивы и использовать циклы
# (даже для ввода и вывода).

# Input: 2 -> 3 4
# Output: 4 3

# def revert(n):
#     if n == 0:
#         return " "
#     k = int(input("Введите элемент: "))
#     return revert(n-1) + f"{', ' if n > 1 else ''} {k}"


# l = int(input("Введите число: "))
# print(revert(l))

n = int(input('Введите длину первого массива'))
list1 = list(map(int, input().split()))
m = int(input('Введите длину второго массива'))
list2 = list(map(int, input().split()))

s1 = set(list2)
for i in range(n):
    if list1[i] not in s1:
        print(list1[i], end=' ')
