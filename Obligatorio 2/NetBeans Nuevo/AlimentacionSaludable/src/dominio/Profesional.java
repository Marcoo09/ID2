package dominio;

import java.util.Objects;
import javax.swing.ImageIcon;

public final class Profesional extends Persona {
    private String tituloProfesional;
    private String fechaGraduacion;
    private String paisGraduacion;
    private static final long serialVersionUID = 49L;

    public Profesional(String unNombre,
            String unApellido,
            String unaFechaNacimiento,
            ImageIcon unaFoto,
            String unTitulo,
            String unaFechaGraduacion,
            String unPaisGraduacion) {

        setNombre(unNombre);
        setApellido(unApellido);
        setFechaNacimiento(unaFechaNacimiento);
        setFotoDePerfil(unaFoto);
        setTituloProfesional(unTitulo);
        setFechaGraduacion(unaFechaGraduacion);
        setPaisGraduacion(unPaisGraduacion);
    }

    public String getTituloProfesional() {
        return this.tituloProfesional;
    }

    public void setTituloProfesional(String unTitulo) {
        if (unTitulo == null || unTitulo.isEmpty()) {
            this.tituloProfesional = "Titulo no declarado";
        } else {
            this.tituloProfesional = unTitulo;
        }
    }

    public String getFechaGraduacion() {
        return this.fechaGraduacion;
    }

    public void setFechaGraduacion(String unaFechaGraduacion) {
        if (unaFechaGraduacion == null || unaFechaGraduacion.isEmpty()) {
            this.fechaGraduacion = "Fecha no ingresada";
        } else {
            this.fechaGraduacion = unaFechaGraduacion;
        }
    }

    public String getPaisGraduacion() {
        return this.paisGraduacion;
    }

    public void setPaisGraduacion(String unPaisGraduacion) {
        paisGraduacion = unPaisGraduacion;

    }

    @Override
    public void setFotoDePerfil(ImageIcon foto) {
        if (foto == null) {
            this.fotoDePerfil = new ImageIcon(getClass().getResource("/Imagenes/fotoDeUsuarioStandard.png"));
        } else {
            this.fotoDePerfil = foto;
        }
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.tituloProfesional);
        hash = 83 * hash + Objects.hashCode(this.fechaGraduacion);
        hash = 83 * hash + Objects.hashCode(this.paisGraduacion);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Profesional other = (Profesional) obj;
        if (!Objects.equals(this.tituloProfesional, other.tituloProfesional)) {
            return false;
        }
        if (!Objects.equals(this.fechaGraduacion, other.fechaGraduacion)) {
            return false;
        }
        if (!Objects.equals(this.paisGraduacion, other.paisGraduacion)) {
            return false;
        }
        return true;
    }
    
    

}
