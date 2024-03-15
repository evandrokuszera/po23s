package aula01;

import java.util.Scanner;

public class TerceiroPrograma {
    public static void main(String args[]){
        // definindo um scanner para ler dados do teclado.
        Scanner entrada = new Scanner(System.in);

        int idade = entrada.nextInt();
        entrada.nextLine();
        String nome = entrada.nextLine();

        System.out.println(idade);
        System.out.println(nome);
    }
}
