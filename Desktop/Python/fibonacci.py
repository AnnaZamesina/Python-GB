a = int(input("Enter a: "))
b = 0
c = 0
d = 1
i = 2
while b < a:
    b = c + d
    c = d
    d = b
    i += 1
    if b > a:
        i = 0
if i == 0:
    print(-1)
else:
    print(i)