# VARIABLES. TIPOS DATOS

# 1. Escribir un programa que solicite al usuario ingresar un número con decimales y almacenarlo en una variable. 
# A continuación, el programa debe solicitar al usuario que ingrese un número entero y guardarlo en otra variable. 
# En una tercera variable se deberá guardar el resultado de la suma de los dos números ingresados por el usuario. 
# Por último, se debe mostrar en pantalla el texto “El resultado de la suma es [suma]”, donde “[suma]” se reemplazará 
# por el resultado de la operación.
num1 = float(input("Introduce un número con decimales: "))
num2 = int(input("Introduce un número entero: "))
suma = num1 + num2
print(f"El resultado de la suma es {suma}")

# 2. Escribir un programa que solicite al usuario ingresar la cantidad de kilómetros recorridos por una motocicleta y la 
# cantidad de litros de combustible que consumió durante ese recorrido. Mostrar el consumo de combustible por kilómetro.
km = int(input("Cantidad de kilómetros recorridos por una motoicleta: "))
combustible = int(input("Introduce los litros consumidos: "))
print(f"Combustible consumido por kilómetro: {km / combustible}L")

# 3. Escribir un programa para pedir al usuario su nombre y luego el nombre de otra persona, almacenando cada nombre en una variable. 
# Luego mostrar en pantalla un valor de verdad que indique si: los nombres de ambas personas comienzan con la misma letra o si 
# terminan con la misma letra. Por ejemplo, si los nombres ingresados son María y Marcos, se mostrará True, ya que ambos comienzan 
# con la misma letra. Si los nombres son Ricardo y Gonzalo se mostrará True, ya que ambos terminan con la misma letra. 
# Si los nombres son Florencia y Lautaro se mostrará False, ya que no coinciden ni la primera ni la última letra.
name1 = input("Introduce tu nombre: ")
name2 = input("Introduce el nombre de otra persona: ")
if ((name1[0] == name2[0]) or (name1[-1] == name2[-1])):
    print("True")
else:
    print("False")

# 4. Escribir un programa que le solicite al usuario ingresar una fecha formada por 8 números, donde los primeros dos representan el día, 
# los siguientes dos el mes y los últimos cuatro el año (DDMMAAAA). Este dato debe guardarse en una variable con tipo int (número entero). 
# Finalmente, mostrar al usuario la fecha con el formato DD / MM / AAAA.
fecha = int(input("Escribe una fecha (DDMMAAA): "))
año=fecha%10000
dia=fecha//1000000
mes=(fecha//10000)%100
print(f"{dia} / {mes} / {año}")

# 5. Inicializar un string con la cadena "hOlA" luego llamar a sus métodos upper(), lower() y capitalize(), guardar los datos retornados 
# en otros string y mostrarlos por pantalla.

cadena = ("hOlA")
upper = cadena.upper()
lower = cadena.lower()
capitalize = cadena.capitalize()
print(f"{upper}, {lower}, {capitalize}")

# 6. Calcular el sueldo mensual de un trabajador. Pedimos por teclado  la cantidad de horas trabajadas al mes y 
# el valor por hora trabajada. Mostrar un mensaje indicando ambos valores.
horas = int(input("Introduce las horas trabajadas al mes: "))
valor = int(input("Introduce el valor de cada hora: "))
print(f"[+] Horas trabajadas en el mes: {horas}\n[+] Valor por hora trabajada: {valor}€\n[+] Total horas trabajadas: {horas*valor}€")

# 7. Escribir un programa que solicite al usuario el ingreso de una temperatura en escala Fahrenheit (debe permitir decimales) 
# y le muestre el equivalente en grados Celsius. La fórmula de conversión que se usa para este cálculo es: Celsius = (5/9) * (Fahrenheit-32)
F = float(input("Introduce un valor en grados Fahrenheit: "))
C = (5/9) * (F-32)
print(f"{C} ºC")