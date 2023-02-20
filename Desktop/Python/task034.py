print('Введите текст')
text = input()
phrase = text.split()
volwes_amount = list()
volwes = ['а', 'о', 'э', 'е', 'и', 'ы', 'у', 'ё', 'ю', 'я']

for word in phrase:
    volwes_in_words = [x for x in word if x in volwes]
    volwes_amount.append(len(volwes_in_words))


if len(set(volwes_amount)) == 1:
    print('Парам пам-пам')
else:
    print('Пам парам')
