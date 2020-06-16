package dominio;

import java.io.Serializable;
        
public final class InformacionMensaje implements Serializable {
    private String mensaje;
    private String destinatario;
    private String remitente;
    private static final long serialVersionUID = 46L;

    public InformacionMensaje(String elRemitente, String destinatario, String elMensaje) {
        setRemitente(elRemitente);
        setDestinatario(destinatario);
        setMensaje(elMensaje);
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String elMensaje) {
        mensaje = elMensaje;
    }

    public String getDestinatario() {
        String destinatarioARetornar = destinatario != null ?
                                        destinatario.trim() : "";
        return !"".equals(destinatarioARetornar) ? destinatarioARetornar : "Destinatario no ingresado";    
    }

    public void setDestinatario(String elDestinatario) {
        destinatario = elDestinatario;

    }

    public String getRemitente() {
        String remitenteARetornar = remitente != null ?
                                        remitente.trim() : "";
        return !"".equals(remitenteARetornar) ? remitenteARetornar : "Remitente no ingresado";
    }

    public void setRemitente(String elRemitente) {
        this.remitente = elRemitente;
    }

    public void intercambiarRemitente() {
        String aux = destinatario;
        destinatario = remitente;
        remitente = aux;
    }

    @Override
    public String toString() {
        return getRemitente() + ": \n" + getMensaje();
    }

}
