def palindromo(cadena):
    if len(cadena)==1:
        return True
    else:
        i = 0
        d = len(cadena)-1
        while (d > i):
            if (cadena[i] != cadena[d]):
                return False
            i=i+1
            d=d-1
        return True

cantidad=0
cadena=input("Cadena:")
while cadena != "fin":
    if palindromo(cadena):
        cantidad=cantidad+1
    cadena=input("Cadena:")
print("Cantidad de palíndromos:", cantidad)
