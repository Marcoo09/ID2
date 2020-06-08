package cargaDeDatos;

import dominio.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;

public class CargadorDatos {
    Sistema sistema;
    List<Alimento> alimentos;
    List<Usuario> usuarios;
    List<Profesional> profesionales;
    
    public CargadorDatos(Sistema unSistema){
        this.sistema = unSistema;
        alimentos = new ArrayList<>();
        usuarios = new ArrayList<>();
        profesionales = new ArrayList<>();
    }
    
    public void cargarSetDatos(){
        cargarAlimentos();
        cargarUsuarios();
        cargarProfesionales();
        cargarConversaciones();
        cargarPlanesAlimentacion();
    }
    
    
    private void cargarUsuarios(){
        cargarUsuarioJuan();
    }
    private void cargarAlimentos(){
        cargarManzana();
        cargarQueso();
    }
    private void cargarProfesionales(){
        cargarProfesionalPedro();
    }
    private void cargarConversaciones(){
        cargarConversacionJuanPedro();
    }
    private void cargarPlanesAlimentacion(){
        cargarPlanDeAlimentacionJuanPedro();
    }
    
    
    //Helpers
    private void cargarManzana(){
        Alimento manzana = crearManzana();
        alimentos.add(manzana);
        sistema.agregarAlimentoALaLista(manzana);
    }
    private void cargarQueso(){
        Alimento queso = crearQueso();
        alimentos.add(queso);
        sistema.agregarAlimentoALaLista(queso);
    }
    private void cargarUsuarioJuan(){
        Usuario juan = crearUsuarioJuan();
        usuarios.add(juan);
        sistema.agregarUsuarioALaLista(juan);
    }
    private void cargarProfesionalPedro(){
        Profesional pedro = crearProfesionalPedro();
        profesionales.add(pedro);
        sistema.agregarProfesionalALaLista(pedro);
    }
    private void cargarConversacionJuanPedro(){
        Usuario juan = crearUsuarioJuan();
        Profesional pedro = crearProfesionalPedro();
        String nombreCompletoJuan = juan.getNombreCompleto();
        String nombreCompletoPedro = pedro.getNombreCompleto();
        
        String mensajeConsulta1 = "Buenas, queria saber si comer papitas engorda";
        String mensajeRespuesta1 = "Recomendamos no comer papitas, tienen mucha grasa"
                + " y en exceso puede engordar facilmente";
        String mensajeConsulta2 = "Claro, y alfajores tampoco?";
        
        this.sistema.crearConversacion(juan, pedro, "CONVERSACION:", true);
        sistema.agregarMensajeConversacion(nombreCompletoJuan, nombreCompletoPedro, 
                mensajeConsulta1, false, false);
        sistema.agregarMensajeConversacion(nombreCompletoPedro, nombreCompletoJuan, 
                mensajeRespuesta1, true, true);
        sistema.agregarMensajeConversacion(nombreCompletoJuan, nombreCompletoPedro, 
                mensajeConsulta2, false, false);
    }
    private void cargarPlanDeAlimentacionJuanPedro(){
        Usuario Juan = crearUsuarioJuan();
        Profesional Pedro = crearProfesionalPedro();
        sistema.agregarPlanSolicitado(Juan, Pedro);
        
        String [][] planAlimentacionAtendido = new String[7][3];
        String nombrePlan = "Dieta a base de queso y manzana";
        //Cargamos los dias en el orden desayuno almuerzo cena
        //Lunes
        planAlimentacionAtendido[0][0] = "Manzana";
        planAlimentacionAtendido[0][1] = "Queso";
        planAlimentacionAtendido[0][2] = "Queso";
        //Martes
        planAlimentacionAtendido[1][0] = "Queso";
        planAlimentacionAtendido[1][1] = "Queso";
        planAlimentacionAtendido[1][2] = "Manzana";
        //Miercoles
        planAlimentacionAtendido[2][0] = "Manzana";
        planAlimentacionAtendido[2][1] = "Manzana";
        planAlimentacionAtendido[2][2] = "Manzana";
        //Jueves
        planAlimentacionAtendido[3][0] = "Queso";
        planAlimentacionAtendido[3][1] = "Queso";
        planAlimentacionAtendido[3][2] = "Queso";
        //Viernes
        planAlimentacionAtendido[4][0] = "Manzana";
        planAlimentacionAtendido[4][1] = "Queso";
        planAlimentacionAtendido[4][2] = "Manzana";
        //Sabado
        planAlimentacionAtendido[5][0] = "Queso";
        planAlimentacionAtendido[5][1] = "Queso";
        planAlimentacionAtendido[5][2] = "Manzana";
        //Domingo
        planAlimentacionAtendido[6][0] = "Manzana";
        planAlimentacionAtendido[6][1] = "Queso";
        planAlimentacionAtendido[6][2] = "Queso";
        
        sistema.atenderSolicitudDelPlan(planAlimentacionAtendido, Pedro, Juan, nombrePlan);
    }
    
