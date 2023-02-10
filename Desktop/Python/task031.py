# Хакер Василий получил доступ к классному журналу и
# хочет заменить все свои минимальные оценки на
# максимальные. Напишите программу, которая
# заменяет оценки Василия, но наоборот: все
# максимальные – на минимальные.
# Input: 5 -> 1 3 3 3 4
# Output: 1 3 3 3 1


N = int(input("Количество оценок"))
marks = [0]*N
print("Заполните оценки")
for i in range(N):
    marks[i] = int(input())
print(marks)

max_mark = max(marks)
min_mark = min(marks)

for i in range(N):
    if marks[i]==max_mark:
        marks[i] = min_mark

print(marks)