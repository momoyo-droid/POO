/* Ana Cristina Silva de Oliveira - NUSP 11965630
   Turma: BCC - A 
   Exercício 03 Primeira Árvore
*/

public class PrimeiraArvore {
    public static void main(String[] args) {
        int tamanho_arv = 0;
        
        try {
            System.out.println("Digite um valor para desenhar a arvore: ");
            tamanho_arv = EntradaTeclado.leInt();
        } catch (Exception e) {
            System.out.println("Voce nao digitou um valor numerico. Tente novamente...");
            System.exit(1);
        }

        for (int linha = 0; linha < tamanho_arv; linha++) {
            for (int qntd_asteriscos = linha; qntd_asteriscos < tamanho_arv; qntd_asteriscos++) {
                System.out.printf("*");
            }
            System.out.println();   
        }
    }
}
