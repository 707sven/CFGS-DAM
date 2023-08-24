n=int(input("Cuantas personas hay:"))
x=1
suma=0
while x<=n:
    altura=float(input("Ingrese la altura:"))
    suma=suma+altura
    x=x+1
promedio=suma/n
print("Altura promedio")
print(promedio)


