package dominio;

import dominio.Sistema.DiasDeLaSemana;
import dominio.Sistema.IngestasPorDia;
import dominio.Sistema.Paises;
import dominio.Sistema.Preferencias;
import dominio.Sistema.Restricciones;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import org.junit.Test;
import static org.junit.Assert.*;

public class SistemaTest {

    public SistemaTest() {

    }


    @Test
    public void testGetsSetsNullListaAlimentos() {
        ArrayList<Usuario> listaUsuarios = null;
        ArrayList<Profesional> listaProfesionales = null;
        ArrayList<Alimento> listaAlimentos = null;
        ArrayList<PlanAlimentacion> listaPlanesAlimentacion = null;
        ArrayList<Conversacion> listaConversaciones = null;
        Persona personaLogueada = null;
        Sistema sistemaATestear = new Sistema(listaUsuarios, listaProfesionales, listaAlimentos, listaPlanesAlimentacion, listaConversaciones, personaLogueada);
        assertEquals(sistemaATestear.getListaAlimentos().size(), 0);
    }

    @Test
    public void testGetsSetsNullListaPlanes() {
        ArrayList<Usuario> listaUsuarios = null;
        ArrayList<Profesional> listaProfesionales = null;
        ArrayList<Alimento> listaAlimentos = null;
        ArrayList<PlanAlimentacion> listaPlanesAlimentacion = null;
        ArrayList<Conversacion> listaConversaciones = null;
        Persona personaLogueada = null;
        Sistema sistemaATestear = new Sistema(listaUsuarios, listaProfesionales, listaAlimentos, listaPlanesAlimentacion, listaConversaciones, personaLogueada);
        assertEquals(sistemaATestear.getListaPlanesAlimentacion().size(), 0);
    }

    @Test
    public void testGetsSetsNullListaConversaciones() {
        ArrayList<Usuario> listaUsuarios = null;
        ArrayList<Profesional> listaProfesionales = null;
        ArrayList<Alimento> listaAlimentos = null;
        ArrayList<PlanAlimentacion> listaPlanesAlimentacion = null;
        ArrayList<Conversacion> listaConversaciones = null;
        Persona personaLogueada = null;
        Sistema sistemaATestear = new Sistema(listaUsuarios, listaProfesionales, listaAlimentos, listaPlanesAlimentacion, listaConversaciones, personaLogueada);
        assertEquals(sistemaATestear.getListaConversaciones().size(), 0);
    }

    @Test
    public void testGetsSetsNullPersonaLogueada() {
        ArrayList<Usuario> listaUsuarios = null;
        ArrayList<Profesional> listaProfesionales = null;
        ArrayList<Alimento> listaAlimentos = null;
        ArrayList<PlanAlimentacion> listaPlanesAlimentacion = null;
        ArrayList<Conversacion> listaConversaciones = null;
        Persona personaLogueada = null;
        Sistema sistemaATestear = new Sistema(listaUsuarios, listaProfesionales, listaAlimentos, listaPlanesAlimentacion, listaConversaciones, personaLogueada);
        Persona personaLogueadaEsperada = null;
        assertEquals(sistemaATestear.getPersonaLogueada(), personaLogueadaEsperada);
    }

    @Test
    public void testGetsSetsDatosVaciosListaUsuarios() {
        Sistema sistemaATestear = new Sistema();
        assertEquals(sistemaATestear.getListaUsuarios().size(), 0);
    }

    @Test
    public void testGetsSetsDatosVaciosListaAlimentos() {
        ArrayList<Usuario> listaUsuarios = new ArrayList<>();
        ArrayList<Profesional> listaProfesionales = new ArrayList<>();
        ArrayList<Alimento> listaAlimentos = new ArrayList<>();
        ArrayList<PlanAlimentacion> listaPlanesAlimentacion = new ArrayList<>();
        ArrayList<Conversacion> listaConversaciones = new ArrayList<>();
        Persona personaLogueada = new Usuario(null, null, null, null, null, null, null, null);
        Sistema sistemaATestear = new Sistema(listaUsuarios, listaProfesionales, listaAlimentos, listaPlanesAlimentacion, listaConversaciones, personaLogueada);
        assertEquals(sistemaATestear.getListaAlimentos().size(), 0);
    }

    @Test
    public void testAgregarMensajeConversacionListaVacia() {
        Sistema sistemaATestear = new Sistema(null, null, null, null, null, null);
        boolean pudeAgregarMensaje = sistemaATestear.agregarMensajeConversacion("Martin", "Lucia", "aa", false, false);
        assertFalse(pudeAgregarMensaje);
    }

    @Test
    public void testAgregarMensajeConversacionNull() {
        Sistema sistemaATestear = new Sistema(null, null, null, null, null, null);
        boolean pudeAgregarMensaje = sistemaATestear.agregarMensajeConversacion(null, null, "Segundo mensaje", false, false);
        assertFalse(pudeAgregarMensaje);
    }
    
