package Model;
import java.util.ArrayList;

public class Cliente {
    private String nombre;
    private String rut;
    private String direccion;
    private String correo;
    private String numtelef;

    public Cliente(String nombre, String rut, String direccion,String correo,String numtelef) {
        this.nombre = nombre;
        this.rut = rut;
        this.direccion = direccion;
         this.correo = correo;
          this.numtelef = numtelef;
   
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNumtelef() {
        return numtelef;
    }

    public void setNumtelef(String numtelef) {
        this.numtelef = numtelef;
    }
    
}
