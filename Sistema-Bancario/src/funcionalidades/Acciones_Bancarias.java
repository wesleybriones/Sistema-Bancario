
package funcionalidades;

import java.util.LinkedList;
import javax.swing.JOptionPane;
    
public class Acciones_Bancarias {
    
    Usuario u1; 
    Usuario u2;

    public Acciones_Bancarias() {
    }

    public Acciones_Bancarias(Usuario u1, Usuario u2) {
        this.u1 = u1;
        this.u2 = u2;
    }

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
    
    public static boolean transferirDinero(String receptor, Usuario pagador, double monto){
        if(Usuarios.getInstance().exist(receptor) && pagador.saldo >= monto){
            for(Usuario aux : Usuarios.getInstance().lista){
                if(aux.noCuenta == pagador.noCuenta){
                    aux.saldo -= monto;
                }
                if(aux.noCuenta == Integer.parseInt(receptor)){
                    aux.saldo += monto;
                }
            }
            JOptionPane.showMessageDialog(null, "Transferencia Completada!", "Info", JOptionPane.INFORMATION_MESSAGE);
            return true;
        }
        JOptionPane.showMessageDialog(null, "La transferencia no se pudo realizar.", "Advertencia", JOptionPane.ERROR_MESSAGE);
        return false;
    }
    
}

