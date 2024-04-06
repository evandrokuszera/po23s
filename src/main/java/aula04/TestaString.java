package aula04;

public class TestaString {
    public static void main(String[] args) {
        String nome1 = "Evandro";
        String nome2 = new String("Evandro");
        if (nome1.equals(nome2)){
            System.out.println("São iguais!");
        } else {
            System.out.printf("São diferentes!");
        }

        for (int i=0; i<nome1.length(); i++){
            System.out.println(nome1.charAt(i));
        }

        nome1 = nome1.toUpperCase();
        System.out.println(nome1);
    }
}
