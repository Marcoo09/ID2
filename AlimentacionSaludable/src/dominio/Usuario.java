package dominio;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.swing.ImageIcon;

public final class Usuario extends Persona {

    private String nacionalidad;
    private List<String> preferencias;
    private List<String> restricciones;
    private List<Ingesta> alimentosIngeridos;
    private static final long serialVersionUID = 50L;

    public Usuario(String unNombre,
            String unApellido,
            String unaFechaNacimiento,
            ImageIcon unaFotoDePerfil,
            String unaNacionalidad,
            List<String> listaPreferencias,
            List<String> listaRestricciones,
            List<Ingesta> listaAlimentos) {

        this.setNombre(unNombre);
        this.setApellido(unApellido);
        this.setFechaNacimiento(unaFechaNacimiento);
        this.setFotoDePerfil(unaFotoDePerfil);
        this.setNacionalidad(unaNacionalidad);
        this.setPreferencias(listaPreferencias);
        this.setRestricciones(listaRestricciones);
        this.setAlimentosIngeridos(listaAlimentos);
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String unaNacionalidad) {

        nacionalidad = unaNacionalidad;

    }

    public List<String> getPreferencias() {
        return this.preferencias;
    }

    public void setPreferencias(List<String> listaPreferencias) {
        if (listaPreferencias == null) {
            listaPreferencias = new ArrayList<>();
        }
        this.preferencias = listaPreferencias;
    }

    public List<String> getRestricciones() {
        return this.restricciones;
    }

    public void setRestricciones(List<String> listaRestricciones) {
        if (listaRestricciones == null) {
            listaRestricciones = new ArrayList<>();
        }
        this.restricciones = listaRestricciones;
    }

    public List<Ingesta> getAlimentosIngeridos() {
        return this.alimentosIngeridos;
    }

    public void setAlimentosIngeridos(List<Ingesta> listaAlimentos) {
        if (listaAlimentos == null) {
            listaAlimentos = new ArrayList<>();
        }
        this.alimentosIngeridos = listaAlimentos;
    }

    public String[] getArrayAlimentosIngeridos() {
        String[] retorno = new String[getAlimentosIngeridos().size()];
        for (int i = 0; i < getAlimentosIngeridos().size(); i++) {
            retorno[i] = getAlimentosIngeridos().get(i).toString();
        }
        return retorno;
    }

    public String[] getArrayRestricciones() {
        String[] retorno = new String[getRestricciones().size()];
        for (int i = 0; i < getRestricciones().size(); i++) {
            retorno[i] = getRestricciones().get(i);
        }
        return retorno;
    }

    public String[] getArrayPreferencias() {
        String[] retorno = new String[getPreferencias().size()];
        for (int i = 0; i < getPreferencias().size(); i++) {
            retorno[i] = getPreferencias().get(i);
        }
        return retorno;
    }

    @Override
    public void setFotoDePerfil(ImageIcon foto) {
        if (foto == null) {
            this.fotoDePerfil = new ImageIcon(getClass().getResource("/Imagenes/fotoDeUsuarioStandard.png"));
        } else {
            this.fotoDePerfil = foto;
        }
    }

    public void actualizarPreferenciasUsuario(Usuario usuario, List<String> pr) {
        usuario.setPreferencias(pr);
    }

    public void actualizarRestriccionesUsuario(Usuario usuario, List<String> restricciones) {
        usuario.setRestricciones(restricciones);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.nacionalidad);
        hash = 29 * hash + Objects.hashCode(this.preferencias);
        hash = 29 * hash + Objects.hashCode(this.restricciones);
        hash = 29 * hash + Objects.hashCode(this.alimentosIngeridos);
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
        final Usuario other = (Usuario) obj;
        if (!Objects.equals(this.nacionalidad, other.nacionalidad)) {
            return false;
        }
        if (!Objects.equals(this.preferencias, other.preferencias)) {
            return false;
        }
        if (!Objects.equals(this.restricciones, other.restricciones)) {
            return false;
        }
        if (!Objects.equals(this.alimentosIngeridos, other.alimentosIngeridos)) {
            return false;
        }
        return true;
    }

    
}
