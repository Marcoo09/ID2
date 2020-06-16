package dominio;

import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import org.junit.Test;
import static org.junit.Assert.*;

public class UsuarioTest {

    public UsuarioTest() {
    }

    @Test
    public void testGetsSetsVaciosListaAlimentos() {
        Usuario usuario = new Usuario("", "", "", null, "", null, null, null);
        assertEquals(usuario.getAlimentosIngeridos().size(), 0);
    }

    @Test
    public void testGetsSetsVaciosRestricciones() {
        Usuario usuario = new Usuario("", "", "", null, "", null, null, null);
        assertEquals(usuario.getRestricciones().size(), 0);
    }

    @Test
    public void testGetsSetsVaciosPreferencias() {
        Usuario usuario = new Usuario("", "", "", null, "", null, null, null);
        assertEquals(usuario.getPreferencias().size(), 0);
    }

    @Test
    public void testGetsSetsNullNombre() {
        Usuario usuario = new Usuario(null, null, null, null, null, null, null, null);
        assertEquals(usuario.getNombre(), null);
    }

    @Test
    public void testGetsSetsNullApellido() {
        Usuario usuario = new Usuario(null, null, null, null, null, null, null, null);
        assertEquals(usuario.getApellido(), "Apellido no ingresado");
    }

    @Test
    public void testGetsSetsNullFechaNacimiento() {
        Usuario usuario = new Usuario(null, null, null, null, null, null, null, null);
        assertEquals(usuario.getFechaNacimiento(), "Fecha no ingresada");
    }

    @Test
    public void testGetsSetsNullNacionalidad() {
        Usuario usuario = new Usuario(null, null, null, null, null, null, null, null);
        assertEquals(usuario.getNacionalidad(), null);
    }

    @Test
    public void testGetsSetsNullListaAlimentos() {
        Usuario usuario = new Usuario(null, null, null, null, null, null, null, null);
        assertEquals(usuario.getAlimentosIngeridos().size(), 0);
    }

    @Test
    public void testGetsSetsNullRestricciones() {
        Usuario usuario = new Usuario(null, null, null, null, null, null, null, null);
        assertEquals(usuario.getRestricciones().size(), 0);
    }

    @Test
    public void testGetsSetsNullPreferencias() {
        Usuario usuario = new Usuario(null, null, null, null, null, null, null, null);
        assertEquals(usuario.getPreferencias().size(), 0);
    }
    
    @Test
    public void testSimetriaEquals() {
        String nombre = "";
        String apellido = "";
        String fechaNacimiento = "";
        ImageIcon fotoPerfil = null;
        String nacionalidad = "Uruguay";
        
        Usuario stubUsuario1 = new Usuario(nombre,apellido,fechaNacimiento,
                fotoPerfil,nacionalidad,null,null,null);
        Usuario stubUsuario2 = new Usuario(nombre,apellido,fechaNacimiento,
                fotoPerfil,nacionalidad,null,null,null);
        
        assertTrue(stubUsuario1.equals(stubUsuario2) && stubUsuario2.equals(stubUsuario1));
        assertTrue(stubUsuario1.hashCode() == stubUsuario2.hashCode());
    }
    
    @Test
    public void testEqualsDiferentesComparandoConNull() {
        Usuario stubUsuario = new Usuario(null, null, null, null,
                null, null, null,null);
        boolean sonIguales = stubUsuario.equals(null);
        assertFalse(sonIguales);
    }
    
    @Test
    public void testEqualsDiferentesEnNacionalidad() {
        String nacionalidad1 = "Uruguay";
        String nacionalidad2 = "Argentina";
        
        Usuario stubUsuario1 = new Usuario(null, null, null, null,
                nacionalidad1, null, null,null);
        Usuario stubUsuario2 = new Usuario(null, null, null, null,
                nacionalidad2, null, null,null);
        boolean sonIguales = stubUsuario1.equals(stubUsuario2);
        assertFalse(sonIguales);
    }
    
    @Test
    public void testEqualsDiferentesEnPreferencias() {
        String nacionalidad = "Uruguay";
        List<String> preferencias1 = new ArrayList<>();
        List<String> preferencias2 = new ArrayList<>();
        preferencias1.add("Preferencia 1");
        preferencias2.add("Preferencia 2");
        
        Usuario stubUsuario1 = new Usuario(null, null, null, null,
                nacionalidad, preferencias1, null,null);
        Usuario stubUsuario2 = new Usuario(null, null, null, null,
                nacionalidad, preferencias2, null,null);
        boolean sonIguales = stubUsuario1.equals(stubUsuario2);
        assertFalse(sonIguales);
    }
    
    @Test
    public void testEqualsDiferentesEnRestricciones() {
        String nacionalidad = "Uruguay";
        List<String> preferencias = new ArrayList<>();
        List<String> restricciones1 = new ArrayList<>();
        List<String> restricciones2 = new ArrayList<>();
        
        preferencias.add("Preferencia 1");
        restricciones1.add("Restricción 1");
        restricciones2.add("Restricción 2");

        Usuario stubUsuario1 = new Usuario(null, null, null, null,
                nacionalidad, preferencias, restricciones1,null);
        Usuario stubUsuario2 = new Usuario(null, null, null, null,
                nacionalidad, preferencias, restricciones2,null);
        boolean sonIguales = stubUsuario1.equals(stubUsuario2);
        assertFalse(sonIguales);
    }
    
