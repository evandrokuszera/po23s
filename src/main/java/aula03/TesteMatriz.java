package aula03;

public class TesteMatriz {
    public static void main(String args[]){
        int matriz[][] = new int[3][3];
        matriz[0][0] = 34;
        matriz[0][1] = 35;
        matriz[0][2] = 36;
        printMatriz(matriz);
    }
    public static void printMatriz(int m[][]){
        for (int i=0; i<m.length; i++){
            for (int j=0; j<m[i].length; j++){
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }
}
