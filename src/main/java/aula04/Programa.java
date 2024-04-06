package aula04;

public class Programa {
    public static void main(String[] args) {

        Pessoa p = new Pessoa("Evandro", 42);
//        p.nome = "José";
//        p.idade = 23;

        System.out.println(p);
//        System.out.println(p.nome);
//        System.out.println(p.idade);

        p.fazerAniversario();

        System.out.println(p);
//        System.out.println(p.nome);
//        System.out.println(p.idade);
    }
}
