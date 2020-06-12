package dominio;

import org.junit.Test;
import static org.junit.Assert.*;

public class InformacionMensajeTest {

    public InformacionMensajeTest() {
    }

    @Test
    public void testGetNullRemitente() {
        String remitente = null;
        String destinatario = null;
        String mensaje = null;
        InformacionMensaje info = new InformacionMensaje(remitente, destinatario, mensaje);
        assertEquals(info.getRemitente(), "Remitente no ingresado");
    }
    
    @Test
    public void testGetEmptyWithoutSpacesRemitente() {
        String remitente = "";
        String destinatario = null;
        String mensaje = null;
        InformacionMensaje info = new InformacionMensaje(remitente, destinatario, mensaje);
        assertEquals(info.getRemitente(), "Remitente no ingresado");
    }
    
    @Test
    public void testGetEmptyWithSpacesRemitente() {
        String remitente = "      ";
        String destinatario = null;
        String mensaje = null;
        InformacionMensaje info = new InformacionMensaje(remitente, destinatario, mensaje);
        assertEquals(info.getRemitente(), "Remitente no ingresado");
    }
    
    @Test
    public void testGetFilledRemitente() {
        String remitente = "Ricky Fort";
        String destinatario = null;
        String mensaje = null;
        InformacionMensaje info = new InformacionMensaje(remitente, destinatario, mensaje);
        assertEquals(info.getRemitente(), remitente);
    }

    @Test
    public void testGetsSetsNullMensaje() {
        String remitente = null;
        String destinatario = null;
        String mensaje = null;
        InformacionMensaje info = new InformacionMensaje(remitente, destinatario, mensaje);
        assertEquals(info.getMensaje(), mensaje);
    }

    @Test
    public void testGetsSetsNullToString() {
        String remitente = null;
        String destinatario = null;
        String mensaje = null;
        InformacionMensaje info = new InformacionMensaje(remitente, destinatario, mensaje);
        String esperadoToString = "Remitente no ingresado" + ": \n" + mensaje;
        assertEquals(info.toString(), esperadoToString);
    }

    @Test
    public void testGetNullDestinatario() {
        String remitente = "";
        String destinatario = null;
        String mensaje = "";
        InformacionMensaje info = new InformacionMensaje(remitente, destinatario, mensaje);
        assertEquals(info.getDestinatario(), "Destinatario no ingresado");
    }
    
    @Test
    public void testGetEmptyWithoutSpacesDestinatario() {
        String remitente = "";
        String destinatario = "";
        String mensaje = "";
        InformacionMensaje info = new InformacionMensaje(remitente, destinatario, mensaje);
        assertEquals(info.getDestinatario(), "Destinatario no ingresado");
    }
    
        @Test
    public void testGetEmptyWithSpacesDestinatario() {
        String remitente = "";
        String destinatario = "      ";
        String mensaje = "";
        InformacionMensaje info = new InformacionMensaje(remitente, destinatario, mensaje);
        assertEquals(info.getDestinatario(), "Destinatario no ingresado");
    }
    
        @Test
    public void testGetFilledDestinatario() {
        String remitente = "";
        String destinatario = "John Travolta";
        String mensaje = "";
        InformacionMensaje info = new InformacionMensaje(remitente, destinatario, mensaje);
        assertEquals(info.getDestinatario(), destinatario);
    }

    @Test
    public void testGetsSetsStringsVaciosMensaje() {
        String remitente = "";
        String destinatario = "";
        String mensaje = "";
        InformacionMensaje info = new InformacionMensaje(remitente, destinatario, mensaje);
        assertEquals(info.getMensaje(), mensaje);
    }

    @Test
    public void testGetsSetsStringsVaciosToString() {
        String remitente = "";
        String destinatario = "";
        String mensaje = "";
        InformacionMensaje info = new InformacionMensaje(remitente, destinatario, mensaje);
        String esperadoToString = "Remitente no ingresado" + ": \n" + mensaje;
        assertEquals(info.toString(), esperadoToString);
    }
    
    @Test
    public void testIntercambiarRemitente() {
        String remitente = "Josep";
        String destinatario = "Richard";
        String mensaje = "";
        InformacionMensaje info = new InformacionMensaje(remitente, destinatario, mensaje);
        info.intercambiarRemitente();
        assertEquals(info.getRemitente(), destinatario);
        assertEquals(info.getDestinatario(), remitente);
    }

}
