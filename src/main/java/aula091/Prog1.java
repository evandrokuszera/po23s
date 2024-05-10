package aula091;

import javax.swing.*;

public class Prog1 {
    public static void main(String[] args) {
        // dados da tela de login
        Usuario usuario = new Empresa("Maria", "1234");
        //Usuario usuario = new Gerente("Maria", "1234");

        AutenticadorDeUsuarios autenticador = new AutenticadorDeUsuarios();

        boolean isAutenticado = autenticador.autenticar(usuario);

        if (isAutenticado == true){
            JOptionPane.showMessageDialog(null, "MENU\n1-Cadastrar\n2-Listas\n3-Sair");
        } else {
            JOptionPane.showMessageDialog(null, "Login ou password incorretos... saindo!");
        }
    }
}
