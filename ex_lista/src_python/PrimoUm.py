'''
Ana Cristina Silva de Oliveira - 11965630
BCC - A ex06 Numero primo
'''

def main():
    try:
        numero = int(input("Digite um valor inteiro\n"))
        if numero == 1:
            print("O numero 1 nao eh primo, pois possui apenas um unico divisor!")
            exit()
    except:
        print("Voce nao digitou um valor numerico. Tente novamente")
        exit()

    count_div = 0
    menor_div = 0
    
    for i in range(2,numero):
        if numero % i == 0:
            menor_div = i
            count_div +=1
            break
        
    if count_div == 0:
        print("O numero {} eh primo".format(numero))
    else:
        print("O numero {} nao eh primo!\nSeu menor dividor eh {}".format(numero,menor_div))
        
if __name__ == "__main__":
    main()
