# Задача 10: На столе лежат n монеток. Некоторые из них лежат вверх решкой, а некоторые – гербом.
# Определите минимальное число монеток, которые нужно перевернуть, чтобы все монетки были повернуты вверх одной и той же стороной.
# Выведите минимальное количество монет, которые нужно перевернуть.

# 5 -> 1 0 1 1 0
# 2

print("Введите количество монет, лежащих на столе")
coins_number = int(input())
count = 0
print("Введите значение монеты")
for i in range(coins_number):
    value = int(input())
    if value == 1:
        count += 1
if count > coins_number-count:
    print("Минимальное количество монет, которые нужно перевернуть - ",
          coins_number-count)
else:
    print("Минимальное количество монет, которые нужно перевернуть - ", count)