    @Test
    public void testEqualsDiferentesEnAlimentosIngeridos() {
        String nacionalidad = "Uruguay";
        Ingesta ingesta1 = new Ingesta("11/05/11",null);
        Ingesta ingesta2 = new Ingesta("18/05/11",null);
        List<String> preferencias = new ArrayList<>();
        List<String> restricciones = new ArrayList<>();
        List<Ingesta> alimentosIngeridos1 = new ArrayList<>();
        List<Ingesta> alimentosIngeridos2 = new ArrayList<>();

        preferencias.add("Preferencia 1");
        restricciones.add("Restricción 1");
        alimentosIngeridos1.add(ingesta1);
        alimentosIngeridos2.add(ingesta2);

        Usuario stubUsuario1 = new Usuario(null, null, null, null,
                nacionalidad, preferencias, restricciones,alimentosIngeridos1);
        Usuario stubUsuario2 = new Usuario(null, null, null, null,
                nacionalidad, preferencias, restricciones,alimentosIngeridos2);
        boolean sonIguales = stubUsuario1.equals(stubUsuario2);
        assertFalse(sonIguales);
    }
    
    @Test
    public void testEqualsDiferentesComparandoOtrosTipos() {
        Ingesta stubIngesta = new Ingesta(null,null);          
        Usuario stubUsuario = new Usuario(null, null, null, null,
                null, null, null,null);
        boolean sonIguales = stubUsuario.equals(stubIngesta);
        assertFalse(sonIguales);
    }
    
    @Test
    public void testEqualsConSiMismo() {
        Usuario stubUsuario = new Usuario(null, null, null, null,
                null, null, null,null);
        boolean sonIguales = stubUsuario.equals(stubUsuario);
        assertTrue(sonIguales);
    }
    
    @Test
    public void testSetFotoPerfilSinImagen() {
        Usuario stubUsuario = new Usuario(null, null, null, null,
                null, null, null,null);
        stubUsuario.setFotoDePerfil(null);
        assertNotEquals(stubUsuario.getFotoDePerfil(),null);
    }  
    
    @Test
    public void testSetFotoPerfileConImagen() {
        ImageIcon stubImage = new ImageIcon("testPath");
        Usuario stubUsuario = new Usuario(null, null, null, null,
                null, null, null,null);
        stubUsuario.setFotoDePerfil(stubImage);
        assertEquals(stubUsuario.getFotoDePerfil(),stubImage);
    } 
    
    @Test
    public void testActualizarPreferenciasUsuario() {
        Usuario stubUsuario = new Usuario(null, null, null, null,
                null, null, null,null);
        List<String> preferencias = new ArrayList<>();
        preferencias.add("Preferencia 1");

        stubUsuario.actualizarPreferenciasUsuario(stubUsuario, preferencias);
        assertEquals(stubUsuario.getPreferencias(),preferencias);
    } 
    
    @Test
    public void testGetArrayPreferencias() {
        List<String> preferencias = new ArrayList<>();
        String preferencia = "Preferencia 1";
        preferencias.add(preferencia);
        
        Usuario stubUsuario = new Usuario(null, null, null, null,
                null, preferencias, null,null);
        
        String[] resultadoEsperado = {preferencia};
        
        stubUsuario.actualizarPreferenciasUsuario(stubUsuario, preferencias);
        assertArrayEquals(stubUsuario.getArrayPreferencias(),resultadoEsperado);
    } 
    
    @Test
    public void testActualizarRestriccionesUsuario() {
        Usuario stubUsuario = new Usuario(null, null, null, null,
                null, null, null,null);
        List<String> restricciones = new ArrayList<>();
        restricciones.add("Restricciones 1");

        stubUsuario.actualizarRestriccionesUsuario(stubUsuario, restricciones);
        assertEquals(stubUsuario.getRestricciones(),restricciones);
    } 
    
    @Test
    public void testGetArrayRestricciones() {
        String restriccion = "Restricciones 1";
        List<String> restricciones = new ArrayList<>();
        restricciones.add(restriccion);
        
        Usuario stubUsuario = new Usuario(null, null, null, null,
                null, null, restricciones,null);
        
        String[] resultadoEsperado = {restriccion};
        
        stubUsuario.actualizarPreferenciasUsuario(stubUsuario, restricciones);
        assertArrayEquals(stubUsuario.getArrayRestricciones(),resultadoEsperado);
    } 
    
    @Test
    public void testGetAlimentosIngeridos() {
        Ingesta ingesta = new Ingesta("11/05/11",null);
        List<Ingesta> alimentosIngeridos = new ArrayList<>();
        alimentosIngeridos.add(ingesta);
        
        Usuario stubUsuario = new Usuario(null, null, null, null,
                null, null, null,alimentosIngeridos);

        assertEquals(stubUsuario.getAlimentosIngeridos(),alimentosIngeridos);
    } 
    
    @Test
    public void testGetArrayAlimentosIngeridos() {
        Ingesta ingesta = new Ingesta("11/05/11",new ArrayList<>());
        List<Ingesta> alimentosIngeridos = new ArrayList<>();
        alimentosIngeridos.add(ingesta);
        
        Usuario stubUsuario = new Usuario(null, null, null, null,
                null, null, null,alimentosIngeridos);
        
        String[] resultadoEsperado = {ingesta.toString()};
        
        assertArrayEquals(stubUsuario.getArrayAlimentosIngeridos(),resultadoEsperado);
    } 
}
