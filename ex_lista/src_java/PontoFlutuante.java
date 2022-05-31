/* Ana Cristina Silva de Oliveira - NUSP 11965630
   Turma: BCC - A 
   Exercício 06 Numero ponto flutuante
*/

import java.io.IOException;


public class PontoFlutuante {
    public static void main(String[] args) throws IOException{
        float numero = 0, maior = 0, menor = 0;

        System.out.println("Digite um valor decimal diferente de zero: ");
        numero = EntradaTeclado.leFloat();
        maior = numero;
        menor = numero;

        while (numero > 0) {
            System.out.println("Digite outro valor decimal diferente de zero: ");
            
            if (numero == 0)
                break;
            
            if (maior < numero) {
                maior = numero;
            } else if (menor > numero){
                menor = numero;
            }
            
            numero = EntradaTeclado.leFloat();
        }

        System.out.printf("O maior numero eh o %.1f e o menor numero eh o %.1f\n", maior, menor);

    }
}
