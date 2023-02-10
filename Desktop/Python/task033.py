# Напишите функцию, которая принимает одно число и проверяет, является ли оно простым

# Напоминание: Простое число - это число, которое имеет 2 делителя: 1  и n(само число)




def simple_number(n):
    if n < 2:
        return 'No'
    else:
         for i in range(2, n-2):
            if n % i == 0:
                return 'No'
    return 'Yes'

N = int(input('Введите число '))
result = simple_number(N)
print(result)