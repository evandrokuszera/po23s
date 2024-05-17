package aula09b;


import java.util.HashMap;

public class AutenticadorDeUsuarios {

    private HashMap<String,String> banco = new HashMap<>();

    public AutenticadorDeUsuarios(){
        banco.put("Maria", "123");
        banco.put("Microsoft", "123");
        banco.put("Facebook", "123");
    }

    public boolean autenticar(Usuario user){
        String passwordDoBanco = banco.get( user.getLogin() );

        if (passwordDoBanco == null){
            return false;
        } else {
            if (passwordDoBanco.equals(user.getPassword())){
                return true;
            }
        }

        return false;
    }
}
