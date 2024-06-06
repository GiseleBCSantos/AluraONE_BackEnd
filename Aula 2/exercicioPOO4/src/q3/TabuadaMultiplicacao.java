package q3;

public class TabuadaMultiplicacao implements Tabuada{

    @Override
    public void mostrarTabuada(int numero) {
        for (int i = 1; i <= numero; i++){
            System.out.println(i + " x " + numero + " = " + i*numero);
        }
    }
}
