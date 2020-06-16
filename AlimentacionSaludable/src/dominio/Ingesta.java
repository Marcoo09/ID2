package dominio;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public final class Ingesta implements Serializable {

    private String fechaDeIngesta;
    private List<Alimento> listaAlimentosPorFecha;
    private static final long serialVersionUID = 47L;

    public Ingesta(String fechaIngesta, List<Alimento> listaAlimentos) {
        setFechaDeIngesta(fechaIngesta);
        setListaAlimentosPorFecha(listaAlimentos);
    }

    public String getFechaDeIngesta() {
        return this.fechaDeIngesta;
    }

    public void setFechaDeIngesta(String unaFecha) {
        this.fechaDeIngesta = unaFecha;
    }

    public List<Alimento> getListaAlimentosPorFecha() {
        return this.listaAlimentosPorFecha;
    }

    public void setListaAlimentosPorFecha(List<Alimento> listaAlimentos) {
        this.listaAlimentosPorFecha = listaAlimentos;
    }

    @Override
    public String toString() {
        if (this.listaAlimentosPorFecha.isEmpty()) {
            return "No hay alimentos ingeridos";
        } else {
            return "Lista de alimentos ingeridos" + this.getListaAlimentosPorFecha();
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Ingesta)) {
            return false;
        }

        Ingesta otraIngesta = (Ingesta) obj;
        boolean sonIguales = this.getFechaDeIngesta().equals(otraIngesta.getFechaDeIngesta());
        sonIguales = sonIguales && this.getListaAlimentosPorFecha().equals(otraIngesta.getListaAlimentosPorFecha());
        return sonIguales;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.fechaDeIngesta);
        hash = 83 * hash + Objects.hashCode(this.listaAlimentosPorFecha);
        return hash;
    }

}
