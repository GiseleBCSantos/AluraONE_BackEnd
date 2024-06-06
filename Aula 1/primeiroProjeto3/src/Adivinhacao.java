import java.util.Random;
import java.util.Scanner;

public class Adivinhacao {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int randomNumber = new Random().nextInt(100);
        int numTentativas = 0;
        int chute = -1;

        System.out.println(">> Jogo de adivinhação <<");

        while (chute != randomNumber){
            System.out.println("Tente acertar o número sorteado: \n\t>>");
            chute = leitura.nextInt();

            if (chute > randomNumber) {
                System.out.println("Voce chutou alto.");
            }
            else if (chute < randomNumber) {
                System.out.println("Voce chutou baixo.");
            }
            else {
                System.out.println("Voce acertou!!!");
            }
        }
    }
}
