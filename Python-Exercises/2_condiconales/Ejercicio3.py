letra=input("Letra:")
if len(letra)!=1:
    print("Debe ser sólo una letra")
else:
    if letra=="a" or letra=="e" or letra=="i" or letra=="o" or letra=="u":
        print("Es vocal")