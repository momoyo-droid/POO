'''
Ana Cristina Silva de Oliveira - 11965630
BCC - A ex01 Raiz Quadrada
'''

def main():
    chute_inicial = 0
    raiz_q = 0
    try:
        chute_inicial = float(input("Digite um chute inicial\n"))
        raiz_q = float(input("Digite uma raiz quadrada\n"))
    except:
        print("Voce nao digitou um valor numerico. Tente novamente")
        exit()

    chute_anterior = chute_inicial
    chute_inicial = (chute_inicial + raiz_q/chute_inicial)/2

    while (chute_inicial - chute_anterior > 0.00000001):
        chute_anterior = chute_inicial
        chute_inicial = (chute_anterior + raiz_q/chute_anterior)/2
    
    print("Chute: {:.1f}".format(chute_inicial))
    
if __name__ == "__main__":
    main()
