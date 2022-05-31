'''
Ana Cristina Silva de Oliveira - 11965630
BCC - A ex05 Primo anterior
'''

from math import isqrt

def crivo_erastostenes(n: int) -> list[int]:
    if n <= 2:
        print("O menor primo anterior ao valor 2 eh o proprio 2")
        return []
    # inicializando os valores como primos
    eh_primo = [True] * n
    eh_primo[0] = False
    eh_primo[1] = False
    # excluindo os multiplos de cada valor
    for primo in range(2,isqrt(n)+1):
        if eh_primo[primo]:
            for multiplo in range(primo*primo,n,primo):
                eh_primo[multiplo] = False
    
    for i in range(len(eh_primo)-1, -1, -1):
        if eh_primo[i] == True and i < n:
            print("O primo anterior ao numero {} eh o {}".format(n,i))
            break
    


    return [primo for primo in range(n) if eh_primo[primo]]

def main():
    try:
        numero = int(input("Digite um valor inteiro\n"))
    except:
        print("Voce nao digitou um valor numerico. Tente novamente")
        exit()

    crivo_erastostenes(numero)
    
        
if __name__ == "__main__":
    main()