    @Test
    public void testAgregarMensajeConversacionCorrectamente() {
        Usuario personaLogueada = new Usuario("Nombre", "Apellido", "",
                                      new ImageIcon(getClass().getResource("/Imagenes/fotoDeUsuarioStandard.png")),
                                            "", null, null, null);
        Profesional profesionalConversacion = new Profesional("Luis", null, null, null, null, null, null);
        List<Profesional> listaProfesionales = new ArrayList<>();
        List<Usuario> listaUsuarios = new ArrayList<>();
        List<Conversacion> listaConversaciones = new ArrayList<>();
        
        listaProfesionales.add(profesionalConversacion);
        listaUsuarios.add(personaLogueada);
        
        Sistema sistemaATestear = new Sistema(listaUsuarios,listaProfesionales,new ArrayList<>(),new ArrayList<>(),
                                        listaConversaciones,personaLogueada);
        sistemaATestear.crearConversacion(personaLogueada, profesionalConversacion, "Hola", true);

        boolean pudeAgregarMensaje = sistemaATestear.agregarMensajeConversacion(personaLogueada.getNombreCompleto(), profesionalConversacion.getNombreCompleto(), "Segundo mensaje", false, false);
        assertTrue(pudeAgregarMensaje);
    }
    
    @Test
    public void testAgregarMensajeConversacionCorrectamenteConIntercambio() {
        Usuario personaLogueada = new Usuario("Nombre", "Apellido", "",
                                      new ImageIcon(getClass().getResource("/Imagenes/fotoDeUsuarioStandard.png")),
                                            "", null, null, null);
        Profesional profesionalConversacion = new Profesional("Luis", null, null, null, null, null, null);
        List<Profesional> listaProfesionales = new ArrayList<>();
        List<Usuario> listaUsuarios = new ArrayList<>();
        List<Conversacion> listaConversaciones = new ArrayList<>();
        
        listaProfesionales.add(profesionalConversacion);
        listaUsuarios.add(personaLogueada);
        
        Sistema sistemaATestear = new Sistema(listaUsuarios,listaProfesionales,new ArrayList<>(),new ArrayList<>(),
                                        listaConversaciones,personaLogueada);
        sistemaATestear.crearConversacion(personaLogueada, profesionalConversacion, "Hola", false);
        
        boolean pudeAgregarMensaje = sistemaATestear.agregarMensajeConversacion(personaLogueada.getNombreCompleto(),
                                                profesionalConversacion.getNombreCompleto(), "Segundo mensaje", true, false);
        assertTrue(pudeAgregarMensaje);
    }

    @Test
    public void testDevolverAlimentoNull() {
        Sistema sistemaATestear = new Sistema(null, null, null, null, null, null);
        Alimento alimentoEsperado = new Alimento(null, null, null, null);
        assertEquals(sistemaATestear.devolverAlimentoDadoNombre(null), alimentoEsperado);
    }

    @Test
    public void testDevolverAlimentoDatosVacios() {
        Sistema sistemaATestear = new Sistema(null, null, null, null, null, null);
        Alimento alimentoEsperado = new Alimento("", "", null, null);
        assertEquals(sistemaATestear.devolverAlimentoDadoNombre(""), alimentoEsperado);
    }

    @Test
    public void testDevolverAlimentoDatosCorrectos() {
        ArrayList listaAlimentos = new ArrayList<>();
        Alimento alimentoEsperado = new Alimento("Papa", "Verdura", null, null);
        listaAlimentos.add(alimentoEsperado);
        Sistema sistemaATestear = new Sistema(null, null, listaAlimentos, null, null, null);
        assertEquals(sistemaATestear.devolverAlimentoDadoNombre("Papa"), alimentoEsperado);
    }

    @Test
    public void testDevolverAlimentoDatosErroneos() {
        ArrayList listaAlimentos = new ArrayList<>();
        Alimento alimentoEsperado = new Alimento("Papa", "Verdura", null, null);
        listaAlimentos.add(alimentoEsperado);
        Sistema sistemaATestear = new Sistema(null, null, listaAlimentos, null, null, null);
        assertNotEquals(sistemaATestear.devolverAlimentoDadoNombre("Luca"), alimentoEsperado);
    }

    @Test
    public void testUsuarioDevolverPorNombreNull() {
        Sistema sistemaATestear = new Sistema(null, null, null, null, null, null);
        Usuario usuarioEsperado = new Usuario(null, null, null, null, null, null, null, null);
        assertEquals(sistemaATestear.getUsuarioPorNombre(null), usuarioEsperado);
    }

    @Test
    public void testProfesionalDevolverPorNombreNull() {
        Sistema sistemaATestear = new Sistema(null, null, null, null, null, null);
        Profesional profesionalEsperado = new Profesional(null, null, null, null, null, null, null);
        assertEquals(sistemaATestear.getProfesionalPorNombre(null), profesionalEsperado);
    }

    @Test
    public void testDevolverProfesionalPorNombreDatosVacios() {
        Sistema sistemaATestear = new Sistema(null, null, null, null, null, null);
        Profesional profesionalEsperado = new Profesional(null, null, null, null, null, null, null);
        assertEquals(sistemaATestear.getProfesionalPorNombre(""), profesionalEsperado);
    }

    @Test
    public void testDevolverProfesionalPorNombreDatosErroneos() {
        Sistema sistemaATestear = new Sistema(null, null, null, null, null, null);
        Profesional profesionalEsperado = new Profesional("Martin", null, null, null, null, null, null);
        sistemaATestear.agregarProfesionalALaLista(profesionalEsperado);
        assertEquals(sistemaATestear.getProfesionalPorNombre("Martin"), profesionalEsperado);
    }

