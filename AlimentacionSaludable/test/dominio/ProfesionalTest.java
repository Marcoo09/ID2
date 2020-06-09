package dominio;

import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class ProfesionalTest {

    public ProfesionalTest() {
    }

    @Test
    public void testGetsSetsDatosCorrectosGraduacion() {
        String nombre = "Martin";
        String apellido = "Gómez";
        String fechaNacimiento = "11/02/98";
        ImageIcon fotoPerfil = null;
        String tituloProf = "Doctor";
        String fechaGrad = "11/02/2016";
        String paisGraduacion = "Uruguay";
        Profesional prof = new Profesional(nombre, apellido, fechaNacimiento, fotoPerfil,
                tituloProf, fechaGrad, paisGraduacion);
        assertEquals(prof.getFechaGraduacion(), fechaGrad);
    }

    @Test
    public void testGetsDatosCorrectossVaciosPais() {
        String nombre = "Martin";
        String apellido = "Gómez";
        String fechaNacimiento = "11/02/98";
        ImageIcon fotoPerfil = null;
        String tituloProf = "Doctor";
        String fechaGrad = "11/02/2016";
        String paisGraduacion = "Uruguay";
        Profesional prof = new Profesional(nombre, apellido, fechaNacimiento, fotoPerfil,
                tituloProf, fechaGrad, paisGraduacion);
        assertEquals(prof.getPaisGraduacion(), paisGraduacion);
    }

    @Test
    public void testGetsSetsDatosCorrectosTitulo() {
        String nombre = "Martin";
        String apellido = "Gómez";
        String fechaNacimiento = "11/02/98";
        ImageIcon fotoPerfil = null;
        String tituloProf = "Doctor";
        String fechaGrad = "11/02/2016";
        String paisGraduacion = "Uruguay";
        Profesional prof = new Profesional(nombre, apellido, fechaNacimiento, fotoPerfil,
                tituloProf, fechaGrad, paisGraduacion);
        assertEquals(prof.getTituloProfesional(), tituloProf);
    }

    @Test
    public void testToStringDatosCorrectos() {
        String nombre = "Martin";
        String apellido = "Gómez";
        String fechaNacimiento = "11/02/98";
        ImageIcon fotoPerfil = null;
        String tituloProf = "Doctor";
        String fechaGrad = "11/02/2016";
        String paisGraduacion = "Uruguay";
        Profesional prof = new Profesional(nombre, apellido, fechaNacimiento, fotoPerfil,
                tituloProf, fechaGrad, paisGraduacion);
        String toStringEperado = nombre + " " + apellido;
        assertEquals(prof.toString(), toStringEperado);
    }

    public void testToStringDatosVacios() {
        String nombre = "";
        String apellido = "";
        String fechaNacimiento = "";
        ImageIcon fotoPerfil = null;
        String tituloProf = "";
        String fechaGrad = "";
        String paisGraduacion = "";
        Profesional prof = new Profesional(nombre, apellido, fechaNacimiento, fotoPerfil,
                tituloProf, fechaGrad, paisGraduacion);
        String toStringEperado = "Nombre no ingresado";
        assertEquals(prof.toString(), toStringEperado);
    }

        @Test
    public void testSimetriaEquals() {
        String nombre = "";
        String apellido = "";
        String fechaNacimiento = "";
        ImageIcon fotoPerfil = null;
        String tituloProf = "";
        String fechaGrad = "";
        String paisGraduacion = "";
        
        Profesional stubProf1 = new Profesional(nombre, apellido, fechaNacimiento, fotoPerfil,
                tituloProf, fechaGrad, paisGraduacion);
        Profesional stubProf2 = new Profesional(nombre, apellido, fechaNacimiento, fotoPerfil,
                tituloProf, fechaGrad, paisGraduacion);
        
        assertTrue(stubProf1.equals(stubProf2) && stubProf2.equals(stubProf1));
        assertTrue(stubProf1.hashCode() == stubProf2.hashCode());
    }
    
    @Test
    public void testEqualsDiferentesComparandoConNull() {
        Profesional stubProf = new Profesional(null, null, null, null,
                null, null, null);
        boolean sonIguales = stubProf.equals(null);
        assertFalse(sonIguales);
    }
    
    @Test
    public void testEqualsDiferentesEnTitulo() {
        String nombre = "";
        String apellido = "";
        String fechaNacimiento = "";
        ImageIcon fotoPerfil = null;
        String tituloProf1 = "A";
        String tituloProf2 = "B";
        String fechaGrad = "";
        String paisGraduacion = "";
        
        Profesional stubProf1 = new Profesional(nombre, apellido, fechaNacimiento, fotoPerfil,
                tituloProf1, fechaGrad, paisGraduacion);
        Profesional stubProf2 = new Profesional(nombre, apellido, fechaNacimiento, fotoPerfil,
                tituloProf2, fechaGrad, paisGraduacion);
        
        boolean sonIguales = stubProf1.equals(stubProf2);
        assertFalse(sonIguales);
    }
    
    @Test
    public void testEqualsDiferentesEnFechaGraduacion() {
        String nombre = "";
        String apellido = "";
        String fechaNacimiento = "";
        ImageIcon fotoPerfil = null;
        String tituloProf = "A";
        String fechaGrad1 = "11/05/12";
        String fechaGrad2 = "15/06/06";
        String paisGraduacion = "";
        
        Profesional stubProf1 = new Profesional(nombre, apellido, fechaNacimiento, fotoPerfil,
                tituloProf, fechaGrad1, paisGraduacion);
        Profesional stubProf2 = new Profesional(nombre, apellido, fechaNacimiento, fotoPerfil,
                tituloProf, fechaGrad2, paisGraduacion);
        
        boolean sonIguales = stubProf1.equals(stubProf2);
        assertFalse(sonIguales);
    }
    
    @Test
    public void testEqualsDiferentesEnPaisGraduacion() {
        String nombre = "";
        String apellido = "";
        String fechaNacimiento = "";
        ImageIcon fotoPerfil = null;
        String tituloProf = "A";
        String fechaGrad = "11/05/12";
        String paisGraduacion1 = "Uruguay";
        String paisGraduacion2 = "Argentina";
        
        Profesional stubProf1 = new Profesional(nombre, apellido, fechaNacimiento, fotoPerfil,
                tituloProf, fechaGrad, paisGraduacion1);
        Profesional stubProf2 = new Profesional(nombre, apellido, fechaNacimiento, fotoPerfil,
                tituloProf, fechaGrad, paisGraduacion2);
        
        boolean sonIguales = stubProf1.equals(stubProf2);
        assertFalse(sonIguales);
    }
    
    @Test
    public void testEqualsDiferentesComparandoOtrosTipos() {
        Ingesta stubIngesta = new Ingesta(null,null);          
        Profesional stubProf = new Profesional(null, null, null, null,
                null, null, null);
        boolean sonIguales = stubProf.equals(stubIngesta);
        assertFalse(sonIguales);
    }
    
    @Test
    public void testSetFotoPerfilSinImagen() {
        Profesional stubProf = new Profesional(null, null, null, null,
                null, null, null);
        stubProf.setFotoDePerfil(null);
        assertNotEquals(stubProf.getFotoDePerfil(),null);
    }  
    
    @Test
    public void testSetFotoPerfileConImagen() {
        ImageIcon stubImage = new ImageIcon("testPath");
        Profesional stubProf = new Profesional(null, null, null, null,
                null, null, null);
        stubProf.setFotoDePerfil(stubImage);
        assertEquals(stubProf.getFotoDePerfil(),stubImage);
    } 

}
