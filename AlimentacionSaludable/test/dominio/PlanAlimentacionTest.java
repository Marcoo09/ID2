package dominio;

import javax.swing.ImageIcon;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class PlanAlimentacionTest {

    public PlanAlimentacionTest() {
    }

    @Test
    public void testGetsSetsNullToString() {
        String nombrePlan = null;
        Usuario usuario = null;
        Profesional profesional = null;
        boolean fueAtendido = false;
        String[][] planDiaADia = null;
        PlanAlimentacion planATestear = new PlanAlimentacion(nombrePlan, usuario, profesional,
                fueAtendido, planDiaADia);
        assertEquals(planATestear.toString(), null);
    }

    @Test
    public void testGetsSetsDatosVaciosNombre() {
        String nombrePlan = "";
        Usuario usuario = new Usuario(null, null, null, null, null, null, null, null);
        Profesional profesional = new Profesional(null, null, null, null, null, null, null);
        boolean fueAtendido = true;
        String[][] planDiaADia = new String[0][0];
        PlanAlimentacion planATestear = new PlanAlimentacion(nombrePlan, usuario, profesional,
                fueAtendido, planDiaADia);
        assertEquals(planATestear.getNombreDelPlan(), "");
    }

    @Test
    public void testGetsSetsDatosVaciosUsuario() {
        String nombrePlan = "";
        Usuario usuario = new Usuario(null, null, null, null, null, null, null, null);
        Profesional profesional = new Profesional(null, null, null, null, null, null, null);
        boolean fueAtendido = true;
        String[][] planDiaADia = new String[0][0];
        PlanAlimentacion planATestear = new PlanAlimentacion(nombrePlan, usuario, profesional,
                fueAtendido, planDiaADia);
        Usuario usuarioEsperado = new Usuario("", "", null, null, null, null, null, null);
        assertEquals(planATestear.getUsuario(), usuarioEsperado);
    }

    @Test
    public void testGetsSetsDatosVaciosProfesional() {
        String nombrePlan = "";
        Usuario usuario = new Usuario(null, null, null, null, null, null, null, null);
        Profesional profesional = new Profesional(null, null, null, null, null, null, null);
        boolean fueAtendido = true;
        String[][] planDiaADia = new String[0][0];
        PlanAlimentacion planATestear = new PlanAlimentacion(nombrePlan, usuario, profesional,
                fueAtendido, planDiaADia);
        Profesional profesionalEsperado = new Profesional("", "", null, null, null, null, null);
        assertEquals(planATestear.getProfesional(), profesionalEsperado);
    }

    @Test
    public void testGetsSetsDatosVaciosFueAtendido() {
        String nombrePlan = "";
        Usuario usuario = new Usuario(null, null, null, null, null, null, null, null);
        Profesional profesional = new Profesional(null, null, null, null, null, null, null);
        boolean fueAtendido = true;
        String[][] planDiaADia = new String[0][0];
        PlanAlimentacion planATestear = new PlanAlimentacion(nombrePlan, usuario, profesional,
                fueAtendido, planDiaADia);
        assertEquals(planATestear.getFueAtendidoElPlan(), fueAtendido);
    }

    @Test
    public void testGetsSetsDatosVaciosPlanDiaADia() {
        String nombrePlan = "";
        Usuario usuario = new Usuario(null, null, null, null, null, null, null, null);
        Profesional profesional = new Profesional(null, null, null, null, null, null, null);
        boolean fueAtendido = true;
        String[][] planDiaADia = new String[0][0];
        PlanAlimentacion planATestear = new PlanAlimentacion(nombrePlan, usuario, profesional,
                fueAtendido, planDiaADia);
        String[][] planEsperado = new String[0][0];
        Assert.assertArrayEquals(planATestear.getPlanDiaADia(), planEsperado);
    }

    @Test
    public void testGetsSetsDatosCorrectosNombre() {
        String nombrePlan = "Plan 2 Dias DOWN";
        Usuario usuario = new Usuario("Martin", "Gómez", "11/02/98", new ImageIcon("Imagenes/fotoDeUsuarioStandard.png"), "Uruguayo", null, null, null);
        Profesional profesional = new Profesional("Alejandro", "Fernandez", null, null, null, null, null);
        boolean fueAtendido = true;
        String[][] planDiaADia = new String[2][2];
        planDiaADia[0][0] = "Manzana";
        planDiaADia[0][1] = "Manzana";
        planDiaADia[1][0] = "Manzana";
        planDiaADia[1][1] = "Manzana";
        PlanAlimentacion planATestear = new PlanAlimentacion(nombrePlan, usuario, profesional,
                fueAtendido, planDiaADia);
        assertEquals(planATestear.getNombreDelPlan(), nombrePlan);
    }

    @Test
    public void testGetsSetsDatosCorrectosProfesional() {
        String nombrePlan = "Plan 2 Dias DOWN";
        Usuario usuario = new Usuario("Martin", "Gómez", "11/02/98", new ImageIcon("Imagenes/fotoDeUsuarioStandard.png"), "Uruguayo", null, null, null);
        Profesional profesional = new Profesional("Alejandro", "Fernandez", null, null, null, null, null);
        boolean fueAtendido = true;
        String[][] planDiaADia = new String[2][2];
        planDiaADia[0][0] = "Manzana";
        planDiaADia[0][1] = "Manzana";
        planDiaADia[1][0] = "Manzana";
        planDiaADia[1][1] = "Manzana";
        PlanAlimentacion planATestear = new PlanAlimentacion(nombrePlan, usuario, profesional,
                fueAtendido, planDiaADia);
        Profesional profesionalEsperado = new Profesional("Alejandro", "Fernandez", null, null, null, null, null);
        assertEquals(planATestear.getProfesional(), profesionalEsperado);
    }

    @Test
    public void testGetsSetsDatosCorrectosFueAtendido() {
        String nombrePlan = "Plan 2 Dias DOWN";
        Usuario usuario = new Usuario("Martin", "Gómez", "11/02/98", new ImageIcon("Imagenes/fotoDeUsuarioStandard.png"), "Uruguayo", null, null, null);
        Profesional profesional = new Profesional("Alejandro", "Fernandez", null, null, null, null, null);
        boolean fueAtendido = true;
        String[][] planDiaADia = new String[2][2];
        planDiaADia[0][0] = "Manzana";
        planDiaADia[0][1] = "Manzana";
        planDiaADia[1][0] = "Manzana";
        planDiaADia[1][1] = "Manzana";
        PlanAlimentacion planATestear = new PlanAlimentacion(nombrePlan, usuario, profesional,
                fueAtendido, planDiaADia);
        assertEquals(planATestear.getFueAtendidoElPlan(), fueAtendido);
    }

    @Test
    public void testGetsSetsDatosCorrectosUsuario() {
        String nombrePlan = "Plan 2 Dias DOWN";
        Usuario usuario = new Usuario("Martin", "Gómez", "11/02/98", new ImageIcon("Imagenes/fotoDeUsuarioStandard.png"), "Uruguayo", null, null, null);
        Profesional profesional = new Profesional("Alejandro", "Fernandez", null, null, null, null, null);
        boolean fueAtendido = true;
        String[][] planDiaADia = new String[2][2];
        planDiaADia[0][0] = "Manzana";
        planDiaADia[0][1] = "Manzana";
        planDiaADia[1][0] = "Manzana";
        planDiaADia[1][1] = "Manzana";
        PlanAlimentacion planATestear = new PlanAlimentacion(nombrePlan, usuario, profesional,
                fueAtendido, planDiaADia);
        Usuario usuarioEsperado = new Usuario("Martin", "Gómez", "11/02/98", new ImageIcon("Imagenes/fotoDeUsuarioStandard.png"), "Uruguayo", null, null, null);
        assertEquals(planATestear.getUsuario(), usuarioEsperado);
    }

    @Test
    public void testGetsSetsDatosCorrectosPlanDiaADia() {
        String nombrePlan = "Plan 2 Dias DOWN";
        Usuario usuario = new Usuario("Martin", "Gómez", "11/02/98", new ImageIcon("Imagenes/fotoDeUsuarioStandard.png"), "Uruguayo", null, null, null);
        Profesional profesional = new Profesional("Alejandro", "Fernandez", null, null, null, null, null);
        boolean fueAtendido = true;
        String[][] planDiaADia = new String[2][2];
        planDiaADia[0][0] = "Manzana";
        planDiaADia[0][1] = "Manzana";
        planDiaADia[1][0] = "Manzana";
        planDiaADia[1][1] = "Manzana";
        PlanAlimentacion planATestear = new PlanAlimentacion(nombrePlan, usuario, profesional,
                fueAtendido, planDiaADia);
        Assert.assertArrayEquals(planATestear.getPlanDiaADia(), planDiaADia);
    }

    @Test
    public void testGetsSetsDatosCorrectosToString() {
        String nombrePlan = "Plan 2 Dias DOWN";
        Usuario usuario = new Usuario("Martin", "Gómez", "11/02/98", new ImageIcon("Imagenes/fotoDeUsuarioStandard.png"), "Uruguayo", null, null, null);
        Profesional profesional = new Profesional("Alejandro", "Fernandez", null, null, null, null, null);
        boolean fueAtendido = true;
        String[][] planDiaADia = new String[2][2];
        planDiaADia[0][0] = "Manzana";
        planDiaADia[0][1] = "Manzana";
        planDiaADia[1][0] = "Manzana";
        planDiaADia[1][1] = "Manzana";
        PlanAlimentacion planATestear = new PlanAlimentacion(nombrePlan, usuario, profesional,
                fueAtendido, planDiaADia);
        assertEquals(planATestear.toString(), nombrePlan);
    }

    @Test
    public void testEqualsIguales() {
        String nombrePlan = "Plan 2 Dias DOWN";
        Usuario usuario = new Usuario("Martin", "Gómez", "11/02/98", new ImageIcon("Imagenes/fotoDeUsuarioStandard.png"), "Uruguayo", null, null, null);
        Profesional profesional = new Profesional("Alejandro", "Fernandez", null, null, null, null, null);
        boolean fueAtendido = true;
        String[][] planDiaADia = new String[2][2];
        planDiaADia[0][0] = "Manzana";
        planDiaADia[0][1] = "Manzana";
        planDiaADia[1][0] = "Manzana";
        planDiaADia[1][1] = "Manzana";
        PlanAlimentacion planATestear = new PlanAlimentacion(nombrePlan, usuario, profesional,
                fueAtendido, planDiaADia);
        PlanAlimentacion planAComparar = new PlanAlimentacion(nombrePlan, usuario, profesional,
                fueAtendido, planDiaADia);
        assertEquals(planATestear, planAComparar);
    }

    @Test
    public void testEqualsDiferentes() {
        String nombrePlan = "Plan 2 Dias DOWN";
        Usuario usuario = new Usuario("Martin", "Gómez", "11/02/98", new ImageIcon("Imagenes/fotoDeUsuarioStandard.png"), "Uruguayo", null, null, null);
        Profesional profesional = new Profesional("Alejandro", "Fernandez", null, null, null, null, null);
        boolean fueAtendido = true;
        String[][] planDiaADia = new String[2][2];
        planDiaADia[0][0] = "Manzana";
        planDiaADia[0][1] = "Manzana";
        planDiaADia[1][0] = "Manzana";
        planDiaADia[1][1] = "Manzana";
        PlanAlimentacion planATestear = new PlanAlimentacion(nombrePlan, usuario, profesional,
                fueAtendido, planDiaADia);
        String nombrePlan2 = "Plan 2 Dias UP";
        PlanAlimentacion planAComparar = new PlanAlimentacion(nombrePlan2, usuario, profesional,
                fueAtendido, planDiaADia);
        assertNotEquals(planATestear, planAComparar);
    }
    
    @Test
    public void testSimetriaEquals() {
        String nombrePlan = "Plan 2 Dias DOWN";
        Usuario usuario = new Usuario("Martin", "Gómez", "11/02/98", new ImageIcon("Imagenes/fotoDeUsuarioStandard.png"), "Uruguayo", null, null, null);
        Profesional profesional = new Profesional("Alejandro", "Fernandez", null, null, null, null, null);
        boolean fueAtendido = true;
        String[][] planDiaADia = new String[2][2];
        planDiaADia[0][0] = "Manzana";
        planDiaADia[0][1] = "Manzana";
        planDiaADia[1][0] = "Manzana";
        planDiaADia[1][1] = "Manzana";
        PlanAlimentacion stubPlan1 = new PlanAlimentacion(nombrePlan, usuario, profesional,
                fueAtendido, planDiaADia);
        PlanAlimentacion stubPlan2 = new PlanAlimentacion(nombrePlan, usuario, profesional,
                fueAtendido, planDiaADia);

        assertTrue(stubPlan1.equals(stubPlan2) && stubPlan2.equals(stubPlan1));
        assertTrue(stubPlan1.hashCode() == stubPlan2.hashCode());  
    }
    
    
    @Test
    public void testEqualsDiferentesComparandoOtrosTipos() {
        PlanAlimentacion stubPlan = new PlanAlimentacion(null, null, null,
                false, null);
        Ingesta stubIngesta = new Ingesta(null,null);          
        boolean sonIguales = stubPlan.equals(stubIngesta);
        assertFalse(sonIguales);
    }
    
    @Test
    public void testEqualsDiferentesComparandoConNull() {
        PlanAlimentacion stubPlan = new PlanAlimentacion(null, null, null,
                false, null);
        boolean sonIguales = stubPlan.equals(null);
        assertFalse(sonIguales);
    }
    
    @Test
    public void testEqualsDiferentesComparandoPorUsuario() {
        String nacionalidad1 = "Uruguay";
        String nacionalidad2 = "Argentina";
        
        Usuario stubUsuario1 = new Usuario(null, null, null, null,
                nacionalidad1, null, null,null);
        Usuario stubUsuario2 = new Usuario(null, null, null, null,
                nacionalidad2, null, null,null);
        PlanAlimentacion stubPlan1 = new PlanAlimentacion(null, stubUsuario1, null,
                false, null);
        PlanAlimentacion stubPlan2 = new PlanAlimentacion(null, stubUsuario2, null,
                false, null);
        boolean sonIguales = stubPlan1.equals(stubPlan2);
        assertFalse(sonIguales);
    }
    
    @Test
    public void testEqualsDiferentesComparandoPorProfesional() {
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

        PlanAlimentacion stubPlan1 = new PlanAlimentacion(null, null, stubProf1,
                false, null);
        PlanAlimentacion stubPlan2 = new PlanAlimentacion(null, null, stubProf2,
                false, null);
        boolean sonIguales = stubPlan1.equals(stubPlan2);
        assertFalse(sonIguales);
    }
}
