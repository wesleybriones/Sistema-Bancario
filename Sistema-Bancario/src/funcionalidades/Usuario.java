
package funcionalidades;

public class Usuario{
        String nombre = "";
        String apellido = "";
        int dpi = 0;
        int noCuenta = 0;
        double saldo = 0.0;
        String correo = "";
        String contra = "";
        //AQUI PODRIAMOS USAR EL PATRON BUILDER
        Usuario(String nombre, String apellido, String dpi, String noCuenta, String saldo, String correo, String contra){
            this.nombre = nombre;
            this.apellido = apellido;
            this.dpi = Integer.parseInt(dpi);
            this.noCuenta = Integer.parseInt(noCuenta);
            this.saldo = Double.parseDouble(saldo);
            this.correo = correo;
            this.contra = contra;
        }
        Usuario(){
        }
        
        
    }
