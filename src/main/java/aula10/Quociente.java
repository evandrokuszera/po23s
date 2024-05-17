package aula10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Quociente {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int quociente = 0, numerador = 0, denominador = 0;

        while(true){ //break
            try{
                System.out.println("Informe o numerador:");
                numerador = entrada.nextInt();

                System.out.println("Informe o denominador:");
                denominador = entrada.nextInt();

                quociente = numerador / denominador;
                System.out.printf("Resultado: %d / %d = %d\n", numerador, denominador, quociente);
                break;
            } catch (InputMismatchException ex){
                System.out.println("Erro: informe apenas valores numéricos.");
                entrada.nextLine();
            } catch (ArithmeticException ex){
                System.out.println("Erro: não é possível dividir inteiro por zero.");
                entrada.nextLine();
            } catch (Exception ex){
                System.out.println("Mãe de todas as exceptions!");
                entrada.nextLine();
            } finally{
                // aqui vai executar...
            }
        }// fim do while...
    }
}
