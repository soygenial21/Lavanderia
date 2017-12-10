package upc.com.lavanderiaproyec.Objects;

/**
 * Created by julieta on 25/11/2017.
 */

public class cliente {
    String nombre;
    String apellifo;
    String correo;
    String contraseña;
    String direccion;
    String telefono;

    public cliente(){};
    public cliente(String _nom,String _ape, String _corr, String _pass, String _dire, String _tel )
    {
        this.nombre = _nom;
        this.apellifo = _ape;
        this.correo = _corr;
        this.contraseña = _pass;
        this.direccion = _dire;
        this.telefono= _tel;


    }

    public cliente( String nombre, String apellido, String direccion, String telefono){

        this.telefono = telefono;
        this.nombre = nombre;
        this.apellifo = apellido;
        this.direccion = direccion;

    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellifo() {
        return apellifo;
    }

    public void setApellifo(String apellifo) {
        this.apellifo = apellifo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
