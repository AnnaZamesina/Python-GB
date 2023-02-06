#Дан список. Определить, сколько в нем встьречается уникальных чисел.

#list1 = [1, 1, 2, 0, -1, 3, 4, 4]
#unique = []
#count = 0
#for element in list1:
   # if element not in unique:
      #  unique.append(element)
#print(len(unique))

#print(len(set(list1)))

#Множества работают быстрее. В множествах нет пвторяющихся элементов. Неупорядоченное хранение данных.
#map - отображение

list1 = list(map(int, input('введите числа').split(' ')))
print(list1)
print(len(set(list1)))