    @Test
    public void testDevolverUsuarioPorNombreDatosVacios() {
        Sistema sistemaATestear = new Sistema(null, null, null, null, null, null);
        Usuario usuarioEsperado = new Usuario(null, null, null, null, null, null, null, null);
        assertEquals(sistemaATestear.getUsuarioPorNombre(""), usuarioEsperado);
    }

    @Test
    public void testAgregarPlanAlimentacionUsuarioNull() {
        Sistema sistemaATestear = new Sistema(null, null, null, null, null, null);
        Usuario usuario1 = null;
        Profesional profesional1 = new Profesional(null, null, null, null, null, null, null);
        assertFalse(sistemaATestear.agregarPlanSolicitado(usuario1, profesional1));
    }

    @Test
    public void testAgregarPlanAlimentacionProfesionalNull() {
        Sistema sistemaATestear = new Sistema(null, null, null, null, null, null);
        Usuario usuario1 = new Usuario(null, null, null, null, null, null, null, null);
        Profesional profesional1 = null;
        assertFalse(sistemaATestear.agregarPlanSolicitado(usuario1, profesional1));
    }

    @Test
    public void testAgregarPlanAlimentacionRepetidos() {
        Sistema sistemaATestear = new Sistema(null, null, null, null, null, null);
        Usuario usuario1 = new Usuario(null, null, null, null, null, null, null, null);
        Profesional profesional1 = new Profesional(null, null, null, null, null, null, null);
        sistemaATestear.agregarPlanSolicitado(usuario1, profesional1);
        assertFalse(sistemaATestear.agregarPlanSolicitado(usuario1, profesional1));
    }

    @Test
    public void testPlanesPendientes() {
        Sistema sistemaATestear = new Sistema(null, null, null, null, null, null);
        Usuario usuario1 = new Usuario("Martin", "Gómez", null, null, null, null, null, null);
        Profesional profesional1 = new Profesional("Sandra", "Pazos", null, null, null, null, null);
        sistemaATestear.agregarPlanSolicitado(usuario1, profesional1);
        assertEquals(sistemaATestear.getListaPlanesPendientes(profesional1).length, 1);
    }

    @Test
    public void testPlanesPendientesNull() {
        Sistema sistemaATestear = new Sistema(null, null, null, null, null, null);
        Usuario usuario1 = new Usuario("Martin", "Gómez", null, null, null, null, null, null);
        Profesional profesional1 = new Profesional("Sandra", "Pazos", null, null, null, null, null);
        sistemaATestear.agregarPlanSolicitado(usuario1, profesional1);
        assertEquals(sistemaATestear.getListaPlanesPendientes(null).length, 0);
    }

    @Test
    public void testCrearConversacionDatosCorrectos() {
        ArrayList<Usuario> listaUsuarios = new ArrayList<>();
        ArrayList<Profesional> listaProfesionales = new ArrayList<>();
        ArrayList<Alimento> listaAlimentos = new ArrayList<>();
        ArrayList<PlanAlimentacion> listaPlanesAlimentacion = new ArrayList<>();
        ArrayList<Conversacion> listaConversaciones = new ArrayList<>();        
        Usuario personaLogueada = new Usuario("Martin", null, null, null, null, null, null, null);
        Profesional profesional = new Profesional("Jose", null, null, null, null, null, null);
        listaUsuarios.add(personaLogueada);
        listaProfesionales.add(profesional);       
        
        Sistema sistemaATestear = new Sistema(listaUsuarios, listaProfesionales, listaAlimentos, listaPlanesAlimentacion,
                                listaConversaciones, personaLogueada);
        
        boolean agregarConversacion = sistemaATestear.crearConversacion(personaLogueada, 
                                                profesional, "Hola", false);
        assertTrue(agregarConversacion);
    }
    
    @Test
    public void testAgregarAListaConversacionesDatosErroneos() {
        ArrayList<Usuario> listaUsuarios = new ArrayList<>();
        ArrayList<Profesional> listaProfesionales = new ArrayList<>();
        ArrayList<Alimento> listaAlimentos = new ArrayList<>();
        ArrayList<PlanAlimentacion> listaPlanesAlimentacion = new ArrayList<>();
        ArrayList<Conversacion> listaConversaciones = new ArrayList<>();
        Persona personaLogueada = new Usuario("Martin", null, null, null, null, null, null, null);
        Sistema sistemaATestear = new Sistema(listaUsuarios, listaProfesionales, listaAlimentos, listaPlanesAlimentacion, listaConversaciones, personaLogueada);
        Usuario usuarioConversacion = new Usuario("Martin", null, null, null, null, null, null, null);
        Profesional profesionalConversacion = new Profesional("Luis", null, null, null, null, null, null);
        sistemaATestear.crearConversacion(usuarioConversacion, profesionalConversacion, "Hola", true);
        boolean agregoConversacionRepetida = sistemaATestear.crearConversacion(usuarioConversacion, profesionalConversacion, "Hola", true);
        assertFalse(agregoConversacionRepetida);
    }

