public class Dado {
    private int lados_do_dado, valor_do_dado;
    Random rand_n = new Random();

    // cria um dado com 6 lados (um cubo)
    public Dado() {
        this.lados_do_dado = 6;
    }  
    
    // cria o objeto com um numero qualquer de lados
    public Dado(int n) { 
        this.lados_do_dado = n;
    }

    // recupera o ultimo numero selecionado
    public int getLado() {
        return this.valor_do_dado;
    }

    // simula a rolagem do dado por meio de um gerador aleatorio
    // o numero selecionado pode posteriormente ser recuperado com
    // a chamada da funcao getLado()
    public int rolar(){
        this.valor_do_dado = rand_n.getIntRand(this.lados_do_dado) + 1;
        return this.valor_do_dado;
    }
    
    // transforma a representação do dado em string
    @Override
    public String toString() {
        switch (this.valor_do_dado) {
            case 1: return "+-----+\n|     |\n|  *  |\n|     |\n+-----+ ";
            case 2: return "+-----+\n|*    |\n|     |\n|    *|\n+-----+ ";
            case 3: return "+-----+\n|*    |\n|  *  |\n|    *|\n+-----+ ";
            case 4: return "+-----+\n|*   *|\n|     |\n|*   *|\n+-----+ ";
            case 5: return "+-----+\n|*   *|\n|  *  |\n|*   *|\n+-----+ ";
            case 6: return "+-----+\n|*   *|\n|*   *|\n|*   *|\n+-----+ ";
        }
        return "";
    }
}
