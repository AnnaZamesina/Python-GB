# values = [0, 2, 10, 6]
# if same_by(lambda x: x % 2, values):
#  print(‘same’)
# else:
#  print(‘different’)

values = [1, 3, 4, 5]


def same_by(characteristic, object):
    characteristic_list = [characteristic(x) for x in object]
    for i in range(len(characteristic_list)-1):
        if characteristic_list[i] != characteristic_list[i+1]:
            return False
    return True


if same_by(lambda x: x > 0, values):
    print('same')
else:
    print('different')
