package dominio;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

public class IngestaTest {

    public IngestaTest() {

    }
    @Test
    public void testGetsSetsDatosValidosListaAlimentos() {
        String fechaDeIngesta = "11/02/17";
        List<ComposicionAlimento> listaComposicion = new ArrayList<>();
        listaComposicion.add(new ComposicionAlimento("Lipidos", 2));
        Alimento alimento1 = new Alimento("Papa", "Verdura", listaComposicion, null);
        List<Alimento> listaAlimentosPorFecha = new ArrayList<>();
        listaAlimentosPorFecha.add(alimento1);
        Ingesta ingestaATestear = new Ingesta(fechaDeIngesta, listaAlimentosPorFecha);
        assertEquals(ingestaATestear.getListaAlimentosPorFecha(), listaAlimentosPorFecha);
    }

    @Test
    public void testGetsSetsDatosValidosToString() {
        String fechaDeIngesta = "11/02/17";
        List<ComposicionAlimento> listaComposicion = new ArrayList<>();
        listaComposicion.add(new ComposicionAlimento("Lipidos", 2));
        Alimento alimento1 = new Alimento("Papa", "Verdura", listaComposicion, null);
        List<Alimento> listaAlimentosPorFecha = new ArrayList<>();
        listaAlimentosPorFecha.add(alimento1);
        Ingesta ingestaATestear = new Ingesta(fechaDeIngesta, listaAlimentosPorFecha);
        String toStringEsperado = "Lista de alimentos ingeridos" + listaAlimentosPorFecha;
        assertEquals(ingestaATestear.toString(), toStringEsperado);
    }

    @Test
    public void testEqualsIgualesLista() {
        String fechaDeIngesta = "11/02/17";
        List<ComposicionAlimento> listaComposicion = new ArrayList<>();
        listaComposicion.add(new ComposicionAlimento("Lipidos", 2));
        Alimento alimento1 = new Alimento("Papa", "Verdura", listaComposicion, null);
        List<Alimento> listaAlimentosPorFecha = new ArrayList<>();
        listaAlimentosPorFecha.add(alimento1);
        Ingesta ingestaATestear = new Ingesta(fechaDeIngesta, listaAlimentosPorFecha);
        Ingesta ingestaAComparar = new Ingesta(fechaDeIngesta, listaAlimentosPorFecha);
        boolean resultadoEquals = ingestaATestear.equals(ingestaAComparar);
        assertTrue(resultadoEquals);
    }

    @Test
    public void testEqualsDistintosFecha() {
        String fechaDeIngesta = "11/02/17";
        List<ComposicionAlimento> listaComposicion = new ArrayList<>();
        listaComposicion.add(new ComposicionAlimento("Lipidos", 2));
        Alimento alimento1 = new Alimento("Papa", "Verdura", listaComposicion, null);
        List<Alimento> listaAlimentosPorFecha = new ArrayList<>();
        listaAlimentosPorFecha.add(alimento1);
        Ingesta ingestaATestear = new Ingesta(fechaDeIngesta, listaAlimentosPorFecha);
        Ingesta ingestaAComparar = new Ingesta(fechaDeIngesta, new ArrayList<>());
        boolean resultadoEquals = ingestaATestear.equals(ingestaAComparar);
        assertFalse(resultadoEquals);
    }

    @Test
    public void testSimetriaEquals() {
        String stubFecha = "11/02/17";
        List<ComposicionAlimento> stubListaComposicion = new ArrayList<>();
        stubListaComposicion.add(new ComposicionAlimento("Lipidos", 2));        
        Alimento stubAlimento = new Alimento("Papa", "Verdura", stubListaComposicion, null);
        List<Alimento> stubListaAlimentos = new ArrayList<>();
        stubListaAlimentos.add(stubAlimento);
        
        Ingesta stubIngesta1 = new Ingesta(stubFecha,stubListaAlimentos);  
        Ingesta stubIngesta2 = new Ingesta(stubFecha,stubListaAlimentos);  
        
        assertTrue(stubIngesta1.equals(stubIngesta2) && stubIngesta2.equals(stubIngesta1));
        assertTrue(stubIngesta1.hashCode() == stubIngesta2.hashCode());
    }
    
    @Test
    public void testToStringSinAlimentos() {
        String stubFecha = "11/02/17";
        List<Alimento> stubListaAlimentos = new ArrayList<>();
        
        Ingesta stubIngesta = new Ingesta(stubFecha,stubListaAlimentos);          
      
        String resultadoEsperado = "No hay alimentos ingeridos";
        assertEquals(stubIngesta.toString(),resultadoEsperado);
    }
    
    @Test
    public void testEqualsDiferentesComparandoOtrosTipos() {
        Ingesta stubIngesta = new Ingesta(null,null);          
        InformacionMensaje stubInfo = new InformacionMensaje(null, null, null);
        boolean sonIguales = stubIngesta.equals(stubInfo);
        assertFalse(sonIguales);
    }
    
}
