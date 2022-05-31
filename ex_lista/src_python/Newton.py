'''
Ana Cristina Silva de Oliveira - 11965630
BCC - A ex08 Metodo Newton Raphson
'''
import math

def main():
    iteracoes = 0
    try:
        print("Digite um chute inicial")
        chute_inicial = float(input())
    except:
        print("Voce nao digitou um valor numerico. Tente novamente")
        exit()

    chute_anterior = chute_inicial
    
    f_xi = math.pow(chute_inicial,3) - math.pow(chute_inicial,2) - 13 * chute_inicial + 8
    f_xi_derivada = 3*(math.pow(chute_inicial,2)) - 2*chute_inicial - 13
    
    chute_inicial = chute_inicial - (f_xi/f_xi_derivada);

    while abs(chute_inicial - chute_anterior) > 0.0000001:
        chute_anterior = chute_inicial
        f_xi = math.pow(chute_inicial,3) - math.pow(chute_inicial,2) - 13 * chute_inicial + 8
        f_xi_derivada = 3*(math.pow(chute_inicial,2)) - 2*chute_inicial - 13
        chute_inicial = chute_inicial - (f_xi/f_xi_derivada) 
        iteracoes+=1
    
    print("Raiz: {}, iteracoes: {}".format(chute_inicial,iteracoes))
        
    
if __name__ == "__main__":
    main()
