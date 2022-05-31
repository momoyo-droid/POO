/* Ana Cristina Silva de Oliveira - NUSP 11965630
   Turma: BCC - A 
   Exercício 07 Método da bisseção
*/

import java.io.IOException;

public class Bissecao {
    public static void main(String[] args) throws IOException{
        double a = 0, b = 0;

        System.out.println("Digite dois valores para o intervalo [a,b]: ");
        a = EntradaTeclado.leDouble();
        b = EntradaTeclado.leDouble();

        double c = 0.0;
        
        int i = 0; // contador de iterações
        
        while (i >= 0) {
            c = (a+b)/2; // valor medio do intervalo [a,b]
            double f_c = Math.pow(c,3) - Math.pow(c,2) - 13*c + 8;
            double f_a = Math.pow(a,3) - Math.pow(a,2) - 13*a + 8;
            
            if (f_c == 0 || b - a < 0.0000001) {
                System.out.printf("A resposta é c = %f\n", c);
                break;
            }

            if (f_c * f_a < 0) {
                b = c;
            } else { 
                a = c;
            }

            i++;

        }
        
        System.out.printf("iteracoes: %d", i);
    
    }
}
