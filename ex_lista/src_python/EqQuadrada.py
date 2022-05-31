'''
Ana Cristina Silva de Oliveira - 11965630
BCC - A ex02 Equação Quadrada
'''
import math
from re import X

def main():
    a, b, c = 0,0,0
    try:
        print("Digite valor para os tres coeficientes da equação de segundo grau")
        a = float(input())
        b = float(input())
        c = float(input())
    except:
        print("Voce nao digitou um valor numerico. Tente novamente")
        exit()

    delta = math.pow(b,2) - 4*a*c
    
    if delta < 0:
        print("A equação nao admite solucao real")
    else:
        x1 = (-b + math.sqrt(delta))/(2*a);
        x2 = (-b - math.sqrt(delta))/(2*a);
        print("x1: {:.1f} e x2: {:.1f}".format(x1,x2))
    
    
if __name__ == "__main__":
    main()