    @Test
    public void testAgregarIngestaDatosCorrectos() {
        ArrayList<Ingesta> listaIngestas = new ArrayList<>();
        Ingesta ingesta1 = new Ingesta("11/02/17", null);
        listaIngestas.add(ingesta1);
        Sistema sistemaATestear = new Sistema(null, null, null, null, null, null);
        sistemaATestear.crearUsuario("Martin", null, null, null, null, null, null, null);
        boolean retorno = sistemaATestear.agregarIngestaAUsuario(listaIngestas, "11/02/16", "Papa");
        assertTrue(retorno);
    }

    @Test
    public void testAgregarIngestaRepetida() {
        ArrayList<Ingesta> listaIngestas = new ArrayList<>();
        ArrayList<Alimento> listaAlimentos = new ArrayList<>();
        listaAlimentos.add(new Alimento("Papa", null, null, null));
        Ingesta ingesta1 = new Ingesta("11/02/17", listaAlimentos);
        listaIngestas.add(ingesta1);
        Sistema sistemaATestear = new Sistema(null, null, null, null, null, null);
        sistemaATestear.crearUsuario("Martin", null, null, null, null, null, null, null);
        sistemaATestear.agregarIngestaAUsuario(listaIngestas, "11/02/17", "Papa");
        Usuario user = (Usuario) sistemaATestear.getUsuarioPorNombre("Martin");
        boolean retorno = sistemaATestear.agregarIngestaAUsuario(user.getAlimentosIngeridos(), "11/02/16", "Papa");
        assertTrue(retorno);
    }

    @Test
    public void testAgregarIngestaFechaRepetida() {
        ArrayList<Ingesta> listaIngestas = new ArrayList<>();
        ArrayList<Alimento> listaAlimentos = new ArrayList<>();
        listaAlimentos.add(new Alimento("Papa", null, null, null));
        Ingesta ingesta1 = new Ingesta("11/02/17", listaAlimentos);
        listaIngestas.add(ingesta1);
        Sistema sistemaATestear = new Sistema(null, null, null, null, null, null);
        sistemaATestear.crearUsuario("Martin", null, null, null, null, null, null, null);
        sistemaATestear.agregarIngestaAUsuario(listaIngestas, "11/02/17", "Papa");
        Usuario user = (Usuario) sistemaATestear.getUsuarioPorNombre("Martin");
        boolean retorno = sistemaATestear.agregarIngestaAUsuario(user.getAlimentosIngeridos(), "11/02/17", "Papa");
        assertTrue(retorno);
    }

    @Test
    public void testDevolverPlanDadoNombreNull() {
        List<PlanAlimentacion> listaPlanesAlimentacion = new ArrayList<>();
        Sistema sistemaATestear = new Sistema(null, null, null, listaPlanesAlimentacion, null, null);
        assertEquals(sistemaATestear.devolverPlanDadoNombre(null), new PlanAlimentacion(null, null, null, false, null));
    }

    @Test
    public void testDevolverPlanDatosValidos() {
        Usuario user1 = new Usuario("Martin", null, null, null, null, null, null, null);
        Profesional professional1 = new Profesional("Ana", null, null, null, null, null, null);
        PlanAlimentacion plan1 = new PlanAlimentacion("Plan", user1, professional1, false, null);
        ArrayList<PlanAlimentacion> listaPlanesAlimentacion = new ArrayList<>();
        listaPlanesAlimentacion.add(plan1);
        Sistema sistemaATestear = new Sistema(null, null, null, listaPlanesAlimentacion, null, null);
        assertEquals(sistemaATestear.devolverPlanDadoNombre("Plan"), plan1);
    }

    @Test
    public void testDevolverPlanNoPertenece() {
        List<PlanAlimentacion> listaPlanesAlimentacion = new ArrayList<>();
        Sistema sistemaATestear = new Sistema(null, null, null, listaPlanesAlimentacion, null, null);
        assertEquals(sistemaATestear.devolverPlanDadoNombre("Plan").getNombreDelPlan(), null);
    }

    @Test
    public void testEnumPreferenciasCarnesBlancas() {
        String resultadoEsperado = "CARNESBLANCAS";
        assertEquals(Preferencias.CARNESBLANCAS.name(), resultadoEsperado);
    }

    @Test
    public void testEnumPreferenciasCarnesRojas() {
        String resultadoEsperado = "CARNESROJAS";
        assertEquals(Preferencias.CARNESROJAS.name(), resultadoEsperado);
    }

    @Test
    public void testEnumPreferenciasVerduras() {
        String resultadoEsperado = "VERDURAS";
        assertEquals(Preferencias.VERDURAS.name(), resultadoEsperado);
    }

    @Test
    public void testEnumPreferenciasFrutas() {
        String resultadoEsperado = "FRUTAS";
        assertEquals(Preferencias.FRUTAS.name(), resultadoEsperado);
    }

    @Test
    public void testEnumPreferenciasHarinas() {
        String resultadoEsperado = "HARINAS";
        assertEquals(Preferencias.HARINAS.name(), resultadoEsperado);
    }

    @Test
    public void testEnumRestriccionesDiabetes() {
        String resultadoEsperado = "DIABETES";
        assertEquals(Restricciones.DIABETES.name(), resultadoEsperado);
    }

    @Test
    public void testEnumRestriccionesVeganismo() {
        String resultadoEsperado = "VEGANISMO";
        assertEquals(Restricciones.VEGANISMO.name(), resultadoEsperado);
    }

