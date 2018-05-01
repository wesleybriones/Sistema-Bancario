
package funcionalidades;

import java.util.LinkedList;
    
public class Acciones_Bancarias {

    public boolean login(String nocuenta, String contra) {
        if(Usuarios.exist(nocuenta, contra)){
            return true;
        }
        return false;
    }
    
    public boolean nuevo_cliente(String nombre, String apellido, String dpi, String noCuenta, String saldo, String correo, String contra){
        if(validar_registro(nombre, apellido, dpi, noCuenta, saldo, correo, contra)){
            if(guardar(nombre, apellido, dpi, noCuenta, saldo, correo, contra))
                return true;
        }
        return false;
    }
    
    public boolean validar_registro(String nombre, String apellido, String dpi, String noCuenta, String saldo, String correo, String contra){
        if(!(isNumeric(dpi))||!(isNumeric(noCuenta))||!(isNumeric(saldo)))
            return false;
        if((nombre.trim().length() == 0)&&(apellido.trim().length() == 0)&&(correo.trim().length() == 0)&&(contra.trim().length() == 0))
            return false;
        if(Usuarios.getInstance().exist(noCuenta))
            return false;
        return true;
    }
    
    public boolean guardar(String nombre, String apellido, String dpi, String noCuenta, String saldo, String correo, String contra){
        Usuario us = new Usuario(nombre, apellido, dpi, noCuenta, saldo, correo, contra);
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

