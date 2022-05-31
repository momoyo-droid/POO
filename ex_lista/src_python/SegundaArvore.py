'''
Ana Cristina Silva de Oliveira - 11965630
BCC - A ex04 Segunda Arvore
'''
import math
from re import X

def main():
    try:
        n = int(input("Digite um valor inteiro para desenhar a arvore\n"))
    except:
        print("Voce nao digitou um valor numerico. Tente novamente")
        exit()

    for i in range(n):
        print(" " *i, "*" * n)
        n-=1
    
if __name__ == "__main__":
    main()
