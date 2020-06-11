package dominio;

import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
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
    public void testEqualsDiferentes() {
        Alimento alimentoTest = new Alimento("Rabanito", "", null, null);
        Alimento alimentoTest2 = new Alimento("Papa", "", null, null);
        boolean sonIguales = alimentoTest.equals(alimentoTest2);
        assertFalse(sonIguales);
    }

}
