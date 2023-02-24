import os
from data_create import name_data, phone_data, surname_data, adress_data

file_name = "data.txt"


def print_data():
    if os.path.exists(file_name):
        print('Вывод данных из файла')
        with open(file_name, 'r', encoding='utf-8') as file:
            data_list = file.readlines()
            for element in data_list:
                print(element)
    else:
        print('записи не существует')


def input_data():
    print('Введите данные')
    name = name_data()
    surname = surname_data()
    phone = phone_data()
    adress = adress_data()
    with open(file_name, 'a', encoding='utf-8') as file:
        file.write(f"{name};{surname};{phone};{adress}\n")


def find_data(filter_string):
    with open(file_name, 'r', encoding='utf-8') as file:
        list_data = file.readlines()
        list_filter = filter_string.split()
        is_found = False
        for element in list_data:
            temp_record = element.split('; ')
            count = 0
            for record in temp_record:
                if filter_string.lower() in record.lower():
                    count += 1
            if count == len(list_filter):
                print(element)
                is_found = True
    if not is_found:
        print('Такой записи нет')


def remove_data(word_to_remove):
    with open(file_name, 'r+', encoding='utf-8') as file:
        list_data = file.readlines()
    with open(file_name, 'w', encoding='utf-8') as file:
        for element in list_data:
            temp_record = element.split(';')
            for word in temp_record:
                if word.lower() == word_to_remove.lower():
                    temp_record.remove(word)
                    break
            element = temp_record
            for word in temp_record:
                file.writelines(f'{word};')

        
def edit_data(word_to_edit):
    element_number = int(input('Номер записи для редактирования: '))
    print('''Введите позицию, которую нужно отредактировать:
    1 - имя
    2 - фамилия
    3 - телефон
    4 - адрес
    ''')
    edit_number = int(input())
    with open(file_name, 'r+', encoding='utf-8') as file:
        list_data = file.readlines()
    with open(file_name, 'w', encoding='utf-8') as file:
        for i in range(len(list_data)):
            temp_record = list_data[i].split(';')
            if i == element_number-1:
                # temp_record = list_data[i].split(';')
                for j in range(len(temp_record)):
                    if j == edit_number-1:
                        temp_record[j] = word_to_edit
                    file.writelines(f'{temp_record[j]};')
            else:
                file.writelines(f'{list_data[i]}')