    @Test
    public void testEnumRestriccionesIntoleranciaLactosa() {
        String resultadoEsperado = "INTOLERANCIALACTOSA";
        assertEquals(Restricciones.INTOLERANCIALACTOSA.name(), resultadoEsperado);
    }

    @Test
    public void testEnumRestriccionesHarinas() {
        String resultadoEsperado = "CELIAQUIA";
        assertEquals(Restricciones.CELIAQUIA.name(), resultadoEsperado);
    }

    @Test
    public void testEnumDiasSemanaJueves() {
        String resultadoEsperado = "JUEVES";
        assertEquals(DiasDeLaSemana.JUEVES.name(), resultadoEsperado);
    }

    @Test
    public void testEnumDiasSemanaViernes() {
        String resultadoEsperado = "VIERNES";
        assertEquals(DiasDeLaSemana.VIERNES.name(), resultadoEsperado);
    }

    @Test
    public void testEnumDiasSemanaSabado() {
        String resultadoEsperado = "SABADO";
        assertEquals(DiasDeLaSemana.SABADO.name(), resultadoEsperado);
    }

    @Test
    public void testEnumDiasSemanaDomingo() {
        String resultadoEsperado = "DOMINGO";
        assertEquals(DiasDeLaSemana.DOMINGO.name(), resultadoEsperado);
    }

    @Test
    public void testEnumDiasSemanaMiercoles() {
        String resultadoEsperado = "MIERCOLES";
        assertEquals(DiasDeLaSemana.MIERCOLES.name(), resultadoEsperado);
    }

    @Test
    public void testEnumDiasSemanaMartes() {
        String resultadoEsperado = "MARTES";
        assertEquals(DiasDeLaSemana.MARTES.name(), resultadoEsperado);
    }

    @Test
    public void testEnumDiasSemanaLunes() {
        String resultadoEsperado = "LUNES";
        assertEquals(DiasDeLaSemana.LUNES.name(), resultadoEsperado);
    }

    @Test
    public void testEnumIngestasDiaDesayuno() {
        String resultadoEsperado = "DESAYUNO";
        assertEquals(IngestasPorDia.DESAYUNO.name(), resultadoEsperado);
    }

    @Test
    public void testEnumIngestasDiaAlmuerzo() {
        String resultadoEsperado = "ALMUERZO";
        assertEquals(IngestasPorDia.ALMUERZO.name(), resultadoEsperado);
    }

    @Test
    public void testEnumIngestasDiaCena() {
        String resultadoEsperado = "CENA";
        assertEquals(IngestasPorDia.CENA.name(), resultadoEsperado);
    }

    @Test
    public void testEnumDevolverListaIngestas() {
        Sistema sistemaATestear = new Sistema();
        List<String> listaEsperada = new ArrayList<>();
        listaEsperada.add("DESAYUNO");
        listaEsperada.add("ALMUERZO");
        listaEsperada.add("CENA");
        assertEquals(sistemaATestear.devolverListaIngestasDeLaSemana(), listaEsperada);
    }


    @Test
    public void testEnumDevolverListaDiasDeLaSemana() {
        Sistema sistemaATestear = new Sistema();
        List<String> listaEsperada = new ArrayList<>();
        listaEsperada.add("LUNES");
        listaEsperada.add("MARTES");
        listaEsperada.add("MIERCOLES");
        listaEsperada.add("JUEVES");
        listaEsperada.add("VIERNES");
        listaEsperada.add("SABADO");
        listaEsperada.add("DOMINGO");
        assertEquals(sistemaATestear.devolverListaDiasDeLaSemana(), listaEsperada);
    }

    @Test
    public void testCrearAlimento() {
        Sistema sistemaATestear = new Sistema();
        List<Alimento> listaEsperada = new ArrayList<>();
        String nombre = "Manzana";
        String tipoAlimento = "N/A";
        Alimento nuevoAlimento = new Alimento(nombre,tipoAlimento,null,null);
        listaEsperada.add(nuevoAlimento);
        
        sistemaATestear.crearAlimento(nombre, tipoAlimento, null, null);
        assertEquals(sistemaATestear.getListaAlimentos(), listaEsperada);
    }
    
    @Test
    public void testCrearProfesional() {
        Sistema sistemaATestear = new Sistema();
        List<Profesional> listaEsperada = new ArrayList<>();
        String nombre = "John";
        String apellido = "Johnson";
        String fechaNacimiento = "11/05/06";
        String tituloProfesional = "Nutricionista";
        String fechaGraduacion = "11/05/21";
        String paisGraduacion = "Uruguay";
        Profesional nuevoProf = new Profesional(nombre,apellido,fechaNacimiento,null,
                                                    tituloProfesional,fechaGraduacion,paisGraduacion);
        listaEsperada.add(nuevoProf);
        
        sistemaATestear.crearProfesional(nombre, apellido, fechaNacimiento, null,tituloProfesional,
                                        fechaGraduacion,paisGraduacion);
        assertEquals(sistemaATestear.getListaProfesionales(), listaEsperada);
    }
    
