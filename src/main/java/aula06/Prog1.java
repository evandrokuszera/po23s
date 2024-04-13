package aula06;

public class Prog1 {
    public static void main(String[] args) {
        Pessoa pessoas[] = new Pessoa[4];
        pessoas[0] = new Pessoa("Ana", 22);
        pessoas[1] = new Aluno("José", 18, 12345, 7.8f, 9);
        pessoas[2] = new Pessoa("Maria", 24);
        pessoas[3] = new Professor("Evandro", 33, 222, 4500);
        printAll(pessoas);
    }

    public static void printAll(Pessoa pessoas[]){
        for (int i=0; i< pessoas.length; i++){
            System.out.println(pessoas[i].getNome());
        }
    }
}
