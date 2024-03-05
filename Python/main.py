import fibonacci as fi;

numero_valido = False
try:
    value = int(input("Adicione o valor que deseja verificar: "))
    numero_valido = True
except:
    print("O número não parece ser válido. Tente novamente")

if(numero_valido):
    fibo = fi.fibonacci(value)
    result = fibo.calc()

    print(result)