package dominio;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.swing.ImageIcon;

public final class Alimento implements Serializable {

    private String nombre;
    private String tipoAlimento;
    private List<ComposicionAlimento> listaNutrientesConProporcion;
    private ImageIcon fotoDelAlimento;
    private static final long serialVersionUID = 44L;

    public Alimento(String unNombre,
            String unTipoAlimento,
            List<ComposicionAlimento> listaNutrientes,
            ImageIcon foto) {

        this.setNombre(unNombre);
        this.setTipoAlimento(unTipoAlimento);
        this.setListaNutrientesConProporcion(listaNutrientes);
        this.setFotoDelAlimento(foto);
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String unNombre) {
        if (unNombre == null || unNombre.isEmpty()) {
            this.nombre = "Nombre de alimento no ingresado";
        } else {
            this.nombre = unNombre;
        }
    }

    public String getTipoAlimento() {
        return this.tipoAlimento;
    }

    public void setTipoAlimento(String tipoAlimento) {
        this.tipoAlimento = tipoAlimento;
    }

    public List<ComposicionAlimento> getListaNutrientesConProporcion() {
        return this.listaNutrientesConProporcion;
    }

    public void setListaNutrientesConProporcion(List<ComposicionAlimento> listaNutrientes) {
        this.listaNutrientesConProporcion = listaNutrientes;

    }

    public ImageIcon getFotoDelAlimento() {
        return this.fotoDelAlimento;
    }

    public void setFotoDelAlimento(ImageIcon foto) {
        if (foto == null) {
            this.fotoDelAlimento = new ImageIcon(getClass().getResource("/Imagenes/fotoDelAlimentoEstandar.png"));
        } else {
            this.fotoDelAlimento = foto;
        }
    }

    @Override
    public String toString() {
        return this.getNombre();
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Alimento)) {
            return false;
        }

        Alimento otroAlimento = (Alimento) obj;
        return this.getNombre().equals(otroAlimento.getNombre());
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.nombre);
        return hash;
    }

}
