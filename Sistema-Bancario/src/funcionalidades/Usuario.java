
package funcionalidades;

public class Usuario{
        String nombre = "";
        String apellido = "";
        int dpi = 0;
        int noCuenta = 0;
        double saldo = 0.0;
        String correo = "";
        
        Usuario(String nombre, String apellido, String dpi, String noCuenta, String saldo, String correo){
            this.nombre = nombre;
            this.apellido = apellido;
            this.dpi = Integer.parseInt(dpi);
            this.noCuenta = Integer.parseInt(noCuenta);
            this.saldo = Double.parseDouble(saldo);
            this.correo = correo;
        }
    }