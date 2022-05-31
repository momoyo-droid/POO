/* Ana Cristina Silva de Oliveira - NUSP 11965630
   Turma: BCC - A 
   Exercício 04 - B Numero primo
*/

public class PrimoUm {
    public static void main(String[] args) {
        int numero = 0;

        try {
            System.out.println("Digite um numero inteiro maior do que 1: ");
            numero = EntradaTeclado.leInt();
            if (numero == 1) {
                System.out.println("O numero 1 nao eh primo, pois possui apenas um unico divisor!");
                System.exit(1);
            }

        } catch (Exception e) {
            System.out.println("Voce nao digitou um valor numerico. Tente novamente...");
            System.exit(1);
        }
        
        int contador_divisores = 0, menor_divisor = 0;

        for (int primo = 2; primo < numero; primo++) {
            if (numero % primo == 0) {
                menor_divisor = primo;
                contador_divisores++;
                break;
            }
        }

        if (contador_divisores == 0){
            System.out.printf("O numero %d eh primo!", numero);
        } else{
            System.out.printf("O numero %d nao eh primo!\nSeu menor divisor eh %d", numero, menor_divisor);

        }
    }
}
