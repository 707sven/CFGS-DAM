num=int(input("Ingrese un valor de hasta tres dígitos positivo:"))
if num<10:
    print("Tiene un dígito")
else:
    if num<100:
        print("Tiene dos dígitos")
    else:
        if num<1000:
            print("Tiene tres dígitos")
        else:
            print("Error en la entrada de datos.")


   

