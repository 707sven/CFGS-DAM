# PRIMER PROGRAMA

# 1. Realizar la carga del precio de un producto y la cantidad a llevar. 
# Mostrar cuánto se debe pagar (se ingresa un valor entero en el precio del producto)
precio = int(input("Introduce un precio para el produco: "))
cantidad = int(input("Introduce una cantidad para el produco: "))
total = precio * cantidad

print(f"Precio total: {total}€")

# 2. Realizar un programa que lea cuatro valores numéricos e informar su suma y promedio.
num1 = int(input("Introduce un número: "))
num2 = int(input("Introduce un número: "))
num3 = int(input("Introduce un número: "))
num4 = int(input("Introduce un número: "))
suma = num1 + num2 + num3 + num4

print(f"[+] Suma: {suma} \n[+] Promedio: {suma/4}")

# 3. Realizar la carga del lado de un cuadrado, mostrar por pantalla el perímetro del mismo. 
# El perímetro de un cuadrado se calcula multiplicando el valor del lado por cuatro. Mostrar por pantalla.
lado = int(input("Introduce el lado del cuadrado: "))
print(f"El perímetro del cuadrado es {lado*4}")