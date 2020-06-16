package dominio;

import java.util.Objects;
import java.io.Serializable;
import javax.swing.ImageIcon;

public abstract class Persona implements Serializable {
    
    public enum TipoPersona {
        PROFESIONAL,
        USUARIO,
    }
        
    protected String nombre;
    protected String apellido;
    protected String fechaNacimiento;
    protected ImageIcon fotoDePerfil;
    private static final String APELLIDO_NO_INGRESADO = "Apellido no ingresado";
    private static final String NOMBRE_NO_INGRESADO = "Nombre no ingresado";
    private static final String FECHA_NO_INGRESADA = "Fecha no ingresada";

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String unNombre) {
        this.nombre = unNombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String unApellido) {
        if (unApellido == null || unApellido.isEmpty()) {
            this.apellido = APELLIDO_NO_INGRESADO;
        } else {
            this.apellido = unApellido;
        }
    }

    public String getFechaNacimiento() {
        return this.fechaNacimiento;
    }

    public void setFechaNacimiento(String unaFecha) {
        if (unaFecha == null || unaFecha.isEmpty()) {
            this.fechaNacimiento = FECHA_NO_INGRESADA;
        } else {
            this.fechaNacimiento = unaFecha;
        }
    }

    public ImageIcon getFotoDePerfil() {
        return this.fotoDePerfil;
    }

    public abstract void setFotoDePerfil(ImageIcon foto);

    public String getNombreCompleto() {
        String retorno;
        String nombre = getNombre();
        String apellido = getApellido();
        boolean nombreDefinido = nombre != null;
        boolean apellidoDefinido = apellido != null;
        if (nombreDefinido && nombre.equals(NOMBRE_NO_INGRESADO) &&
                    apellidoDefinido && apellido.equals(APELLIDO_NO_INGRESADO)) {
            retorno = NOMBRE_NO_INGRESADO;
        } else if (nombreDefinido && nombre.equals(NOMBRE_NO_INGRESADO)) {
            retorno = apellido;
        } else if (apellidoDefinido && apellido.equals(APELLIDO_NO_INGRESADO)) {
            retorno = nombre;
        } else {
            retorno = nombre + " " + apellido;
        }
        return retorno;
    }

    @Override
    public String toString() {
        return this.getNombreCompleto();
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Persona)){
            return false;
        }
        
        Persona otraPersona = (Persona) obj;
        return this.getNombre().equals(otraPersona.getNombre()) &&
                this.getApellido().equals(otraPersona.getApellido());
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.nombre);
        hash = 37 * hash + Objects.hashCode(this.apellido);
        return hash;
    }
    
}
