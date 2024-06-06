import q2.Titulo;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("-----------------\nQuestão 1");

        List<Integer> listaInteiros = new ArrayList<>();
        listaInteiros.add(4);
        listaInteiros.add(3);
        listaInteiros.add(10);
        listaInteiros.add(1);

        Collections.sort(listaInteiros);
        System.out.println(listaInteiros);

        System.out.println("-----------------\nQuestão 3");

        Titulo titulo1 = new Titulo("Aldeb");
        Titulo titulo2 = new Titulo("Brunilda");
        Titulo titulo3 = new Titulo("Aluc");
        Titulo titulo4 = new Titulo("Zebras 2");

        List<Titulo> listaDeTitulos = new ArrayList<>();
        listaDeTitulos.add(titulo1);
        listaDeTitulos.add(titulo2);
        listaDeTitulos.add(titulo3);
        listaDeTitulos.add(titulo4);

        Collections.sort(listaDeTitulos);
        System.out.println(listaDeTitulos);

        System.out.println("-----------------\nQuestão 4");

        List<String> listaArrayList = new ArrayList<>();
        listaArrayList.add("Elemento 1");
        listaArrayList.add("Elemento 2");

        List<String> listLinkedList = new LinkedList<>();
        listLinkedList.add("Elemento A");
        listLinkedList.add("Elemento B");

        System.out.println("Array List: "+ listaArrayList);
        System.out.println("Linked List: "+listLinkedList);

        System.out.println("-----------------\nQuestão 5");

        List<String> listaPolimorfica;
        listaPolimorfica = new ArrayList<>();
        listaPolimorfica.add("Elemento 1");
        listaPolimorfica.add("Elemento 2");
        System.out.println(listaPolimorfica);

        listaPolimorfica = new LinkedList<>();
        listaPolimorfica.add("Elemento A");
        listaPolimorfica.add("Elemento B");
        System.out.println(listaPolimorfica);

    }
}