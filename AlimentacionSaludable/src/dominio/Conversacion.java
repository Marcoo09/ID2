package dominio;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public final class Conversacion implements Serializable {

    private List<InformacionMensaje> listaMensajes;
    private Usuario usuario;
    private Profesional profesional;
    private boolean fueAtendidaConsulta;
    private static final long serialVersionUID = 45L;

    public Conversacion(Usuario user, Profesional pr, List<InformacionMensaje> lista) {
        setUsuario(user);
        setProfesional(pr);
        setListaMensajes(lista);
        setFueAtendidaConsulta(false);
    }

    public boolean getFueAtendidaConsulta() {
        return fueAtendidaConsulta;
    }

    public void setFueAtendidaConsulta(boolean fueAtendida) {
        this.fueAtendidaConsulta = fueAtendida;
    }

    public List<InformacionMensaje> getListaMensajes() {
        return this.listaMensajes;
    }

    public void setListaMensajes(List<InformacionMensaje> lista) {
        this.listaMensajes = lista;
    }

    public Persona getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario unUsuario) {
        if (unUsuario == null) {
            this.usuario = new Usuario(null, null, null, null, null, null, null, null);
        } else {
            this.usuario = unUsuario;
        }
    }

    public Persona getProfesional() {
        return this.profesional;
    }

    public void setProfesional(Profesional unProfesional) {
        if (unProfesional == null) {
            this.profesional = new Profesional(null, null, null, null, null, null, null);
        } else {
            this.profesional = unProfesional;
        }
    }

    public void agregarMensaje(String mensaje, boolean intercambioRemitente) {
        InformacionMensaje informacion = new InformacionMensaje(getUsuario().getNombreCompleto(), getProfesional().getNombreCompleto(), mensaje);
        if (intercambioRemitente) {
            informacion.intercambiarRemitente();
        }
        listaMensajes.add(informacion);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Conversacion)) {
            return false;
        }

        final Conversacion conversacionParametro = (Conversacion) obj;
        return getProfesional().equals(conversacionParametro.getProfesional())
                && getUsuario().equals(conversacionParametro.getUsuario());
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.usuario);
        hash = 89 * hash + Objects.hashCode(this.profesional);
        return hash;
    }

    @Override
    public String toString() {
        String retorno = "No hay mensajes para mostrar";
        if (!getListaMensajes().isEmpty()) {
            retorno = "";
            retorno = listaMensajes.stream().map((InformacionMensaje info) -> "\n" + info.getRemitente() + "\n"
                    + info.getMensaje() + "\n").reduce(retorno, String::concat);
        }
        return retorno;
    }

}
