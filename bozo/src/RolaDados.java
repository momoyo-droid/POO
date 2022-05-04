public class RolaDados {
    private int n_dados = 0;
    private Dado[] conj_dados;
     // cria e armazenas objetos do tipo Dado
    public RolaDados(int n) {
        this.n_dados = n;
        this.conj_dados = new Dado[n];
        for (int i = 0; i < this.n_dados; i++) {
            this.conj_dados[i] = new Dado();
        }
    }
    
    // rola todos os dados
    public int[] rolar() {
        int[] valores_dados = new int[this.n_dados];
        for (int i = 0; i < this.n_dados; i++) {
            try {
                Thread.sleep(200);
            } catch (Exception e) {
                System.out.println("Erro Thread.sleep\n");
            }
            valores_dados[i] = this.conj_dados[i].rolar();
        }
        return valores_dados;
    }

    // rola alguns dos dados
    public int[] rolar(boolean[] quais) {
        int[] valores_dados = new int[this.n_dados];
        for (int i = 0; i < this.n_dados; i++) {
            if (quais[i] == true) {
                valores_dados[i] = this.conj_dados[i].rolar();
            }
        }
        return valores_dados;
    }

    // rola alguns dos dados
    public int[] rolar(String s) {
        int[] valores_dados = new int[this.n_dados];
        if (!s.isEmpty()) {
            String[] str_val = s.split(" ");
            for (int i = 0; i < str_val.length; i++) {
                int qual_dado = Integer.parseInt(str_val[i]);
                if (qual_dado > 0 && qual_dado <= this.n_dados) {
                    this.conj_dados[qual_dado-1].rolar();
                }
            }
        }
    
        for (int i = 0; i < this.n_dados; i++) {
            valores_dados[i] = this.conj_dados[i].getLado();
        }
        return valores_dados;
    }

    // representação dos dados
    @Override
    public String toString() {
        String str_saida = "";
        String[] str_dados = new String[this.n_dados];

        for (int i = 0; i < this.n_dados; i++) {
            str_dados[i] = conj_dados[i].toString();
        }

        str_saida += "1          2          3          4          5\n";

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < this.n_dados; j++) {
                str_saida += str_dados[j].substring(8*i, 7+(8*i)) + "    ";
            }
            str_saida += "\n";
        }
        return str_saida;
    }

    public static void main(String[] args) {
        RolaDados r = new RolaDados(5);
        r.rolar();
        System.out.println(r);
        System.out.println("\n");
        r.rolar("1 3");
        System.out.println(r);
        System.out.println("\n");

        r.rolar("5 4");
        System.out.println(r);
    }

}