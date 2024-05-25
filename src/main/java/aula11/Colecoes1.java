package aula11;

import aula06.Pessoa;

import java.util.ArrayList;

public class Colecoes1 {
    public static void main(String[] args) {
        String nomes[] = new String[10];

        ArrayList lista = new ArrayList();
        lista.add("Banana");
        lista.add("Pêra");
        lista.add("Uva");
        lista.add(1);
        lista.add(10.5);
        lista.add(true);
        lista.add(new Pessoa("Rui", 45));

        for (int i=0; i<lista.size(); i++) System.out.println( lista.get(i) );
        lista.remove("Banana");
        System.out.println();
        for (Object item : lista) System.out.println(item);
    }
}
