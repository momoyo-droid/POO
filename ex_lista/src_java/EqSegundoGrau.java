/* Ana Cristina Silva de Oliveira - NUSP 11965630
   Turma: BCC - A 
   Exercício 02 Equação de Segundo Grau
*/

import java.lang.Math;

public class EqSegundoGrau {
    public static void main(String[] args) {
        double a = 0, b = 0,  c = 0; 
        
        try {
            System.out.println("Digite tres coeficientes de uma eq. de segundo grau: ");
            a = EntradaTeclado.leInt();
            b = EntradaTeclado.leInt();
            c = EntradaTeclado.leInt();
        } catch (Exception e) {
            System.out.println("Voce nao digitou os valores numericos corretamente. Tente novamente...");
            System.exit(1);
        } 

        double delta = Math.pow(b,2) - (4*a*c);
        if (delta < 0) { // tratamento do caso em que delta eh negativo
            System.out.println("A equacao nao admite solucao real");
        }
        else{
            double x_1 = (-b + Math.sqrt(delta))/(2*a);
            double x_2 = (-b - Math.sqrt(delta))/(2*a);
            System.out.printf("x1 = %.1f e x2 = %.1f\n", x_1, x_2);
        }
    }
}
