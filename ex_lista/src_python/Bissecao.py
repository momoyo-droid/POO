'''
Ana Cristina Silva de Oliveira - 11965630
BCC - A ex07 Metodo bissecao
'''
import math

def main():
    a, b = 0,0
    try:
        print("Digite dois valores para o intervalor [a,b]")
        a = int(input())
        b = int(input())
    except:
        print("Voce nao digitou um valor numerico. Tente novamente")
        exit()

    c = 0.0
    iteracoes = 0
    
    while (iteracoes >= 0):
        c = (a+b)/2
        f_c = math.pow(c,3) - math.pow(c,2) - 13*c + 8;
        f_a = math.pow(a,3) - math.pow(a,2) - 13*a + 8;
        
        if f_c == 0 or b-a < 0.0000001:
            print("A resposta é {}".format(c))
            break
        
        if f_a*f_c < 0:
            b = c
        else:
            a = c
            
        iteracoes+=1
    
    print("iteracoes: {}".format(iteracoes))
    
    
if __name__ == "__main__":
    main()
