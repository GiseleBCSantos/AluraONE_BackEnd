package q4;

public class GeradorPrimo extends NumerosPrimos{
    public int gerarProximoPrimo(int valor){
        int proximoNumero = valor+1;

        while (! verificarPrimalidade(proximoNumero)){
            proximoNumero++;
        }
        return proximoNumero;
    }
}