    @Test
    public void testAgregarConversacionAListaCorrectamente(){
        Sistema sistemaATestear = new Sistema();
        Usuario usuario = new Usuario("James", "Cliford", null, null, null, null, null, null);
        Profesional profesional = new Profesional("Mary", "Ga", null, null, null, null, null);
        List<InformacionMensaje> listaMensajes = new ArrayList<>();
        
        Conversacion nuevaConversacion = new Conversacion(usuario,profesional,listaMensajes);
        
        assertTrue(sistemaATestear.agregarConversacionALaLista(nuevaConversacion));
    }
    
    @Test
    public void testAgregarConversacionAListaIncorrectamente(){
        Sistema sistemaATestear = new Sistema();
        Usuario usuario = new Usuario("James", "Cliford", null, null, null, null, null, null);
        Profesional profesional = new Profesional("Mary", "Ga", null, null, null, null, null);
        List<InformacionMensaje> listaMensajes = new ArrayList<>();
        
        Conversacion nuevaConversacion = new Conversacion(usuario,profesional,listaMensajes);
        
        sistemaATestear.agregarConversacionALaLista(nuevaConversacion);
        assertFalse(sistemaATestear.agregarConversacionALaLista(nuevaConversacion));
    }
 
    @Test
    public void testAgregarAlimentoALaListaCorrectamente(){
        Sistema sistemaATestear = new Sistema();
        String nombre = "Manzana";
        String tipoAlimento = "N/A";
        Alimento nuevoAlimento = new Alimento(nombre,tipoAlimento,null,null);
        
        assertTrue(sistemaATestear.agregarAlimentoALaLista(nuevoAlimento));
    }
    
    @Test
    public void testAgregarAlimentoNullALaLista(){
        Sistema sistemaATestear = new Sistema(); 
        assertFalse(sistemaATestear.agregarAlimentoALaLista(null));
    }
    
     
    @Test
    public void testAgregarAlimentoExistenteALaLista(){
        Sistema sistemaATestear = new Sistema();
        String nombre = "Manzana";
        String tipoAlimento = "N/A";
        Alimento nuevoAlimento = new Alimento(nombre,tipoAlimento,null,null);
        
        sistemaATestear.agregarAlimentoALaLista(nuevoAlimento);
        assertFalse(sistemaATestear.agregarAlimentoALaLista(nuevoAlimento));
    }
    
    @Test
    public void testCopiarListaVacia(){
        Sistema sistemaATestear = new Sistema();
        List<String> lista = new ArrayList<>(); 
        assertEquals(sistemaATestear.copiarLista(lista), lista);
    }
    
    @Test
    public void testCopiarListaNoVacia(){
        Sistema sistemaATestear = new Sistema();
        List<String> lista = new ArrayList<>(); 
        lista.add("Test 1");
        lista.add("Test 2");
        assertEquals(sistemaATestear.copiarLista(lista), lista);
    }
    
    @Test
    public void testUsuarioTieneSolicitudPlanAlimentacionUsuarioNull(){
        Sistema sistemaATestear = new Sistema();
        assertFalse(sistemaATestear.usuarioTieneSolicitudPlanAlimentacionPendiente(null));
    }
    
        @Test
    public void testUsuarioTieneSolicitudPlanAlimentacionUsuarioSinPlan(){
        Sistema sistemaATestear = new Sistema();
        Usuario usuario = new Usuario("James", "Cliford", null, null, null, null, null, null);
        assertFalse(sistemaATestear.usuarioTieneSolicitudPlanAlimentacionPendiente(usuario)); 
    }
    
    @Test
    public void testUsuarioTieneSolicitudPlanAlimentacionUsuarioConPlan(){
        Usuario usuario = new Usuario("James", "Cliford", null, null, null, null, null, null);
        PlanAlimentacion plan = new PlanAlimentacion("TestPlan",usuario,null,false,null);
        List<PlanAlimentacion> listaPlanes = new ArrayList<>();
        listaPlanes.add(plan);
        Usuario personaLogueada = new Usuario("Nombre", "Apellido", "",
                                      new ImageIcon(getClass().getResource("/Imagenes/fotoDeUsuarioStandard.png")),
                                            "", null, null, null);
        Sistema sistemaATestear = new Sistema(new ArrayList<>(),new ArrayList<>(),new ArrayList<>(),listaPlanes,
                                        new ArrayList<>(),personaLogueada);
        assertTrue(sistemaATestear.usuarioTieneSolicitudPlanAlimentacionPendiente(usuario)); 
    }
    
    @Test
    public void testGetNombresProfesionalesSinConversacionConUsuario(){
        Usuario personaLogueada = new Usuario("Nombre", "Apellido", "",
                                      new ImageIcon(getClass().getResource("/Imagenes/fotoDeUsuarioStandard.png")),
                                            "", null, null, null);
        Profesional profesionalConversacion = new Profesional("Luis", null, null, null, null, null, null);
        Profesional profesionalSinConversacion = new Profesional("Jose", null, null, null, null, null, null);
        
        List<Profesional> listaProfesionales = new ArrayList<>();
        List<Usuario> listaUsuarios = new ArrayList<>();
        List<Conversacion> listaConversaciones = new ArrayList<>();
        List<Profesional> resultadoEsperado = new ArrayList<>();
        
        listaProfesionales.add(profesionalConversacion);
        listaProfesionales.add(profesionalSinConversacion);
        resultadoEsperado.add(profesionalSinConversacion);
        
        listaUsuarios.add(personaLogueada);
        
        Sistema sistemaATestear = new Sistema(listaUsuarios,listaProfesionales,new ArrayList<>(),new ArrayList<>(),
                                        listaConversaciones,personaLogueada);
                
        sistemaATestear.crearConversacion(personaLogueada, profesionalConversacion, "Hola", true);
                
        assertEquals(sistemaATestear.getNombresProfesionalesSinConversacionConUsuario(personaLogueada),resultadoEsperado);
    }
    
