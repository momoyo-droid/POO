'''
Ana Cristina Silva de Oliveira - 11965630
BCC - A ex06 Ponto flutuante
'''

def main():
    try:
        numero = float(input("Digite um valor decimal diferente de zero\n"))
        maior = numero
        menor = numero 
    except:
        print("Voce nao digitou um valor numerico. Tente novamente")
        exit()

    while numero > 0:
        if numero == 0:
            break
        
        if maior < numero:
            maior = numero
        elif menor > numero:
            menor = numero
    
        numero = float(input("Digite um valor decimal diferente de zero\n"))    

    print("O maior numero eh {:.1f} e o menor numero {:.1f}".format(maior,menor))
if __name__ == "__main__":
    main()
