fecha=int(input("Fecha en formato DDMMAAAA:"))
año=fecha%10000
dia=fecha//1000000
mes=(fecha//10000)%100
print(dia,"/",mes,"/",año)

   

 
