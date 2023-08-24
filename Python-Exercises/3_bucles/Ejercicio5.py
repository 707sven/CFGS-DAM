suma1=0
suma2=0
suma3=0

for f in range(5):
    edad=int(input("Ingrese edad:"))
    suma1=suma1+edad
pro1=suma1/5
print("Promedio de edades del turno mañana:")
print(pro1)

for f in range(6):
    edad=int(input("Ingrese edad:"))
    suma2=suma2+edad
pro2=suma2/6
print("Promedio de edades del turno tarde:")
print(pro2)

for f in range(11):
    edad=int(input("Ingrese edad:"))
    suma3=suma3+edad
pro3=suma3/11
print("Promedio de edades del turno noche:")
print(pro3)
if pro1<pro2 and pro1<pro3:
    print("El turno mañana tiene un promedio menor de edades.")
else:
    if pro2<pro3:
        print("El turno tarde tiene un promedio menor de edades.")
    else:
        print("El turno noche tiene un promedio menor de edades.")

