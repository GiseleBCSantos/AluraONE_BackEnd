import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        var paulo = new Pessoa();
        paulo.nome = "Paulo";
        paulo.idade = 19;
        System.out.println(paulo);


        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();

        var joana = new Pessoa();
        joana.nome = "Joana";
        joana.idade = 24;

        var lucas = new Pessoa();
        lucas.nome = "Lucas";
        lucas.idade = 12;

        listaDePessoas.add(paulo);
        listaDePessoas.add(joana);
        listaDePessoas.add(lucas);

        System.out.println("Quantidade de pessoas na lista: "+listaDePessoas.size());
        System.out.println("Primeira pessoa da lista: "+ listaDePessoas.get(0).nome);

        for (int i = 0; i < listaDePessoas.size(); i++) {
            System.out.println(listaDePessoas.get(i));
        }

        for (Pessoa pessoa : listaDePessoas){
            System.out.println(pessoa);
        }
        System.out.println(listaDePessoas);


    }
}