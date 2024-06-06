package q4;

public class VerificadorPrimo extends NumerosPrimos{

    public void verificarSeEhPrimo(int valor){
        if (verificarPrimalidade(valor)){
            System.out.println("É primo");
        }
        else{
            System.out.println("Não é primo");
        }
    }
}