    //Creacion de entidades
    private Alimento crearManzana(){
        List<ComposicionAlimento> composicionManzana = new ArrayList<>();
        ComposicionAlimento vitaminasManzana = new ComposicionAlimento("Vitaminas", 6);
        ComposicionAlimento fibrasManzana = new ComposicionAlimento("Fibras", 23);
        ImageIcon fotoManzana = new ImageIcon
            (getClass().getResource("/Imagenes/manzana.png"));
        
        composicionManzana.add(vitaminasManzana);
        composicionManzana.add(fibrasManzana);
        Alimento manzana = new Alimento("Manzana", "Fruta", composicionManzana, fotoManzana);
        
        return manzana;
    }
    private Alimento crearQueso(){
        List<ComposicionAlimento> composicionQueso = new ArrayList<>();
        ComposicionAlimento glucidosQueso = new ComposicionAlimento("Glucidos", 20);
        ComposicionAlimento lipidosQueso = new ComposicionAlimento("Lipidos", 40);
        ImageIcon fotoQueso = new ImageIcon
            (getClass().getResource("/Imagenes/queso.png"));
        
        composicionQueso.add(glucidosQueso);
        composicionQueso.add(lipidosQueso);
        Alimento queso = new Alimento("Queso", "Lacteo", composicionQueso, fotoQueso);
        
        return queso;
    }
    private Usuario crearUsuarioJuan(){
        String nombreJuan = "Juan";
        String apellidoJuan = "Perez";
        String fechaNacimientoJuan = "13/4/1999";
        String nacionalidadJuan = "URUGUAY";
        ImageIcon fotoPerfilJuan = new ImageIcon
            (getClass().getResource("/Imagenes/usuarioJuan.png"));
        List<String> preferenciasJuan = new ArrayList<>();
        List<String> restriccionesJuan = new ArrayList<>();
        List<Ingesta> ingestasJuan = new ArrayList<>();
        
        preferenciasJuan.add("Carnes Rojas");
        preferenciasJuan.add("Verduras");
        restriccionesJuan.add("Intolerante a la lactosa");
        
        Ingesta nuevaIngesta1 = new Ingesta("3/4/2020", alimentos);
        Ingesta nuevaIngesta2 = new Ingesta("3/1/2020", alimentos);
        ingestasJuan.add(nuevaIngesta1);
        ingestasJuan.add(nuevaIngesta2);
        
        Usuario juan = new Usuario(nombreJuan, apellidoJuan, fechaNacimientoJuan, 
                fotoPerfilJuan, nacionalidadJuan, preferenciasJuan, restriccionesJuan, ingestasJuan);
    
        return juan;
    }
    private Profesional crearProfesionalPedro(){
        String nombrePedro = "Pedro";
        String apellidoPedro = "Rodriguez";
        String fechaNacimientoPedro = "27/6/1982";
        String nacionalidadPedro = "ARGENTINA";
        ImageIcon fotoPerfilPedro = new ImageIcon
            (getClass().getResource("/Imagenes/profesionalPedro.png"));
        String tituloPedro = "Ciencia de los alimentos";
        String fechaGraduacionPedro = "20/11/1995";
        String paisGraduacionPedro = "ARGENTINA";
        
        Profesional pedro = new Profesional(nombrePedro, apellidoPedro, 
                fechaNacimientoPedro, fotoPerfilPedro, tituloPedro, fechaGraduacionPedro, 
                paisGraduacionPedro);
        
        return pedro;
    }
}
