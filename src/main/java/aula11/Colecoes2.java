package aula11;

import java.util.ArrayList;

public class Colecoes2 {
    public static void main(String[] args) {

        ArrayList<String> frutas = new ArrayList();
        frutas.add("Banana");
        frutas.add("Banana");
        frutas.add("Uva");
        frutas.add("Pêra");
        frutas.add("Maçã");

        System.out.println("Contains? " + frutas.contains("Laranja"));
        frutas.set( frutas.lastIndexOf("Banana"), "Pitaya");
        System.out.println(frutas);


    }
}
