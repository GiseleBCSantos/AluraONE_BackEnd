import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;
        int totalDeNotas = 0;

        while (nota != -1){
            System.out.println("Diga sua avaliação para o filme: ");
            nota = leitura.nextDouble();
            if (nota != -1){
                mediaAvaliacao += nota;
                totalDeNotas++;
            }
        }

        String texto = totalDeNotas > 0 ? "Media de avaliações " + mediaAvaliacao/totalDeNotas : "Não foi computada nenhuma nota!";

        System.out.println(texto);
    }
}
