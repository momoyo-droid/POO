import java.io.IOException;

public class Senha {
    public static void main(String[] args) throws IOException {
        int n = 0, count_attempts = 0, guess_number = 0, x = 0;
  
        System.out.println("Digite um valor inteiro para o intervalo ");
        n = EntradaTeclado.leInt();

        Random rand_number = new Random();
        x = rand_number.getIntRand(n);
        System.out.println("Chute um valor ");
        guess_number = EntradaTeclado.leInt();

        while (true) {
            count_attempts++;

            if (x == guess_number) {
                System.out.println("Parabens! Voce acertou! ");
                System.out.printf("Voce fez %d tentativas!", count_attempts);
                System.exit(1);
            } else if (guess_number < x) {
                System.out.println("O seu chute eh menor do que o valor a ser adivinhado ");
            } else {
                System.out.println("O seu chute eh maior do que o valor a ser adivinhado ");
            }

            System.out.println("Chute um valor "); 
            guess_number = EntradaTeclado.leInt();

        }
   
    }
}