import java.lang.IllegalArgumentException;
import java.util.Arrays;


public class Placar {
    private int[] placar;
    private int tam_placar = 0;

    // cria o placar
    public Placar() {
        this.tam_placar = 10;
        this.placar = new int[10];
        for (int i = 0; i < this.tam_placar; i++) {
            this.placar[i] = -1;
        }
    }

    // adiciona uma sequencia de dados em uma determinada posicao do placar
    // apos a chamada, aquela posicao torna-se ocupada e nao pode ser
    // usada uma segunda vez
    public void add(int posicao, int[] dados) throws IllegalArgumentException {
        // checa posicoes validas ou vazias
        if (posicao > 10 || posicao == 0 || this.placar[posicao-1] != -1
        ) {
            System.out.println( "Posicao invalida!\n");
            return;
        }
        // if pos 1 e 6
        int qt_dados_iguais = 0;
        if (posicao <= 6) {
            for (int i = 0; i < dados.length; i++) {
                if (posicao == dados[i]) {
                    qt_dados_iguais++;
                }
            }
            this.placar[posicao - 1] = posicao * qt_dados_iguais;
            return;
        }

        int[] qt_ocorr = new int[6];

        for (int i = 0; i < dados.length; i++) {
            qt_ocorr[dados[i]-1]++;
        }

        Arrays.sort(qt_ocorr);

        switch (posicao) {
            case 7:
                //2 e 3 dados iguais ou todos iguais
                for (int i = 0; i < qt_ocorr.length; i++) {
                    if (qt_ocorr[i] == 2 && qt_ocorr[i+1] == 3 
                    || qt_ocorr[i] == 5) {
                        this.placar[posicao-1] = 15;
                        return;
                    }
                }

            case 8:
                // sequencia 1 ao 5 ou 2 ao 6
                int qt_val = 0;

                for (int i = 0; i < qt_ocorr.length; i++) {
                    if (qt_ocorr[i] == 1) {
                        qt_val++;
                    }
                }

                if (qt_val == 5 || qt_val == 4) {
                    this.placar[posicao-1] = 20;
                    return;     
                }

            case 9:
                // quatro dados iguais
                for (int i = 0; i < qt_ocorr.length; i++) {
                    if (qt_ocorr[i] == 4) {
                        this.placar[posicao-1] = 30;
                        return;
                    }
                }

            case 10:
                // cinco dados iguais
                for (int i = 0; i < qt_ocorr.length; i++) {
                    if (qt_ocorr[i] == 5) {
                        this.placar[posicao-1] = 40;
                        return;
                    }
                }
        }
    }

    // computa a soma dos valores obtidos, considerando apenas
    // as posicoes que já estao ocupadas
    public int getScore() { 
        int soma = 0;

        for (int i = 0; i < placar.length; i++) {
            if (placar[i] != -1) {
                soma += placar[i];
            }
        }

        return soma;
    }

    // mostra o placar completo
    public String toString() {
        return  " "+(placar[0] == -1 ? "(1)" : placar[0])+"     " +
                "|   "+(placar[6] == -1 ? "(7)" : placar[6])+"     " +
                "|    "+(placar[3] == -1 ? "(4)" : placar[3])+"  \n" +
                " --------------------------\n" +
                " "+(placar[1] == -1 ? "(2)" : placar[1])+"     " +
                "|    "+(placar[7] == -1 ? "(8)" : placar[7])+"    " +
                "|    "+(placar[4] == -1 ? "(5)" : placar[4])+"  \n" +
                " --------------------------\n" +
                " "+(placar[2] == -1 ? "(3)" : placar[2])+"     " +
                "|   "+(placar[8] == -1 ? "(9)" : placar[8])+"     " +
                "|    "+(placar[5] == -1 ? "(6)" : placar[5])+"  \n" +
                "--------------------------\n" +
                "        |    "+(placar[9] == -1 ? "(10)" : placar[9])+"    |\n" +
                "        +----------+ ";
    }

}