    @Test
    public void testGetNombresProfesionalesConConversacionConUsuario(){
        Usuario personaLogueada = new Usuario("Nombre", "Apellido", "",
                                      new ImageIcon(getClass().getResource("/Imagenes/fotoDeUsuarioStandard.png")),
                                            "", null, null, null);
        Profesional profesionalConversacion = new Profesional("Luis", null, null, null, null, null, null);
        Profesional profesionalSinConversacion = new Profesional("Jose", null, null, null, null, null, null);
        
        List<Profesional> listaProfesionales = new ArrayList<>();
        List<Usuario> listaUsuarios = new ArrayList<>();
        List<Conversacion> listaConversaciones = new ArrayList<>();
        String[] resultadoEsperado = {profesionalConversacion.getNombreCompleto()};
        
        listaProfesionales.add(profesionalConversacion);
        listaProfesionales.add(profesionalSinConversacion);
        
        listaUsuarios.add(personaLogueada);
        
        Sistema sistemaATestear = new Sistema(listaUsuarios,listaProfesionales,new ArrayList<>(),new ArrayList<>(),
                                        listaConversaciones,personaLogueada);
                
        sistemaATestear.crearConversacion(personaLogueada, profesionalConversacion, "Hola", true);
                
        assertArrayEquals(sistemaATestear.getProfesionalesConConversacionesActivas(personaLogueada.getNombreCompleto()),resultadoEsperado);
    }
    
    @Test
    public void testGetListaNombresUsuariosConversacionesPendientes(){
        Usuario personaLogueada = new Usuario("Nombre", "Apellido", "",
                                      new ImageIcon(getClass().getResource("/Imagenes/fotoDeUsuarioStandard.png")),
                                            "", null, null, null);
        Profesional profesionalConversacion = new Profesional("Luis", null, null, null, null, null, null);
        Profesional profesionalSinConversacion = new Profesional("Jose", null, null, null, null, null, null);
        
        List<Profesional> listaProfesionales = new ArrayList<>();
        List<Usuario> listaUsuarios = new ArrayList<>();
        List<Conversacion> listaConversaciones = new ArrayList<>();
        String[] resultadoEsperado = {personaLogueada.getNombreCompleto()};
        
        listaProfesionales.add(profesionalConversacion);
        listaProfesionales.add(profesionalSinConversacion);
        
        listaUsuarios.add(personaLogueada);
        
        Sistema sistemaATestear = new Sistema(listaUsuarios,listaProfesionales,new ArrayList<>(),new ArrayList<>(),
                                        listaConversaciones,personaLogueada);
                
        sistemaATestear.crearConversacion(personaLogueada, profesionalConversacion, "Hola", true);
                
        assertArrayEquals(sistemaATestear.getListaNombresUsuariosConversacionesPendientes(profesionalConversacion.getNombreCompleto()),resultadoEsperado);
    }
    
    @Test
    public void testDevolverListaPaises(){
        List<String> resultadoEsperado = new ArrayList<>();
        resultadoEsperado.add(Paises.ARGENTINA.toString());
        resultadoEsperado.add(Paises.BOLIVIA.toString());
        resultadoEsperado.add(Paises.BRASIL.toString());
        resultadoEsperado.add(Paises.CHILE.toString());
        resultadoEsperado.add(Paises.COLOMBIA.toString());
        resultadoEsperado.add("Costa Rica");
        resultadoEsperado.add(Paises.CUBA.toString());
        resultadoEsperado.add(Paises.ECUADOR.toString());
        resultadoEsperado.add("El Salvador");
        resultadoEsperado.add("Guayana Francesa");
        resultadoEsperado.add(Paises.GRANADA.toString());
        resultadoEsperado.add(Paises.GUATEMALA.toString());
        resultadoEsperado.add(Paises.GUAYANA.toString());
        resultadoEsperado.add(Paises.HAITI.toString());
        resultadoEsperado.add(Paises.HONDURAS.toString());
        resultadoEsperado.add(Paises.JAMAICA.toString());
        resultadoEsperado.add(Paises.MEXICO.toString());
        resultadoEsperado.add(Paises.NICARAGUA.toString());
        resultadoEsperado.add(Paises.PARAGUAY.toString());
        resultadoEsperado.add(Paises.PANAMA.toString());
        resultadoEsperado.add(Paises.PERU.toString());
        resultadoEsperado.add("Puerto Rico");
        resultadoEsperado.add("República Dominicana");
        resultadoEsperado.add(Paises.SURINAM.toString());
        resultadoEsperado.add(Paises.URUGUAY.toString());
        resultadoEsperado.add(Paises.VENEZUELA.toString());
        
        Sistema sistemaATestear = new Sistema();
                
        assertEquals(sistemaATestear.devolverListaPaises(), resultadoEsperado);
    }
    
