/* Ana Cristina Silva de Oliveira - NUSP 11965630
   Turma: BCC - A 
   Exercício 01 Raiz Quadrada
*/

public class RaizQuadrada {
    public static void main (String[] args) {
        double chute_inicial = 0, raiz_q = 0;
       
        try { 
            System.out.println("Digite um chute inicial: ");
            chute_inicial = EntradaTeclado.leInt();
            System.out.println("Digite uma raiz quadrada: ");
            raiz_q = EntradaTeclado.leInt();
        } catch (Exception e) {
            System.out.println("Voce nao digitou um numero. Tente novamente...");
        }
        
        double chute_anterior = chute_inicial;
        chute_inicial = (chute_inicial + raiz_q/chute_inicial)/2;

        while (chute_inicial - chute_anterior > 0.00000001) { 
            chute_anterior = chute_inicial;
            chute_inicial = (chute_anterior + raiz_q/chute_anterior)/2;
        }
        System.out.printf("Chute: %.1f\n", chute_inicial);
    }
}
