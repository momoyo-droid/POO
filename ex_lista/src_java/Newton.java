/* Ana Cristina Silva de Oliveira - NUSP 11965630
   Turma: BCC - A 
   Exercício 08 Método Newton-Raphson
*/

import java.io.IOException;
import java.lang.Math;


public class Newton {
    public static void main(String[] args) throws IOException {
        int iteracoes = 0;
        
        System.out.println("Digite um chute inicial: ");

        double chute_inicial = EntradaTeclado.leDouble();
        double chute_anterior = chute_inicial;

        double f_xi = Math.pow(chute_inicial,3) - Math.pow(chute_inicial,2) - 13 * chute_inicial + 8;
        double f_xi_derivada = 3*(Math.pow(chute_inicial,2)) - 2*chute_inicial - 13;

        chute_inicial = chute_inicial - (f_xi/f_xi_derivada);

        while (Math.abs(chute_inicial - chute_anterior) > 0.0000001) {
            chute_anterior = chute_inicial;
            f_xi = Math.pow(chute_inicial,3) - Math.pow(chute_inicial,2) - 13 * chute_inicial + 8;
            f_xi_derivada = 3*(Math.pow(chute_inicial,2)) - 2*chute_inicial - 13;
            chute_inicial = chute_inicial - (f_xi/f_xi_derivada);

            iteracoes++;
        }
        
        System.out.printf("Raiz: %f, iteracoes: %d", chute_inicial, iteracoes);
    }
}
