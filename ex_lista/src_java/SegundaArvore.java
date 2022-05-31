/* Ana Cristina Silva de Oliveira - NUSP 11965630
   Turma: BCC - A 
   Exercício 04 - A Segunda Árvore
*/

public class SegundaArvore {
    public static void main(String[] args) {
        int tamanho_arv = 0;
        
        try {
            System.out.println("Digite um valor para desenhar a arvore: ");
            tamanho_arv = EntradaTeclado.leInt();
        } catch (Exception e) {
            System.out.println("Voce nao digitou um valor numerico. Tente novamente...");
            System.exit(1);
        }
        
        for (int qtd_espaco = 0; qtd_espaco < tamanho_arv; qtd_espaco++) {
            for (int qtd_caracter = 0; qtd_caracter < tamanho_arv;  qtd_caracter++) {
                if (qtd_espaco > qtd_caracter){
                    System.out.printf(" ");
                }else{

                    System.out.printf("*");
                }
            }
            System.out.println(); 
        }
    }
}
