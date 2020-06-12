package dominio;

import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;
import org.junit.Test;

public class AlimentoTest {

    public AlimentoTest() {
    }

    @Test
    public void testSetsGetsNullTipo() {
        Alimento alimentoTest = new Alimento(null, null, null, null);
        assertEquals(alimentoTest.getTipoAlimento(), null);
    }

    @Test
    public void testSetsGetsNullListaNutrientes() {
        Alimento alimentoTest = new Alimento(null, null, null, null);
        assertFalse(alimentoTest.getListaNutrientesConProporcion() != null);
    }

    @Test
    public void testSetsGetsDatosCorrectosNombre() {
        ArrayList<ComposicionAlimento> listaComposicion = new ArrayList<>();
        listaComposicion.add(new ComposicionAlimento("Lipidos", 2));
        Alimento alimentoTest = new Alimento("Papa", "Verdura", listaComposicion, null);
        assertEquals(alimentoTest.getNombre(), "Papa");
    }

    @Test
    public void testSetsGetsDatosCorrectosTipo() {
        ArrayList<ComposicionAlimento> listaComposicion = new ArrayList<>();
        listaComposicion.add(new ComposicionAlimento("Lipidos", 2));
        Alimento alimentoTest = new Alimento("Papa", "Verdura", listaComposicion, null);
        assertEquals(alimentoTest.getTipoAlimento(), "Verdura");
    }

    @Test
    public void testSetsGetsDatosCorrectosNutrientes() {
        ArrayList<ComposicionAlimento> listaComposicion = new ArrayList<>();
        listaComposicion.add(new ComposicionAlimento("Lipidos", 2));
        Alimento alimentoTest = new Alimento("Papa", "Verdura", listaComposicion, null);
        assertEquals(alimentoTest.getListaNutrientesConProporcion(), listaComposicion);
    }

    @Test
    public void testSetsGetsListaNutrientesDatosVacios() {
        List<ComposicionAlimento> listaNutrientes = new ArrayList<>();
        Alimento alimentoTest = new Alimento("", "", listaNutrientes, null);
        assertEquals(alimentoTest.getListaNutrientesConProporcion().size(), 0);
    }

    @Test
    public void testSetsGetsNombreDatosVacios() {
        Alimento alimentoTest = new Alimento("", "", null, null);
        assertEquals(alimentoTest.getNombre(), "Nombre de alimento no ingresado");
    }

    @Test
    public void testSetsGetsTipoDatosVacios() {
        Alimento alimentoTest = new Alimento("", "", null, null);
        assertEquals(alimentoTest.getTipoAlimento(), "");
    }

    @Test
    public void testToStringNullNombre() {
        Alimento alimentoTest = new Alimento("", "", null, null);
        assertEquals(alimentoTest.getNombre(), "Nombre de alimento no ingresado");
    }

    @Test
    public void testToStringNull() {
        Alimento alimentoTest = new Alimento("", "", null, null);
        assertEquals(alimentoTest.toString(), "Nombre de alimento no ingresado");
    }

    @Test
    public void testToStringDatosCorrectos() {
        Alimento alimentoTest = new Alimento("Papa", "", null, null);
        assertEquals(alimentoTest.toString(), "Papa");
    }

    @Test
    public void testEqualsIguales() {
        Alimento alimentoTest = new Alimento("Papa", "", null, null);
        Alimento alimentoTest2 = new Alimento("Papa", "", null, null);
        assertEquals(alimentoTest, alimentoTest2);
    }

    @Test
    public void testEqualsDiferentesComparandoAlimentos() {
        Alimento alimentoTest = new Alimento("Rabanito", "", null, null);
        Alimento alimentoTest2 = new Alimento("Papa", "", null, null);
        boolean sonIguales = alimentoTest.equals(alimentoTest2);
        assertFalse(sonIguales);
    }

    @Test
    public void testEqualsDiferentesComparandoOtrosTipos() {
        Alimento stubAlimento = new Alimento("Rabanito", "", null, null);
        InformacionMensaje stubInfo = new InformacionMensaje(null, null, null);
        boolean sonIguales = stubAlimento.equals(stubInfo);
        assertFalse(sonIguales);
    }
    
    @Test
    public void testSetFotoAlimentoSinImagen() {
        Alimento stubAlimento = new Alimento("Rabanito", "", null, null);
        stubAlimento.setFotoDelAlimento(null);
        assertNotEquals(stubAlimento.getFotoDelAlimento(),null);
    }  
    
    @Test
    public void testSetFotoAlimentoConImagen() {
        ImageIcon stubImage = new ImageIcon("testPath");
        Alimento stubAlimento = new Alimento("Rabanito", "", null, null);
        stubAlimento.setFotoDelAlimento(stubImage);
        assertEquals(stubAlimento.getFotoDelAlimento(),stubImage);
    }  
    
    @Test
    public void testGetFotoDelAlimento() {
        ImageIcon stubImage = new ImageIcon("testPath");
        Alimento stubAlimento = new Alimento("Rabanito", "", null, stubImage);
        assertEquals(stubAlimento.getFotoDelAlimento(),stubImage);
    }   

    @Test
    public void testSimetriaEquals() {
        Alimento stubAlimento1 = new Alimento("Foo Bar",null,null,null);  
        Alimento stubAlimento2 = new Alimento("Foo Bar",null,null,null);  
        assertTrue(stubAlimento1.equals(stubAlimento2) && stubAlimento2.equals(stubAlimento1));
        assertTrue(stubAlimento1.hashCode() == stubAlimento2.hashCode());
    }
}
