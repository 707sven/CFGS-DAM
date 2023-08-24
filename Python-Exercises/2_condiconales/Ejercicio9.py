sueldo=int(input("Ingrese sueldo del empleado:"))
antiguedad=int(input("Ingrese su antiguedad en años:"))
if sueldo<500 and antiguedad>10:
    aumento=sueldo*0.20
    sueldototal=sueldo+aumento
    print("Sueldo a pagar")
    print(sueldototal)
else:
    if sueldo<500:
        aumento=sueldo*0.05
        sueldototal=sueldo+aumento
        print("Sueldo a pagar")
        print(sueldototal)
    else:
        print("Sueldo a pagar")
        print(sueldo)


   

