package funcionalidades;

import java.util.ArrayList;

public class Usuarios {  
    static Usuarios self = null;
    static ArrayList<Usuario> lista = new ArrayList();
    
    public static Usuarios getInstance(){
        if(self == null)
            self = new Usuarios();
        return self;
    }
    
    public static void add(Usuario us){
        lista.add(us);
    }
    
    public static void clear(){
        self = null;
    }
    
    public static boolean exist(String noCuenta){
        for(int conta = 0; conta < lista.size(); conta++){
            if(noCuenta.equals(lista.get(conta).noCuenta+""))
                return true;
        }
        return false;
    }
    
    public static boolean exist(String noCuenta, String contra){
        for(int conta = 0; conta < lista.size(); conta++){
            if(noCuenta.equals(lista.get(conta).noCuenta+"")&&contra.equals(lista.get(conta).contra+""))
                return true;
        }
        return false;
    }
    
}
