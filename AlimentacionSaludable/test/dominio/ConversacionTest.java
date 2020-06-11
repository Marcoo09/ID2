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


}
