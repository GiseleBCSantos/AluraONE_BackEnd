package q4;

public class NumerosPrimos {

    public boolean verificarPrimalidade(int valor){
        boolean primo = true;
        for (int i = 2; i < valor; i++){
            if (valor % i == 0) {
                primo = false;
            }
        }
        return primo;
    }

    public void listarPrimos(int limite){
        int numerosGerados = 0;
        int numeroAtual = 1;
        while (numerosGerados < limite){
            if (verificarPrimalidade(numeroAtual)){
                System.out.println(numeroAtual);

                numerosGerados++;
            }
            numeroAtual++;
        }
    }
}
