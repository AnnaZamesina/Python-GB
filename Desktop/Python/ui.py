from logger import input_data, print_data, find_data, remove_data, edit_data


def interface():
    print('''Выберите режим работы с программой
             1 - запись
             2 - вывод данных
             3 - поиск
             4 - удаление
             5 - редактирование
             ''')
    command_number = int(input())
    while command_number > 5 or command_number < 1:
        print('Введите корректный номер команды')
        command_number = int(input())
    if command_number == 1:
        input_data()
    elif command_number == 2:
        print_data()
    elif command_number == 3:
        print('Введите параметр поиска через ;')
        filter_str = input()
        find_data(filter_str)
    elif command_number == 4:
        print('Введите параметр для удаления')
        word_remove = input()
        remove_data(word_remove)
    elif command_number == 5:
        print('на какое слово меняем')
        word_edit = input()
        edit_data(word_edit)
