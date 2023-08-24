# OPERADORES.CONTROL DE FLUJO

# 1. Escribir un programa que, dado un número entero, muestre su valor absoluto. Recordar que, para los números positivos 
# su valor absoluto es igual al número (el valor absoluto de 52 es 52), mientras que, para los negativos, su valor absoluto 
# es el número multiplicado por -1 (el valor absoluto de -52 es 52).
num = int(input("Introduce un número: "))
if (num < 0):
    print(f"El valor absoluto es {num*-1}")
else:
    print(f"El valor absoluto es {num}")

# 2. Escribir un programa que solicite al usuario el ingreso de dos números diferentes y muestre en pantalla al mayor de los dos.
num1 = int(input("Introduce un número: "))
num2 = int(input("Introduce otro número: "))
if(num1 > num2):
    print(f"El número mayor es {num1}")
else:
    print(f"El número mayor es {num2}")
