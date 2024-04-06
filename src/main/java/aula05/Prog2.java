package aula05;

public class Prog2 {
    public static void main(String[] args) {
        Empregado empregados[] = new Empregado[3];
        empregados[0] = new Empregado("João", 1500);
        empregados[1] = new Empregado("Ana", 4500);
        empregados[2] = new Empregado("Pedro", 7500);

        System.out.println("Empregado com maior salário:");
        Empregado empComMaiorSalario = getMaiorSalario(empregados);
        System.out.println(empComMaiorSalario);
    }

    public static Empregado getMaiorSalario(Empregado emp[]){
        Empregado maiorSal = emp[0];
        for (int i=0; i<emp.length; i++){
            if (maiorSal.getSalario() < emp[i].getSalario()){
                maiorSal = emp[i];
            }
        }
        return maiorSal;
    }

    public static void printEmps(Empregado emp[]){
        for (int i=0; i<emp.length; i++){
            System.out.println(emp[i]);
        }
    }
}
