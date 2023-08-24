#Ejercicios listas y diccionarios
#------------------Listas-----------------------

#Ejercicio 1
#definimos una lista vacia
lista=[]
#disponemos un ciclo de 5 vueltas
for x in range(5):
    valor=int(input("Ingrese un valor entero:"))
    lista.append(valor)

#imprimimos la lista    
print(lista)


#Ejercicio2
subjects = ["Matemáticas", "Física", "Química", "Historia", "Lengua"]
passed = []
for subject in subjects:
    score = float(input("¿Qué nota has sacado en " + subject + "?"))
    if score >= 5:
        passed.append(subject)
for subject in passed:
    subjects.remove(subject)
print("Tienes que repetir " + str(subjects))

#Ejercicio 3
alturas=[]
suma=0
for x in range(5):
    valor=float(input("Ingrese la altura:"))
    alturas.append(valor)
    suma=suma+valor

print("Las alturas ingresadas son")
print(alturas)
promedio=suma/5
print("El promedio de las alturas es")
print(promedio)

altas=0
bajas=0
for x in range(5):
    if alturas[x]>promedio:
       altas=altas+1
    else:
        if alturas[x]<promedio:
            bajas=bajas+1

print("La cantidad de personas mas bajas al promedio es")
print(bajas)
print("La cantidad de personas mas altas al promedio es")
print(altas)

#Ejercicio 4
word = input("Introduce una palabra: ")
vocals = ['a', 'e', 'i', 'o', 'u']
for vocal in vocals: 
    times = 0
    for letter in word: 
        if letter == vocal:
            times += 1
    print("La vocal " + vocal + " aparece " + str(times) + " veces")

#Ejercicio 5
empleados=[]
sueldos=[]
cant=int(input("Cuantos empleados tiene la empresa:"))
for x in range(cant):
    nom=input("Ingrese el nombre:")
    empleados.append(nom)
    su=int(input("Ingrese el importe del sueldo:"))
    sueldos.append(su)

print("Listado completo de empleados")
for x in range(len(sueldos)):
    print(empleados[x],sueldos[x])

posicion=0
while posicion<len(sueldos):
    if sueldos[posicion]>10000:
        sueldos.pop(posicion)
        empleados.pop(posicion)
    else:
        posicion=posicion+1

print("Listado de empleados que cobran 10000 o menos")
for x in range(len(sueldos)):
    print(empleados[x],sueldos[x])
    
#------------------Diccionarios-----------------------
#Ejercicio 6
monedas = {'Euro':'€', 'Dollar':'$', 'Yen':'¥'}
moneda = input("Introduce una divisa: ")
if moneda.title() in monedas:
    print(monedas[moneda.title()]) #title devuelve el string con la primera letra mayusculas
else:
    print("La divisa no está.")

#Ejercicio 7
curso = {'Matemáticas': 6, 'Física': 4, 'Química': 5}
total_creditos = 0
for asignatura, creditos in curso.items():
    print(asignatura, 'tiene', creditos, 'créditos')
    total_creditos += creditos
print('Número total de créditos del curso: ', total_creditos)

#Ejercicio 8
palabras = [
    'mesa',
    'móvil',
    'barco',
    'coche',
    'avión',
    'bandeja',
    'casa',
    'monitor',
    'carretera',
    'arco',
]

grupo_palabras = {}

for palabra in palabras:
    key = palabra[0] #primera letra
    if key in grupo_palabras: #si letra está en diccionario grupo_palabras
        grupo_palabras[key].append(palabra) #añadimos a la clave letra, la palabra
    else:
        grupo_palabras[key] = [palabra] #si no existe la letra creamos (clave:valor) letra:palabra

print(grupo_palabras)

#Ejercicio 9
diccionario = {}
palabras = input("Introduce la lista de palabras y traducciones en formato palabra:traducción separadas por comas: ")
for i in palabras.split(','):
    clave, valor = i.split(':')
    diccionario[clave] = valor
frase = input('Introduce una frase en español: ')
for i in frase.split():
    if i in diccionario:
        print(diccionario[i], end=' ')
    else:
        print(i, end=' ')