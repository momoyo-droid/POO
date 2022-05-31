/* Ana Cristina Silva de Oliveira - NUSP 11965630
   Turma: BCC - A 
   Exercício 05 Numero primo anterior
*/

public class PrimoAnterior {
    public static void main(String[] args) {
        int numero = 0;
        try {
            System.out.println("Digite um valor inteiro: ");
            numero = EntradaTeclado.leInt();
            if (numero == 2) {
                System.out.printf("O menor primo anterior ao valor 2 eh o proprio 2");
                System.exit(1);
            }

        } catch (Exception e) {
            System.out.println("Voce nao digitou um valor numerico. Tente novamente...");
            System.exit(1);
        }
        boolean[] array_primos = crivoErastostenes(numero);
        display_primos(array_primos, numero);
    }
    // funcao para impressao da mensagem
    private static void display_primos(boolean[] array_primos, int numero) {
        for (int i = array_primos.length-1; i >= 2; i--) {
            if (array_primos[i] == true && i < numero) {
                System.out.printf("O menor primo anterior ao valor %d eh o %d", numero, i);
                break; 
            }
        }
    }  
    // funcao que constroi o crivo de erastostenes
    private static boolean[] crivoErastostenes(int numero) {
        boolean[] array_primos = new boolean[numero+1];

        /*setando todos os valores primos de 2 ao numero escolhido como verdadeiros*/

        for (int primo = 2; primo <= numero; primo++) {
            array_primos[primo] = true;
        }
        
        /*excluindo os multiplos de cada valor primo, assim, criando um array 
        apenas com valores primos */
        for (int primo = 2; primo <= numero; primo++) {
            if (array_primos[primo]) {
                for (int multiplo = 2; primo*multiplo <= numero; multiplo++) {
                    array_primos[primo*multiplo] = false;
                }
            }
        }
        
        return array_primos;
    }
}
