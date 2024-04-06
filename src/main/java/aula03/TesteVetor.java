package aula03;

public class TesteVetor {
    public static void main(String args[]){
        int vetor[] = new int[6];
        vetor[0] = 34;
        vetor[1] = 35;
        vetor[2] = 36;
        vetor[3] = 37;
        vetor[4] = 38;
        printVetor(vetor);
    }
    public static void printVetor(int vetor[]){
        for (int i=0; i<vetor.length; i++){
            System.out.println(vetor[i]);
        }
    }
}
