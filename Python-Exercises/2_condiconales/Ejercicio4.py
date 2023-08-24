n1=int(input("Primer número:"))
n2=int(input("Segundo número:"))
n3=int(input("Tercer número:"))
if n1<n2:
    if n1<n3:
        print("Menor:", n1)
    else:
        print("Menor:", n3)
else:
    if n2<n3:
        print("Menor:", n2)
    else:
        print("Menor:", n3)