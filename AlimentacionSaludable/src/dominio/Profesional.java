package dominio;

import javax.swing.ImageIcon;

public final class Profesional extends Persona {
    private String tituloProfesional;
    private String fechaGraduacion;
    private String paisGraduacion;
    private static final long serialVersionUID = 49L;

    public Profesional(String unNombre,
            String unApellido,
            String unaFechaNacimiento,
            ImageIcon unaFoto,
            String unTitulo,
            String unaFechaGraduacion,
            String unPaisGraduacion) {

        setNombre(unNombre);
        setApellido(unApellido);
        setFechaNacimiento(unaFechaNacimiento);
        setFotoDePerfil(unaFoto);
        setTituloProfesional(unTitulo);
        setFechaGraduacion(unaFechaGraduacion);
        setPaisGraduacion(unPaisGraduacion);
    }

    public String getTituloProfesional() {
        return this.tituloProfesional;
    }

    public void setTituloProfesional(String unTitulo) {
        if (unTitulo == null || unTitulo.isEmpty()) {
            this.tituloProfesional = "Titulo no declarado";
        } else {
            this.tituloProfesional = unTitulo;
        }
    }

    public String getFechaGraduacion() {
        return this.fechaGraduacion;
    }

    public void setFechaGraduacion(String unaFechaGraduacion) {
        if (unaFechaGraduacion == null || unaFechaGraduacion.isEmpty()) {
            this.fechaGraduacion = "Fecha no ingresada";
        } else {
            this.fechaGraduacion = unaFechaGraduacion;
        }
    }

    public String getPaisGraduacion() {
        return this.paisGraduacion;
    }

    public void setPaisGraduacion(String unPaisGraduacion) {
        paisGraduacion = unPaisGraduacion;

    }

    @Override
    public void setFotoDePerfil(ImageIcon foto) {
        if (foto == null) {
            this.fotoDePerfil = new ImageIcon(getClass().getResource("/Imagenes/fotoDeUsuarioStandard.png"));
        } else {
            this.fotoDePerfil = foto;
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
