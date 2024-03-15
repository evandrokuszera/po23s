package aula02;

import java.util.Scanner;
public class Calculo {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = entrada.nextInt();
        System.out.println("Quadrado: " +  CalculoUtil.quadrado(numero));
        System.out.println("menor(2, quadrado(2)): " + CalculoUtil.menor(2, CalculoUtil.quadrado(2)));
    }

}
