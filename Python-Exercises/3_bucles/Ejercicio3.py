frase=input("Frase:")
vocales="aeiou"
cantidad=0
for c in frase:
    if c in vocales:
        cantidad=cantidad+1
print("Vocales:", cantidad)