package dominio;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

public class ConversacionTest {

    public ConversacionTest() {
    }

    @Test
    public void testGetSetsNullUsuario() {
        Usuario usuario = null;
        Profesional profesional = null;
        List<InformacionMensaje> listaMensajes = null;
        Conversacion conversacionATestear = new Conversacion(usuario, profesional, listaMensajes);
        Usuario usuarioEsperado = new Usuario(null, null, null, null, null, null, null,null);
        assertEquals(conversacionATestear.getUsuario(), usuarioEsperado);
    }

    @Test
    public void testGetSetsNullProfesional() {
        Usuario usuario = null;
        Profesional profesional = null;
        List<InformacionMensaje> listaMensajes = null;
        Conversacion conversacionATestear = new Conversacion(usuario, profesional, listaMensajes);
        Persona profesionalEsperado = new Profesional(null, null, null, null, null, null, null);
        assertEquals(conversacionATestear.getProfesional(), profesionalEsperado);
    }

    @Test
    public void testGetSetsNullLsitaMensajes() {
        Usuario usuario = null;
        Profesional profesional = null;
        List<InformacionMensaje> listaMensajes = new ArrayList<>();
        Conversacion conversacionATestear = new Conversacion(usuario, profesional, listaMensajes);
        assertEquals(conversacionATestear.getListaMensajes().size(), 0);
    }

    @Test
    public void testGetSetsNullToString() {
        Usuario usuario = null;
        Profesional profesional = null;
        List<InformacionMensaje> listaMensajes = null;
        Conversacion conversacionATestear = new Conversacion(usuario, profesional, listaMensajes);
        assertEquals(conversacionATestear.toString(), "No hay mensajes para mostrar");
    }


    @Test
    public void testGetSetsDatosVaciosProfesional() {
        Usuario usuario = new Usuario(null, null, null, null, null, null, null, null);
        Profesional profesional = new Profesional(null, null, null, null, null, null, null);
        List<InformacionMensaje> listaMensajes = new ArrayList<>();
        Conversacion conversacionATestear = new Conversacion(usuario, profesional, listaMensajes);
        Persona profesionalEsperado = new Profesional(null, null, null, null, null, null, null);
        assertEquals(conversacionATestear.getProfesional(), profesionalEsperado);
    }

    @Test
    public void testGetSetsDatosVaciosListaMensajes() {
        Usuario usuario = new Usuario(null, null, null, null, null, null, null, null);
        Profesional profesional = new Profesional(null, null, null, null, null, null, null);
        List<InformacionMensaje> listaMensajes = new ArrayList<>();
        Conversacion conversacionATestear = new Conversacion(usuario, profesional, listaMensajes);
        assertEquals(conversacionATestear.getListaMensajes().size(), 0);
    }

    @Test
    public void testGetSetsDatosVaciosToString() {
        Usuario usuario = new Usuario(null, null, null, null, null, null, null, null);
        Profesional profesional = new Profesional(null, null, null, null, null, null, null);
        List<InformacionMensaje> listaMensajes = new ArrayList<>();
        Conversacion conversacionATestear = new Conversacion(usuario, profesional, listaMensajes);
        assertEquals(conversacionATestear.toString(), "No hay mensajes para mostrar");
    }

    @Test
    public void testSimetriaEquals() {
        Usuario usuario = new Usuario(null, null, null, null, null, null, null, null);
        Profesional profesional = new Profesional(null, null, null, null, null, null, null);
        List<InformacionMensaje> listaMensajes = new ArrayList<>();
        Conversacion stubConversacion1 = new Conversacion(usuario, profesional, listaMensajes);
        Conversacion stubConversacion2 = new Conversacion(usuario, profesional, listaMensajes);

        assertTrue(stubConversacion1.equals(stubConversacion2) && stubConversacion2.equals(stubConversacion1));
        assertTrue(stubConversacion1.hashCode() == stubConversacion2.hashCode());
    }
    
    @Test
    public void testGetFueAtendidaConsulta(){
        Conversacion stubConversacion = new Conversacion(null,null,null);
        stubConversacion.setFueAtendidaConsulta(true);
        assertTrue(stubConversacion.getFueAtendidaConsulta());
    }
    
}
