
package funcionalidades;

import java.util.LinkedList;
    
public class Acciones_Bancarias {
    LinkedList<Usuario> usuarios = new LinkedList<Usuario>();
    
    public boolean nuevo_cliente(String nombre, String apellido, String dpi, String noCuenta, String saldo, String correo){
        if(validar_registro(nombre, apellido, dpi, noCuenta, saldo, correo)){
            if(guardar(nombre, apellido, dpi, noCuenta, saldo, correo))
                return true;
        }
        return false;
    }
    
    public boolean validar_registro(String nombre, String apellido, String dpi, String noCuenta, String saldo, String correo){
        if(!(isNumeric(dpi))||!(isNumeric(noCuenta))||!(isNumeric(saldo)))
            return false;
        if((nombre.trim().length() == 0)&&(apellido.trim().length() == 0)&&(correo.trim().length() == 0))
            return false;
        if(Usuarios.getInstance().exist(noCuenta))
            return false;
        return true;
    }
    
    public boolean guardar(String nombre, String apellido, String dpi, String noCuenta, String saldo, String correo){
        Usuario us = new Usuario(nombre, apellido, dpi, noCuenta, saldo, correo);
        Usuarios.getInstance().add(us);
        return true;
    }
    
    private static boolean isNumeric(String str){
        try{
          double d = Double.parseDouble(str);
        }
        catch(NumberFormatException nfe){
          return false;
        }
        return true;
    }
}

