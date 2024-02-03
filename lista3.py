#vamos criar lista manipuláveis

times = ['portuguesa','peixe', 'porco', 'bambi']
for lista in times:
    print(lista)

print()

print(times [0])

times.append('corinthians')

print()
for lista in times:
    print(lista)

print()

print()
times.remove(input('qual time voce quer remover?'))
for lista in times:
    print(lista)