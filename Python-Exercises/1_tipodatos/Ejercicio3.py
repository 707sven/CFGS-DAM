nombre1=input("Tu nombre:")
nombre2=input("Otro nombre:")
posicion_final_nombre1=len(nombre1)-1
posicion_final_nombre2=len(nombre2)-1
print((nombre1[0] == nombre2[0]) or (nombre1[posicion_final_nombre1] == nombre2[posicion_final_nombre2]))