    @Test
    public void testGetConversacionSinConversaciones () {
        Sistema sistemaATestear = new Sistema();
        assertEquals(sistemaATestear.getConversacion("", ""), "No hay conversación disponible.");
    }
    
    @Test
    public void testGetConversacionConConversaciones () {
        Usuario personaLogueada = new Usuario("Nombre", "Apellido", "",
                                      new ImageIcon(getClass().getResource("/Imagenes/fotoDeUsuarioStandard.png")),
                                            "", null, null, null);
        Profesional profesionalConversacion = new Profesional("Luis", null, null, null, null, null, null);
        
        List<Profesional> listaProfesionales = new ArrayList<>();
        List<Usuario> listaUsuarios = new ArrayList<>();
        List<Conversacion> listaConversaciones = new ArrayList<>();
        String conversacion = "Hola";
        
        listaProfesionales.add(profesionalConversacion);
        
        listaUsuarios.add(personaLogueada);
        
        Sistema sistemaATestear = new Sistema(listaUsuarios,listaProfesionales,new ArrayList<>(),new ArrayList<>(),
                                        listaConversaciones,personaLogueada);
                
        sistemaATestear.crearConversacion(personaLogueada, profesionalConversacion, conversacion, true);
        
        InformacionMensaje mensaje = new InformacionMensaje(personaLogueada.getNombreCompleto(),
                                                                profesionalConversacion.getNombreCompleto(),conversacion);
        List<InformacionMensaje> listaMensajes = new ArrayList<>();
        listaMensajes.add(mensaje);
        
        Conversacion resultadoEsperado = new Conversacion(personaLogueada,profesionalConversacion,listaMensajes);
                
        assertEquals(sistemaATestear.getConversacion(profesionalConversacion.getNombreCompleto(), 
                                                            personaLogueada.getNombreCompleto()), resultadoEsperado.toString());
    }
    
    @Test
    public void testPlanesAtendidosDelUsuarioSinPlanesUsuarioNull(){
        Sistema sistemaATestear = new Sistema();
        String[] resultadoEsperado = {};
        assertArrayEquals(sistemaATestear.planesAtendidosDelUsuario(null), resultadoEsperado);
    }
    
    @Test
    public void testPlanesAtendidosDelUsuarioSinPlanesUsuarioExistente(){
        Sistema sistemaATestear = new Sistema();
        String[] resultadoEsperado = {};
        Usuario stubUsuario = new Usuario("John",null,null,null,null,null,null,null);
        assertArrayEquals(sistemaATestear.planesAtendidosDelUsuario(stubUsuario), resultadoEsperado);
    }
    
    @Test
    public void testPlanesAtendidosDelUsuarioConPlanesAtendidos(){
        Usuario usuario = new Usuario("Martin", null, null, null, null, null, null, null);
        Profesional professional = new Profesional("Ana", null, null, null, null, null, null);
        PlanAlimentacion plan = new PlanAlimentacion("Plan", usuario, professional, true, null);
        ArrayList<PlanAlimentacion> listaPlanesAlimentacion = new ArrayList<>();
        listaPlanesAlimentacion.add(plan);
        Sistema sistemaATestear = new Sistema(null, null, null, listaPlanesAlimentacion, null, null);
        
        String[] resultadoEsperado = {plan.getNombreDelPlan()};
        
        assertArrayEquals(sistemaATestear.planesAtendidosDelUsuario(usuario), resultadoEsperado);
    }
    
    @Test
    public void testPlanesAtendidosDelUsuarioConPlanesNoAtendidos(){
        Usuario usuario = new Usuario("Martin", null, null, null, null, null, null, null);
        Profesional professional = new Profesional("Ana", null, null, null, null, null, null);
        PlanAlimentacion plan = new PlanAlimentacion("Plan", usuario, professional, false, null);
        ArrayList<PlanAlimentacion> listaPlanesAlimentacion = new ArrayList<>();
        listaPlanesAlimentacion.add(plan);
        Sistema sistemaATestear = new Sistema(null, null, null, listaPlanesAlimentacion, null, null);
        
        String[] resultadoEsperado = {};
        
        assertArrayEquals(sistemaATestear.planesAtendidosDelUsuario(usuario), resultadoEsperado);
    }
    
    @Test 
    public void testAtenderSolicitudDelPlanSinExito(){
        Sistema sistemaATestear = new Sistema();
        assertFalse(sistemaATestear.atenderSolicitudDelPlan(null,null,null,null));
    }
    
    @Test 
    public void testAtenderSolicitudDelPlanConExito(){
        Usuario usuario = new Usuario("Martin", null, null, null, null, null, null, null);
        Profesional professional = new Profesional("Ana", null, null, null, null, null, null);
        PlanAlimentacion plan = new PlanAlimentacion("Plan", usuario, professional, false, null);
        ArrayList<PlanAlimentacion> listaPlanesAlimentacion = new ArrayList<>();
        listaPlanesAlimentacion.add(plan);
        Sistema sistemaATestear = new Sistema(null, null, null, listaPlanesAlimentacion, null, null);
        
        String[] resultadoEsperado = {};
        
        assertArrayEquals(sistemaATestear.planesAtendidosDelUsuario(usuario), resultadoEsperado);

        assertTrue(sistemaATestear.atenderSolicitudDelPlan(null,professional,usuario,plan.getNombreDelPlan()));
    }
}
