package dominio;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

public final class PlanAlimentacion implements Serializable {
    private String nombreDelPlan;
    private Usuario usuario;
    private Profesional profesional;
    private boolean fueAtendidoElPlan;
    private String[][] planDiaADia;
    private static final long serialVersionUID = 48L;

    public PlanAlimentacion(String nombrePlan,
            Usuario usuario,
            Profesional profesional,
            boolean fueAtendido,
            String[][] unPlan) {

        setNombreDelPlan(nombrePlan);
        setUsuario(usuario);
        setProfesional(profesional);
        setFueAtendidoElPlan(fueAtendido);
        setPlanDiaADia(unPlan);
    }

    public Persona getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario unUsuario) {
        usuario = unUsuario;
        
    }

    public Profesional getProfesional() {
        return this.profesional;
    }

    public void setProfesional(Profesional unProfesional) {
        if (unProfesional == null) {
            this.profesional = new Profesional(null, null, null, null, null, null, null);
        } else {
            this.profesional = unProfesional;
        }
    }

    public boolean getFueAtendidoElPlan() {
        return fueAtendidoElPlan;
    }

    public void setFueAtendidoElPlan(boolean fueAtendido) {
        this.fueAtendidoElPlan = fueAtendido;
    }

    public String[][] getPlanDiaADia() {
        return Arrays.stream(this.planDiaADia).map(String[]::clone).toArray(String[][]::new);
    }

    public void setPlanDiaADia(String[][] unPlan) {
        String [][] copia = Arrays.stream(unPlan).map(String[]::clone).toArray(String[][]::new);
        this.planDiaADia = copia;
    }

    public String getNombreDelPlan() {
        return this.nombreDelPlan;
    }

    public void setNombreDelPlan(String unNombreDelPlan) {
        nombreDelPlan = unNombreDelPlan;
       
    }

    @Override
    public String toString() {
        return this.getNombreDelPlan();
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof PlanAlimentacion)){
            return false;
        }
        
        PlanAlimentacion otroPlanAlimentacion = (PlanAlimentacion) obj;
        return this.getNombreDelPlan().equals(otroPlanAlimentacion.getNombreDelPlan())
                && this.getUsuario().equals(otroPlanAlimentacion.getUsuario())
                && this.getProfesional().equals(otroPlanAlimentacion.getProfesional());
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.nombreDelPlan);
        hash = 53 * hash + Objects.hashCode(this.usuario);
        hash = 53 * hash + Objects.hashCode(this.profesional);
        return hash;
    }

}
