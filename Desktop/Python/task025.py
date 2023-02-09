# Напишите программу, которая принимает на вход строку, и отслеживает,
# сколько раз каждый символ уже встречался. Количество повторов добавляется к символам с помощью постфикса формата _n.

print("Введите строку")
text = input().split()
result = dict()
for char in text:
    if char in result:
        print(f"{char}_{result[char]}", end=" ")
    else:
        print(f"{char}", end=" ")
    result[char] = result.get(char, 0)+1
