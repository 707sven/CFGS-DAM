def esPar(numero):
    return numero%2 == 0

sumaPares=0
sumaImpares=0
for i in range(10):
    num=int(input("Número:"))
    if esPar(num):
        sumaPares=sumaPares+1
    else:
        sumaImpares=sumaImpares+1
print("Suma de los pares:", sumaPares)
print("Suma de los impares:", sumaImpares)