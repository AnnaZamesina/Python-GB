#Задача 12: Петя и Катя – брат и сестра. Петя – студент, а Катя – школьница. 
# Петя помогает Кате по математике. Он задумывает два натуральных числа X и Y (X,Y≤1000), а Катя должна их отгадать. 
# Для этого Петя делает две подсказки. Он называет сумму этих чисел S и их произведение P. Помогите Кате отгадать задуманные Петей числа.
#4 4 -> 2 2
#5 6 -> 2 3

S = int(input("Введите сумму двух чисел: "))
P = int(input("Введите произведение двух чисел: "))
y = 0
while y <= 1000:
    x = S - y
    if x*y == P:
        print ("Петя загадал числа: ",x, y)
        break
    else:
        y+=1